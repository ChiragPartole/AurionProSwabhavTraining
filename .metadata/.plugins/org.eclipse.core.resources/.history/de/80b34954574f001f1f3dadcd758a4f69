package com.techlabs.creational.prototype.model;

public class Bus implements Vehicle{
	private String brand;
	private String model;
	private String color;
	private int numberOfDoors;
	
	
	public Bus(String brand, String model, String color, int numberOfDoors) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.numberOfDoors = numberOfDoors;
	}
	
	
	
	@Override
	public String toString() {
		return "Bus [brand=" + brand + ", model=" + model + ", color=" + color + ", numberOfDoors=" + numberOfDoors
				+ "]";
	}



	private Bus(Bus bus) {
		this.brand = bus.brand;
        this.model = bus.model;
        this.color = bus.color;
        this.numberOfDoors = bus.numberOfDoors;
    }
	 @Override
	    public Bus clone() {
	        return new Bus(this);
	    }
	

}
