package com.aurionpro.iterative.test;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number= scanner.nextInt();
		int sum=0;
		
		while(number>0) {
			int digit = number%10;
			number /=10;
			sum += digit;
			
		}
		System.out.println(sum);

	}

}
