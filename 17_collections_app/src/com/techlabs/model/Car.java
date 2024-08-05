package com.techlabs.model;

public class Car {

	private int carId;
	private String carName;
	private double price;
	private double mileage;
	public Car(int carId, String carName, double price, double mileage) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.price = price;
		this.mileage = mileage;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", price=" + price + ", mileage=" + mileage + "]";
	}
	
	
}
