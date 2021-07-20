package com.collabera.BeanInjection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller // only of Serving HTML/XML Responses
@RequestMapping("/employee") // Request mapping as a class lvl attribute
public class HtmplPageController {
	@GetMapping("/home")
	public String home() {
		return "index";
	}

	@GetMapping("/home1")
	public String home1() {
		return "index2";
	}
}
