package com.aurionpro.iterative.test;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int checker = number;
		int reversed_number =0;
		
		while(number>0) {
			
			reversed_number += number%10;
			reversed_number *=10;
			
			
			number /= 10;
			
		}
		reversed_number /=10;
		if(reversed_number == checker) {
			System.out.println(checker + " is a palindrome");
		}else {
			System.out.println(checker + " is not a palindrome");
		}

	}

}
