package com.aurionpro.July12.model;

import java.util.Scanner;

public class PeakElement {

	private static void peakNumbers(int[] array,int size) {
		
		if(size==0) {
			System.out.println("Array is empty");
		}
		if(size==1) {
			System.out.println("Array only has one element: "+array[1]);
		}
		if(array[0]>=array[1]) {
			System.out.println(array[0] + " is a peak element");
		}
		
		for(int i=1; i<size-1; i++) {
			if(array[i]>=array[i+1] && array[i]>=array[i-1]) {
				System.out.println(array[i] + " is a peak element");
			}
		}
		
		if(array[size-1]>=array[size-2]) {
			System.out.println(array[size-1] + " is a peak element");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		System.out.println("Enter elements of the array");
		for(int i=0; i<size; i++) {
			array[i] = scanner.nextInt();
		}
		
		peakNumbers(array,size);
		
		}

	}


