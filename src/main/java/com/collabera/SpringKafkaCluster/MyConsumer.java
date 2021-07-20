package com.collabera.SpringKafkaCluster;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MyConsumer {
	
	@KafkaListener(topics = "MyKafkaTopic", groupId = "mygroup")
	public void consumerFromTopic(String msg) {
		System.out.println("This msg from consumer "+msg);
	}
}
