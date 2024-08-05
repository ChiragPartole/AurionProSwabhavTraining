package com.techlabs.structural.decorator.model;

public class OilChange extends CarServiceDecorator{

	private ICarService carObj;
	public OilChange(ICarService carObj) {
		super(carObj);
		this.carObj = carObj;
	}
	
	public double getCost()
	{
		return 500 + carObj.getCost();
	}

}
