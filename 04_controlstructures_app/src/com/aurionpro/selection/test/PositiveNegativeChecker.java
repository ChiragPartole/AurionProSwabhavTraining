package com.aurionpro.selection.test;

import java.util.Scanner;

public class PositiveNegativeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int number = scanner.nextInt();
		
		if(number ==0) {
			System.out.println("Number is 0");
		}
		if(number>0) {
			System.out.println("number is postive");
		}else {
			System.out.println("NUmber is negative");
		}

	}

}
