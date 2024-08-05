package com.aurionpro.model;

public class Car extends FourWheller{

	private int price;

	public Car(String companyName, int milage, int price) {
		super(companyName, milage);
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", Milage=" + getMilage() + ", Company Name=" + getCompanyName() + "]";
	}
	
	
}
