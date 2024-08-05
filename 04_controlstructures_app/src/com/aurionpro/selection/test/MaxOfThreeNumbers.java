package com.aurionpro.selection.test;

import java.util.Scanner;

public class MaxOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number1: ");
		int number1 = scanner.nextInt();
		
		System.out.println("Enter number2: ");
		int number2 = scanner.nextInt();
		
		System.out.println("Enter number3: ");
		int number3 = scanner.nextInt();
		
		
		if((number1 >number2) && (number1>number3)) {
			System.out.println(number1 +" is the maximum");
		}else if((number2 >number1) && (number2>number3)) {
			System.out.println(number2 +" is the maximum");
		}else {
			System.out.println(number3 +" is the maximum");
		}

	}

}
