package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/")
	public String simpleHomepage(Model model) {
		
		//ModelAndView
		model.addAttribute("msg","Welcome to Thymeleaf");
		return "index";
	}

}
