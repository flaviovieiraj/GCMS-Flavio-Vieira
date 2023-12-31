package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, world!";
	}
	
	@RequestMapping("/flavio")
	public @ResponseBody String greetingFlavio() {
		return "Hello, Flavio!";
	}
	
	@RequestMapping("/hotfix")
	public @ResponseBody String greetingHotfix() {
		return "hotfix";
	}

}
