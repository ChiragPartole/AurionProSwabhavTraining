package com.techlabs.creational.abstractfactory.model;

import com.techlabs.creational.abstractfactory.model.ICar;

public class Tata implements ICar {

	@Override
	public void start() {
		System.out.println("Tata car started");
		
	}

	@Override
	public void stop() {
		System.out.println("Tata car stopped");
		
	}
}