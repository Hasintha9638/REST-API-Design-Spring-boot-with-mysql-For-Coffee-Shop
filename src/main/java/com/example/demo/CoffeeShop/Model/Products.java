package com.example.demo.CoffeeShop.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="coffee_name")
	private String product_name;
	
	@Column(name="coffee_desc")
	private String product_desc;
	
	@Column(name="coffee_price")
	double price;
	
	
	
	public Products() {
		super();
	}
	
	
	public Products(int id, String product_name, String product_desc, double price) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.product_desc = product_desc;
		this.price = price;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_desc() {
		return product_desc;
	}
	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Products [id=" + id + ", product_name=" + product_name + ", product_desc=" + product_desc + ", price="
				+ price + "]";
	}
	
	
	
	
	

}
