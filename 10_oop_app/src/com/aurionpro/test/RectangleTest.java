package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int height;
		int width;
		Scanner scanner = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		
		System.out.println("Enter height: ");
		height =scanner.nextInt();
		rectangle.setHeight(height);
		
		System.out.println("Enter width: ");
		width =scanner.nextInt();
		rectangle.setWidth(width);
		
		System.out.println("Height: "+ rectangle.getHeight());
		System.out.println("Width: "+ rectangle.getWidth());
	
		System.out.println("Area of rectangle: "+ rectangle.area(rectangle.getHeight(), rectangle.getWidth()));
		
		Rectangle rectangle2 = new Rectangle();
		System.out.println("Enter height: ");
		height =scanner.nextInt();
		rectangle2.setHeight(height);
		
		System.out.println("Enter width: ");
		width =scanner.nextInt();
		rectangle2.setWidth(width);

		System.out.println("Height: "+ rectangle2.getHeight());
		System.out.println("Width: "+ rectangle2.getWidth());
	
		System.out.println("Area of rectangle: "+ rectangle2.area(rectangle2.getHeight(), rectangle2.getWidth()));
		

	}

}
