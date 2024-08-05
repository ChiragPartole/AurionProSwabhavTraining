package com.aurionpro.model;

import java.util.Scanner;

public class Swapper1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number");
		int number1 =scanner.nextInt();
		System.out.println("Enter second number");
		int number2 =scanner.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println("Number1: "+number1+" num2: "+number2);
		
		int temp =number1;
		number1=number2;
		number2= temp;
		
		System.out.println("After Swapping");
		System.out.println("Number1: "+number1+" num2: "+number2);
		// TODO Auto-generated method stub

	}

}
