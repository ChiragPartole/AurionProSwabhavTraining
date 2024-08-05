package com.aurionpro.test;

import java.util.Scanner;

public class MaxElementArray {

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
		
		int max =0;
		
		for(int i=0; i<size-1; i++) {
			if(array[i]>array[i+1]) {
				max = array[i];
			}
		}
		System.out.println("Maximum element is: "+max);

	}

}
