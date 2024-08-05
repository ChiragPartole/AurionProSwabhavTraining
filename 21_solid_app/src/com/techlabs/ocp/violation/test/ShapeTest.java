package com.techlabs.ocp.violation.test;

import com.techlabs.ocp.violation.model.Circle;
import com.techlabs.ocp.violation.model.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(4,7);
		System.out.println(rectangle.getArea());
		
		Circle circle = new Circle(10);
		System.out.println(circle.getArea());

	}

}
