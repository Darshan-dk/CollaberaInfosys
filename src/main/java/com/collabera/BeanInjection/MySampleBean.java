package com.collabera.BeanInjection;

import org.springframework.stereotype.Service;

@Service
public class MySampleBean {
	
	public String getDataFromBean() {
		return "This Message from Sample Bean";
	}

}
