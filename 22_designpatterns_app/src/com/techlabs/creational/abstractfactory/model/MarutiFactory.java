package com.techlabs.creational.abstractfactory.model;

public class MarutiFactory implements ICarFactory{

	@Override
	public ICar makeCar() {
		return (ICar) new Maruti();
	}
}
