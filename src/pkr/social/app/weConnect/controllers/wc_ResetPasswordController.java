package pkr.social.app.weConnect.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class wc_ResetPasswordController {

	@RequestMapping(value="/resetPassword.do",method=RequestMethod.GET)
	public String _NavigateToResetPassword(){
		
		return "wc.ResetPassword";
	}
}
