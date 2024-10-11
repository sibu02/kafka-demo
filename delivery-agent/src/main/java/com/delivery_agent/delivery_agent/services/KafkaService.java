package com.delivery_agent.delivery_agent.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.delivery_agent.delivery_agent.constants.Const;

@Service
public class KafkaService {
	
	Logger logger = LoggerFactory.getLogger(KafkaService.class);
	@Autowired
	KafkaTemplate<String,String> template;
	
	public boolean updateLocation(String location) {
		template.send(Const.LOCATION_TOPIC_NAME,location);
		logger.info("location updated");
		return true;
	}
}
