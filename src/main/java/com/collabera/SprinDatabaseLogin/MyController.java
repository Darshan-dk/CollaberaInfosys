package com.collabera.SprinDatabaseLogin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/")
	public String homePage() {
		return "home";
	}

	@GetMapping("/login")
	public String loginPage(Model model) {
		model.addAttribute("User", new User());
		return "login";
	}

	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}

}
