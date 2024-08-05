package com.aurionpro.iterative.test;

import java.util.Scanner;

public class PerfectNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int checker =number/2;
		int sum =0;
		
		while(checker>0) {
			if(number%checker ==0) {
				sum = sum+checker;
			}
			checker--;
		}
		if(sum == number) {
			System.out.println(number +" is a perfect number");
		}else {
			System.out.println(number +" is not a perfect number");
		}
		

	}

}
