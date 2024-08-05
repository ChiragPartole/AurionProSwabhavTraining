package com.aurionpro.model;

public class FourWheller extends Vehicle{

	private int milage ;

	public FourWheller(String companyName, int milage) {
		super(companyName);
		this.milage = milage;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}
	
	
}
