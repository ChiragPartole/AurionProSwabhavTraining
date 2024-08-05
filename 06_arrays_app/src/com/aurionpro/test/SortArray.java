package com.aurionpro.test;

import java.util.Scanner;

public class SortArray {

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
		
		
		for(int i=0;i<size;i++) {
			for(int j =0; j<size-i-1; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i=0;i<size; i++) {
			System.out.print(array[i]);
		}

	}

}
