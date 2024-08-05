package com.aurionpro.selection.test;

import java.util.Scanner;

public class MaxTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number1: ");
		int number1 = scanner.nextInt();
		
		System.out.println("Enter number2: ");
		int number2 = scanner.nextInt();
		
		if(number1>=number2) {
			System.out.println("Number 1 is greater");
		}else {
			System.out.println("Number 2 is greater");
		}

	}

}
