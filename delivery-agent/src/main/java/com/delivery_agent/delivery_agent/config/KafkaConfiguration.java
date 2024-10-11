package com.delivery_agent.delivery_agent.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfiguration {
	
	@Bean
	public NewTopic topic(){
		return TopicBuilder.name("location_update_topic")
				.build();
	}
}
