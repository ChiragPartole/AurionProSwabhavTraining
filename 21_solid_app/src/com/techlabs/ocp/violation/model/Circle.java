package com.techlabs.ocp.violation.model;

public class Circle implements Shape{
	private double radius;

	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	@Override
	public double getArea() {		
		return 3.14*radius*radius;
	}
	
	

}
