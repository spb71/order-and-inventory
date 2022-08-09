package com.cognixia.jump.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Orders implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	private Date datePurchased;
	private String item;
	private int numItemsPurchased;
	
	public Orders() {
		
	}

	public Orders(Integer id, Date datePurchased, String item, int numItemsPurchased) {
		super();
		this.id = id;
		this.datePurchased = datePurchased;
		this.item = item;
		this.numItemsPurchased = numItemsPurchased;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDatePurchased() {
		return datePurchased;
	}

	public void setDatePurchased(Date datePurchased) {
		this.datePurchased = datePurchased;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	public int getNumItemsPurchased() {
		return numItemsPurchased;
	}

	public void setNumItemsPurchased(int numItemsPurchased) {
		this.numItemsPurchased = numItemsPurchased;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", datePurchased=" + datePurchased + ", item=" + item 
				+ ", numItemsPurchased=" + numItemsPurchased + "]";
	}
	
}
