package com.cognixia.jump.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognixia.jump.model.Orders;
import com.cognixia.jump.service.OrderService;

public class OrderController {

	@Autowired
	OrderService service;
	
	@PostMapping("/orders")
	public Orders getOrders(@RequestParam Integer id, Date datePurchased, String itemPurchased, int numPurchased) {
		Orders order = new Orders(id, datePurchased, itemPurchased, numPurchased);
		
		service.produce(order);
		
		return order;
	}
	
}
