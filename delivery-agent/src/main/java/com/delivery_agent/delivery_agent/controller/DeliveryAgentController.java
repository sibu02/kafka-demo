package com.delivery_agent.delivery_agent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery_agent.delivery_agent.services.KafkaService;

@RestController
@RequestMapping("/deliveryAgent")
public class DeliveryAgentController {
	
	@Autowired
	KafkaService kafkaService;
	
	@PostMapping("/locationUpdate")
	public ResponseEntity<String> updateLocation(){
		String newLocation = "("+Math.round(Math.random()*100)+","+Math.round(Math.random()*100)+")";
		kafkaService.updateLocation(newLocation);
		return new ResponseEntity<>("Location updated",HttpStatus.ACCEPTED);
	}

}
