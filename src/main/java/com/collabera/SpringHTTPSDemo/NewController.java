package com.collabera.SpringHTTPSDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class NewController {
	
	@GetMapping("/world")
	public String greeting() {
		return "This is an Secured End point";
	}
}
