package com.cognixia.jump.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Orders;
import com.cognixia.jump.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private KafkaTemplate<String, Orders> kafkaTemplate;
	
	@Autowired
	private OrderRepository repo;
	
	public void produce(Orders orders) {
		
		System.out.println("Producing order: " + orders);
		
		kafkaTemplate.send("orders", orders);
		
		repo.save(orders);
	}
	
}
