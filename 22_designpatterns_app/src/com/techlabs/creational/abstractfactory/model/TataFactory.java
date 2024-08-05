package com.techlabs.creational.abstractfactory.model;

public class TataFactory implements ICarFactory{

	@Override
	public ICar makeCar() {
		return (ICar) new Tata();
	}

}
