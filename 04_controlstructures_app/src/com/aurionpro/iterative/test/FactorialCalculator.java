package com.aurionpro.iterative.test;

import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		
		int ans = 1;
		
		for(int i=1; i<=number; i++) {
			ans = ans*i;
		}
		
		System.out.println("Factorial of "+number+ " is "+ans);

	}

}
