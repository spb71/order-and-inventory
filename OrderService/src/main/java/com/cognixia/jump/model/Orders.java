package com.cognixia.jump.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private Date datePurchased;
	
	@Column
	private String itemPurchased;
	
	@Column
	private int numPurchased;
	
	public Orders() {
		
	}

	public Orders(Integer id, Date datePurchased, String itemPurchased, int numPurchased) {
		super();
		this.id = id;
		this.datePurchased = datePurchased;
		this.itemPurchased = itemPurchased;
		this.numPurchased = numPurchased;
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

	public String getItemPurchased() {
		return itemPurchased;
	}

	public void setItemPurchased(String itemPurchased) {
		this.itemPurchased = itemPurchased;
	}

	public int getNumPurchased() {
		return numPurchased;
	}

	public void setNumPurchased(int numPurchased) {
		this.numPurchased = numPurchased;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", datePurchased=" + datePurchased + ", itemPurchased=" + itemPurchased
				+ ", numPurchased=" + numPurchased + "]";
	}
	
}
