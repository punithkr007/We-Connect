package pkr.social.app.weConnect.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class wc_LoginController {

	@RequestMapping(value="/wc-login.do",method=RequestMethod.POST)
	public String _HomePage(){
	return "wc.Dashboard";	
	}
	
}
