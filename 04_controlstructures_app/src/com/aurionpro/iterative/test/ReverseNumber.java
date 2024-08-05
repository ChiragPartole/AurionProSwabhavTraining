package com.aurionpro.iterative.test;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int reversed_number =0;
		
		
		while(number>0) {
			
			int digit = number%10;
			reversed_number = reversed_number*10 + digit;
			
			
			number /= 10;
			
		}
	
		System.out.println(reversed_number);

	}

}
