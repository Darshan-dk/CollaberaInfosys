package com.collabera.SpringBootKafakaConnection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyrestController {
	@Autowired
	private KafkaTemplate< String, String> kafkaTemplate;
	
	@GetMapping("/")
	public String sendMessage(@RequestParam("topic") String topic, 
			@RequestParam("message") String msg) {
		System.out.println(topic);
		System.out.println(msg);
		kafkaTemplate.send(topic, msg);
		return "Message has been Successfully Sent";
	}
}

