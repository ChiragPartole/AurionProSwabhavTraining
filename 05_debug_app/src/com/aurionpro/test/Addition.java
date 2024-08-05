package com.aurionpro.test;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Addition {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		byte num1 = 10;
		
		byte num2 = 10;
		
		
		int add = addition(num1,num2);
		int sub = subtraction(num1,num2);
		int multiply = multiplication(num1,num2);
		int divide = division(num1,num2);
		System.out.println(add);
		System.out.println(sub);
		System.out.println(multiply);
		System.out.println(divide);
		
		
	}
	private static int addition(int num1, int num2) {
		System.out.println("addition is called");
		return num1+num2;
	}
	private static int subtraction(int num1, int num2) {
		System.out.println("subtraction is called");
		return num1 -num2;
	}
	private static int multiplication(int num1, int num2) {
		
		System.out.println("multiplication is called");
		return num1 *num2;
	}

	private static int division(int num1, int num2) {
		System.out.println("division is called");
		return num1 /num2;
	}


}
