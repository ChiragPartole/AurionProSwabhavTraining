package com.aurionpro.model;


public class SwapperCommandArg {
public static void main(String[] args) {
		
	
		int number1 =Integer.parseInt(args[0]);
		int number2 =Integer.parseInt(args[1]);
		
		System.out.println("Before Swapping");
		System.out.println("Number1: "+number1+" Number2: "+number2);
		
		number1 = number1+number2;
		number2 = number1 -number2;
		number1 = number1-number2;
		
		System.out.println("After Swapping");
		System.out.println("Number1: "+number1+" Number2: "+number2);
		// TODO Auto-generated method stub

	}

}

