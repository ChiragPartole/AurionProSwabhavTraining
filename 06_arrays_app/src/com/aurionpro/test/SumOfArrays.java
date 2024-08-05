package com.aurionpro.test;

import java.util.Scanner;

public class SumOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size of the array: ");
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++) {
			array[i] = scanner.nextInt();
		}
		
		int sum =0;
		for(int i=0; i<size; i++) {
			sum = sum+ array[i];
		}
		System.out.println("The sum is: "+ sum);

	}

}
