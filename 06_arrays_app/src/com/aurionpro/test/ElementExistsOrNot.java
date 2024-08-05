package com.aurionpro.test;

import java.util.Scanner;

public class ElementExistsOrNot {

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
		
		System.out.println("Enter the number you want to check: ");
		int number = scanner.nextInt();
		int flag =0;
		for(int i=0;i<size;i++) {
			
			if(number == array[i]) {
				System.out.println(number+" exists in the array at index "+i);
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println(number+" does not exist in the array");
		}
		
		

	}

}
