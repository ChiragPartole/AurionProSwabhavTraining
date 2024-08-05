package com.aurionpro.model;

public class RelationalOperators {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		
		System.out.println("number1 > number2: " + (number1 > number2));
        System.out.println("number1 < number2: " + (number1 < number2));
        System.out.println("number1 >= number2: " + (number1 >= number2));
        System.out.println("number1 <= number2: " + (number1 <= number2));
        System.out.println("number1 == number2: " + (number1 == number2));
        System.out.println("number1 != number2: " + (number1 != number2));
        
        if(number1>number2) {
        	System.out.println("number1 is greater than number2");
        }else {
        	System.out.println("number2 is greater than number1");
        }

	}

}
