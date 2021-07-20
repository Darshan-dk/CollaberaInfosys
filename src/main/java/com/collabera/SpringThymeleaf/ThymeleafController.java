package com.collabera.SpringThymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {
	
	@RequestMapping("/")
	public String welcome(Model m) {
		m.addAttribute("myobj", "Darshan");
		
		List<Book> books = new ArrayList<>();
		Book b1=new Book();
		b1.setAuthor("DEE");
		b1.setId(1);
		b1.setName("Mobile Application Development");
	
		
		Book b2=new Book();
		b2.setAuthor("Darshan");
		b2.setId(2);
		b2.setName("Machine Learning using Python");
		
		books.add(b1);
		books.add(b2);
		
		m.addAttribute("mybooks", books);	

		return "index";
	}

	@RequestMapping("/home")
	private String homePage() {
		return "home";
	}

	@RequestMapping("/index")
	private String indexPage() {
		return "index1";
	}

}



