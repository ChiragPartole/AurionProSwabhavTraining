package com.aurionpro.test;

import java.util.Scanner;

public class MaxElement2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		System.out.println("ENter number of columns");
		int cols = scanner.nextInt();
		
		int[][] matrix = new int[rows][cols];
		
		System.out.println("Enter array elements: ");
		
		for(int i=0; i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		int max =Integer.MIN_VALUE;
		for(int i=0; i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(matrix[i][j] >max){
					max= matrix[i][j];
				}
			}
		}
		System.out.println("Maximum element in the array is: "+max);

	}

}
