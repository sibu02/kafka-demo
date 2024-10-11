package com.kafka_demo.kafka_demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.kafka_demo.kafka_demo.constant.Constants;

@Configuration
public class KafkaConfiguration {
	
	@KafkaListener(topics = Constants.LOCATION_UPDATE_TOPIC,groupId = Constants.GROUP_ID)
	public void updateLocation(String value) {
		System.out.println("location ---->"+value);
	}
}
