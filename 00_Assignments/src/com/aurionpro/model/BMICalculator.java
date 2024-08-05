package com.aurionpro.model;

import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter weight(in kg): ");
		float weight = scanner.nextFloat();
		System.out.println("Enter height(in meters): ");
		float height = scanner.nextFloat();	
		
		float bmi = weight/(height*height);
		System.out.println("Your BMI is -> "+ bmi);
}
}
