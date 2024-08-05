package com.aurionpro.test;
import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = readArray(scanner);
		System.out.println("Second largest element is: "+ displaySecondLargest(array));
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

	private static int displaySecondLargest(int[] array) {
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for(int i=0; i<array.length; i++) {
			if(array[i] > largest)
			{
				secondLargest =largest;
				largest = array[i];
			}
			if(array[i] <largest && array[i] > secondLargest) {
				secondLargest = array[i];
			}
		}
		
		return secondLargest;
	}
}
