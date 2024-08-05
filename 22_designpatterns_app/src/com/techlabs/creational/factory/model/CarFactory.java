package com.techlabs.creational.factory.model;

public class CarFactory {
	
	public static ICar makeCar(CarNames carName)
	{
		ICar car = null;
		if(carName == CarNames.Maruti)
			car = new Maruti();
		if(carName == CarNames.Tata)
			car = new Tata();
		if(carName == CarNames.Mahindra)
			car = new Mahindra();
		
		return car;
	}

}
