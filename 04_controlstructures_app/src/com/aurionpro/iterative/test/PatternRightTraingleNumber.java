package com.aurionpro.iterative.test;

import java.util.Scanner;

public class PatternRightTraingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int counter =1;
		
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" "+counter+" ");
				counter++;
			}
			System.out.println();
		}
		
	
		

	}

}