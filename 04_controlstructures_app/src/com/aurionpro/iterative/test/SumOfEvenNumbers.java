package com.aurionpro.iterative.test;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0; 
		int number=1;
		
		while(number<=100) {
			if(number %2 ==0) 
				sum += number;
			
			number++;
		
		}
		
		System.out.println(sum);

	}

}
