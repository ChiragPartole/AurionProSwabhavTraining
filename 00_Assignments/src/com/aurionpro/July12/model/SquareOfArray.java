package com.aurionpro.July12.model;

import java.util.Scanner;

public class SquareOfArray {
	
	
	private static void sortedArray(int[] array,int size) {
		int left = 0;
		int right = size-1;
		int index = size-1;
		
		int ans[] = new int[size];
		
		while(left<= right) {
			if(array[left]*array[left] >= array[right]*array[right]) {
				ans[index] = array[left]*array[left];
				left++;
			}else {
				ans[index] =  array[right]*array[right];
				right--;
			}
			index--;
		}
		
		System.out.println("The sorted and squared array: ");
		for(int i=0; i<size; i++) {
			System.out.print(ans[i] + " ");
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
		
		sortedArray(array,size);
		
		

	}

}
