package com.cognixia.jump.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Inventory;

@Service
public class ConsumerService {
	
	@KafkaListener(topics = "orders", groupId = "orders_group_id")
	public void consume1(Inventory inventory) {
		
		System.out.println("Consuming order: " + inventory.getOrder());
		
	}

}
