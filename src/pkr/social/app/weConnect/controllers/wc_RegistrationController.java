package pkr.social.app.weConnect.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import pkr.social.app.weConnect.Model.IService.IValidateAadharUser;
import pkr.social.app.weConnect.Model.ServiceImpl.FileUploadService;
import pkr.social.app.weConnect.Model.ServiceImpl.QR_CodeReaderService;

@Controller
@RequestMapping("/")
public class wc_RegistrationController {

	@Autowired
	private FileUploadService _fileUploadService;
	@Autowired
	private QR_CodeReaderService _qrCodeReader;
	@Autowired
	private IValidateAadharUser validateAadharUser;

	@RequestMapping(value = "/verifyValidAadharUser.do", method = RequestMethod.POST, headers = "Accept=*/*")
	public @ResponseBody String _validateAadharUser(@RequestParam("aadharCard") List<MultipartFile> aadharCard,
			HttpServletRequest httpServletRequest, Model model) throws Exception {
		Map<String, String> _aadharKeyValuePair;
		String status = "false";
		for (MultipartFile multipartFile : aadharCard) {

			_fileUploadService._uploadFileService(multipartFile);
			_aadharKeyValuePair = _qrCodeReader.getAadhaarDetails(multipartFile.getOriginalFilename());
			if (validateAadharUser.validateAadhaarUser(_aadharKeyValuePair.get("uid"))) {
				status = "true";
			}

		}

		return status;
	}
}
