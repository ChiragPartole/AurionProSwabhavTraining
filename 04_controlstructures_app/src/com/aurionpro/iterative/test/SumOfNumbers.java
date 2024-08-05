package com.aurionpro.iterative.test;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int number=1;
		
		while(number <=100) {
			sum +=number;
			number++;
		}
		System.out.println("sum of first 100 numbers: "+sum);

	}
}
