package com.collabera.SprinDatabaseAuthentication;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/principal")
public class UserController {

	@GetMapping("")
	public Principal retievePrincipal(Principal p) {
		
		return p;
	}
	
	@GetMapping("/")
	public String hometURL() {
		return "This is from HOME URL";
	}
	
	@GetMapping("/guest")
	public String guestURL() {
		return "This is from Guest URL";
	}
	@GetMapping("/admin")
	public String adminURL() {
		return "This is from ADMIN URL";
	}
	
}
