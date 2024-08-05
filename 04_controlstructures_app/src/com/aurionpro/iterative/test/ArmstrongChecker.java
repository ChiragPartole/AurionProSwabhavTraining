package com.aurionpro.iterative.test;

import java.util.Scanner;

public class ArmstrongChecker {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number= scanner.nextInt();
		int checker = number;
		int sum=0;
		
		int power =0;
		
		while(number>0) {
			power++;
			number /=10;
		}
		number = checker;
		
		while(number>0) {
			int digit = number%10;
		
			number /=10;
			sum = sum+ (int)Math.pow(digit, power);
			
		}
		
		if(sum == checker) {
			System.out.println(checker+ " is Armstrong's number");
		}else {
			System.out.println(checker+ " is not Armstrong's number");
		}

	}

}