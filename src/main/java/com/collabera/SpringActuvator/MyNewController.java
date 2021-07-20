//package com.collabera.SpringActuvator;
//
//import java.util.concurrent.atomic.AtomicLong;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//public class MyNewController {
//
//	private static final String template = "Hello, %s!";
//	private final AtomicLong counter = new AtomicLong();
//
//	@GetMapping("/hello")
//	@ResponseBody
//	public Person sayHello(@RequestParam(name = "name", required = false, defaultValue = "Stranger") 
//	String name) {
//		Person p = new Person();
//
//		p.setId(counter.incrementAndGet());
//		p.setName(toString().format(template, name));
//
//		return p;
//	}
//}
