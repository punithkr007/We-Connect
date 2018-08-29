package pkr.social.app.weConnect.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import pkr.social.app.weConnect.Entitlies.wc_UserEntity;
import pkr.social.app.weConnect.Model.IService.IValidateAadharUser;
import pkr.social.app.weConnect.Model.ServiceImpl.QR_CodeReaderService;

@Controller
@RequestMapping("/")
public class wc_RegistrationController {

	@Autowired
	private QR_CodeReaderService _qrCodeReader;
	@Autowired
	private IValidateAadharUser validateAadharUser;

	private static final Logger logger = Logger.getLogger(wc_RegistrationController.class);

	@RequestMapping(value = "/validateRegistrationEmail.do", method = RequestMethod.POST, headers = { "Accept=*/*" })
	public @ResponseBody String _validateRegistrationEmail(@RequestParam("email") String Email,@RequestParam("phoneNumber") String phoneNumber) {
		return null;
	}

	@RequestMapping(value = "/verifyValidAadharUser.do", method = RequestMethod.POST, headers = "Accept=*/*")
	public @ResponseBody String _validateAadharUser(@RequestParam("aadharCard") List<MultipartFile> aadharCard,
			HttpServletRequest httpServletRequest, Model model) throws Exception {
		logger.info("[USER REGISTRATION CONTROLLER ][ AADHAAR CARD VALIDATION ]");
		wc_UserEntity wc_UserEntity = null;
		String status = "false";
		for (MultipartFile multipartFile : aadharCard) {
			wc_UserEntity = _qrCodeReader.getAadhaarDetails(multipartFile);
			if (validateAadharUser._validateAadhaarUser(wc_UserEntity.getUid())) {
				status = "true";
			}
		}
		return status;
	}
}
