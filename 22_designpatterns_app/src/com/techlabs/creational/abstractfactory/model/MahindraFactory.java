package com.techlabs.creational.abstractfactory.model;

public class MahindraFactory implements ICarFactory{

	@Override
	public ICar makeCar() {
		return (ICar) new Mahindra();
	}

}
