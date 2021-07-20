package com.collabera.ValluesFromApllicationProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Class Level
public class PropertiesValueInjection {

	@Value("${author.phone}")
	private String phone;
	
//	@value annotation can be a class level and Method Level
	//$ symbol represent access values from class path
	

	@GetMapping("/")  //Method Level
	public String greeting(@Value("${author.name}") String authName) {
		return authName + " Welcome To Apllication.Property Value Fetching" + " ContactNumber =" + phone;
	}

}
