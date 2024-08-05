package com.techlabs.ocp.violation.model;

public class Rectangle implements Shape {

	private int width;
	private int height;
	
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}


	public double getArea()
	{
		return width*height;
	}
}
