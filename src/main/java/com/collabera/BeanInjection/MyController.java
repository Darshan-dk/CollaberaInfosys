package com.collabera.BeanInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	private MySampleBean msb;

	@RequestMapping(name = "/", method = RequestMethod.GET)
	public String testing() {

		return "Autowiring from Get method " + msb.getDataFromBean();
	}

	@RequestMapping(name = "/", method = RequestMethod.POST) // Jersy Techniques
	public String testing1() {
		return "Sample Controller with post mapping " + msb.getDataFromBean();
	}

	@RequestMapping(name = "/", method = RequestMethod.PUT) // Jersy Techniques
	public String putMapping() {
		return "Sample Controller with PUT mapping " + msb.getDataFromBean();
	}

	@RequestMapping(name = "/", method = RequestMethod.DELETE) // Jersy Techniques
	public String getMapping() {
		return "Sample Controller with DELETE mapping " + msb.getDataFromBean();
	}

	@RequestMapping("/{autname}")
	public String PathvariableTest(@PathVariable String autname) {
		return "Welcome " + autname;
	}

	@RequestMapping("/demo/{authId}")
	public String PathvariableTest2(@PathVariable int authId) {
		return "Welcome " + authId;
	}

}
