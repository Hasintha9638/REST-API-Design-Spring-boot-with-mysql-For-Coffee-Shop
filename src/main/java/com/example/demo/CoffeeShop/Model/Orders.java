package com.example.demo.CoffeeShop.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="customer_name")
	private String customer_name;
	
	@Column(name="customer_address")
	private String customer_address;
	
	@Column(name="customer_tel")
	private String customer_tel;
	
	@Column(name="item_id")
	private int item_id;
	
	@Column(name="qty")
	private int qty;
	
	
	

	public Orders() {
		super();
	}

	public Orders(int id, String customer_name, String customer_address, String customer_tel, int item_id, int qty) {
		super();
		this.id = id;
		this.customer_name = customer_name;
		this.customer_address = customer_address;
		this.customer_tel = customer_tel;
		this.item_id = item_id;
		this.qty = qty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	public String getCustomer_tel() {
		return customer_tel;
	}

	public void setCustomer_tel(String customer_tel) {
		this.customer_tel = customer_tel;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", customer_name=" + customer_name + ", customer_address=" + customer_address
				+ ", customer_tel=" + customer_tel + ", item_id=" + item_id + ", qty=" + qty + "]";
	}
	
	
	
	

}
