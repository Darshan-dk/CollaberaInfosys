package com.collabera.SprinBootSecurityDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstSpringSecurityController {
	
	@GetMapping("/")
	public String GeetingToSpringSecurity() {
		return "Welcome to Security";
	}

}
