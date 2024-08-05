package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Box;

public class BoxText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Box box = new Box();  //default constructer
		
		System.out.println("Box");
		
		System.out.println("Height: "+ box.getHeight());
		System.out.println("Width: "+ box.getWidth());
		System.out.println("Depth: "+ box.getDepth());
	
		box.setHeight(10);
		box.setWidth(11);
		box.setDepth(12);
		System.out.println("Height: "+ box.getHeight());
		System.out.println("Width: "+ box.getWidth());
		System.out.println("Depth: "+ box.getDepth());
		
		
		
		
		
		System.out.println("Box2");
		
		System.out.println("Enter Height: ");
		int height = scanner.nextInt();
		System.out.println("Width: ");
		int width = scanner.nextInt();
		System.out.println("Depth: ");
		int depth = scanner.nextInt();
		
		Box box2 = new Box(height,width,depth); //parameterized constructer
		
		System.out.println("Height: "+ box2.getHeight());
		System.out.println("Width: "+ box2.getWidth());
		System.out.println("Depth: "+ box2.getDepth());
	}

}
