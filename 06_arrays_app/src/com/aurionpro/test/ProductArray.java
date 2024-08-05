package com.aurionpro.test;

import java.util.Scanner;

public class ProductArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = readArray(scanner);
		int prod[] = calculateProduct(array);
		displayArray(prod);
	}

	private static int[] calculateProduct(int[] array) {
		int prod[] = new int[array.length];
		int product = 1;
		int indexOfZero = -1;
		boolean secondZeroPresent = false;
		boolean firstZeroPresent = false;
		for(int i=0; i<array.length;i++) {
			if(array[i] ==0)
			{
				indexOfZero = i;
				firstZeroPresent = true;
			}
			else
				product *= array[i];
		}
		
		for(int i=0; i<array.length;i++) {			
			if(array[i] ==0 && i != indexOfZero)
			{
				product =0;
				secondZeroPresent = true;
				break;
			}
		}
		
		for(int i=0; i<array.length;i++) {
			if(secondZeroPresent == true)
				return prod;
			
			if(i != indexOfZero)
				prod[i] = product/array[i];			
		}
		
		if(secondZeroPresent == false && firstZeroPresent == true) {
			for(int i=0; i<array.length;i++) {			
				if(i != indexOfZero)
					prod[i] = 0;			
			}
			prod[indexOfZero] = product;
		}
		
		return prod;
	}



	private static int[] readArray(Scanner scanner) {
		System.out.println("Enter size of the array: ");
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++) {
			array[i] = scanner.nextInt();
		}
		
		return array;
		
	}
	
	private static void displayArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
