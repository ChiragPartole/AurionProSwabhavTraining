package com.aurionpro.model;

public class AssignmentOperators {

	public static void main(String[] args) {

		int number1 = 16;
        System.out.println("number1 += 4: " + (number1 += 3));
        System.out.println("number1 -= 4: " + (number1 -= 2));
        System.out.println("number1 *= 4: " + (number1 *= 4));
        System.out.println("number1 /= 4: " + (number1 /= 3));
        System.out.println("number1 %= 4: " + (number1 %= 4));
        
    }
}