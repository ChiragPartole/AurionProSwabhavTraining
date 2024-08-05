package com.aurionpro.iterative.test;

import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int checker = number/2;
		int prime_checker =0;
		
		if(number ==1)
			System.out.println("1 is neither prime nor composite");
		
		
		
		while(checker >2) {
			if(number % checker ==0) {
				prime_checker ++;
				break;
			}
			checker--;
		}
		
		if(prime_checker >0)
			System.out.println(number +" is not prime");
		else	
			System.out.println(number +" is prime");

	}

}
