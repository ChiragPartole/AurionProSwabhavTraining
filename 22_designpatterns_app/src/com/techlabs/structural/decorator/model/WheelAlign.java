package com.techlabs.structural.decorator.model;

public class WheelAlign extends CarServiceDecorator{

	private ICarService carObj;
	public WheelAlign(ICarService carObj) {
		super(carObj);
		this.carObj = carObj;
	}
	
	public double getCost()
	{
		return 500 + carObj.getCost();
	}
}
