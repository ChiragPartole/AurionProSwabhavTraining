package com.aurionpro.model;

import java.util.Scanner;

public class DistanceCalculator {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter x1: ");
		double x1 = scanner.nextDouble();
		
		System.out.println("Enter y1: ");
		double y1 = scanner.nextDouble();
		
		System.out.println("Enter x2: ");
		double x2 = scanner.nextDouble();
		
		System.out.println("Enter y2: ");
		double y2 = scanner.nextDouble();	
		
		double distance = Math.sqrt((y2-y1)*(y2-y1) + (x2-x1)*(x2-x1));
		System.out.println("Distance is -> "+ distance);
}
}
