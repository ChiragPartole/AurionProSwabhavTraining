package com.aurionpro.test;

import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ENter number:");
		int number = scanner.nextInt();
		
		int factorial = calculateFactorial(number);
		if(factorial == -1) {
			System.out.println("Cannot process factorial of negative number");
			return;
		}
		
		System.out.println("Factorial of "+ number+" is: "+factorial);

	}

	private static int calculateFactorial(int number) {
		// TODO Auto-generated method stub
		if(number ==0)
		return 1;
		if(number <0)
			return -1;
		int fact =1;
		for(int i=1; i<=number;i++) {
			fact = fact* i;
		}
		return fact;
	}
	

}
