package com.aurionpro.model;

public class UnaryOperators {

	public static void main(String[] args) {
		
		int number1 = 10;
        int number2 = 10;

        System.out.println("Postincrement : " + (number1++));
        System.out.println("Preincrement : " + (++number1));
        System.out.println("Postdecrement : " + (number2--));
        System.out.println("Predecrement : " + (--number2));

    }
}