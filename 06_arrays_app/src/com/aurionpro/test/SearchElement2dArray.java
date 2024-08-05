package com.aurionpro.test;

import java.util.Scanner;

public class SearchElement2dArray {

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
		
		System.out.println("Enter number you want to search: ");
		int target = scanner.nextInt();
		
		for(int i=0; i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(target == matrix[i][j]) {
					System.out.println(target+ " found at "+ i + " row "+ j+" column");
				}
			}
		}
		

	}

}
