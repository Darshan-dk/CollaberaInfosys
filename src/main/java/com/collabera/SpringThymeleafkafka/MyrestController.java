package com.collabera.SpringThymeleafkafka;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyrestController {

	@GetMapping("/")
	public String welcomePage() {
		return "welcome";
	}


	@PostMapping(path="/messaging")
	public String submitMessage(@ModelAttribute MessageClass mc, Model model) {
		System.out.println("From post method");
		model.addAttribute("mc", mc);
		return "success";
		
	}


	
	

}
