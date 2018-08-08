package pkr.social.app.weConnect.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class wc_LandingPageController {
	@RequestMapping(value = "/")
	public String _LandingPageHandler() {
		return "wc.Landingpage";
	}
	
}
