package com.cognixia.jump.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inventory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String itemName;
	
	@Column
	private double price;
	
	@Column
	private int numItemsAvailable;
	
	@Column
	private Orders order;
	
	public Inventory() {
		
	}

	public Inventory(Integer id, String itemName, double price, int numItemsAvailable, Orders order) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.price = price;
		this.numItemsAvailable = numItemsAvailable;
		this.order = order;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumItemsAvailable() {
		return numItemsAvailable;
	}

	public void setNumItemsAvailable(int numItemsAvailable) {
		this.numItemsAvailable = numItemsAvailable;
	}
	
	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", itemName=" + itemName + ", price=" + price + ", numItemsAvailable="
				+ numItemsAvailable + ", order=" + order + "]";
	}

	
	

}
