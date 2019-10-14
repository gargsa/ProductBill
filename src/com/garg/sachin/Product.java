package com.garg.sachin;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="prodObj")
@SessionScoped
public class Product {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String add()
	{
		System.out.println("Prouct Inserted...");
		System.out.println("name" + " " + name + " " + "qty" + " " + qty 
				+ " " + "price" + " " + price);
		
		if (qty > 10)
			return "fail";
		return "success";
	}
	private String name;
	private int qty;
	private double price;
}
