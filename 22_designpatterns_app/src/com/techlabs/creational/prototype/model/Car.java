package com.techlabs.creational.prototype.model;

public class Car implements Vehicle{
	
	private  String brand;
	private  String model;
	private  String color;
	private int topSpeed;
	
	
	public Car(String brand, String model, String color, int topSpeed) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.topSpeed = topSpeed;
	}
	
	

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", topSpeed=" + topSpeed + "]";
	}



	private Car(Car car) {
		this.brand = car.brand;
        this.model = car.model;
        this.color = car.color;
        this.topSpeed = car.topSpeed;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}
