package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Shape;
import com.aurionpro.model.Triangle;

public class ShapeTest {

	public static void main(String[] args) {


		Shape shape;
		
		shape = new Circle(10);
		shape.area();
		
		shape = new Rectangle(10,20);
		shape.area();
		
		shape = new Triangle(10,20);
		shape.area();
		
		final int[] array = {10,20,30};
		
		array[2] = 50;
		System.out.println(array[2]);

	}

}
