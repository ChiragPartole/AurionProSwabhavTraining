package com.techlabs.structural.adapter.model;

public class Chocolate implements IItems{
	
	private String name;
	private double price;
	
	

	public Chocolate(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public String getItemName() {
		return (name);
		
	}

	@Override
	public double getItemPrice() {
		return price;
		
	}

}
