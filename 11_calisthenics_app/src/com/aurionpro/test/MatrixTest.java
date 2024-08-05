package com.aurionpro.test;

import java.util.Scanner;

public class MatrixTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		int[][] matrix = new int[3][3];
		
		System.out.println("Enter matrix elements:");
		createRows(matrix,scanner);
		
		printMatrix(matrix);

	}
	
	private static void createRows(int matrix[][], Scanner scanner) {
		for(int i=0;i<matrix.length;i++) {
			readRowElements(matrix, scanner , i);
		}
	}
	
	private static void readRowElements(int [][] matrix, Scanner scanner, int row) {
		for(int j=0; j<matrix[0].length; j++) {
			
			matrix[row][j] = scanner.nextInt();
		}
	}
	
	private static void printMatrix(int matrix[][]) {
		for(int i=0;i<matrix.length;i++) {
			printRowElements(matrix , i);
		}
	}
	private static void printRowElements(int [][] matrix, int row) {
		for(int j=0; j<matrix[0].length; j++) {
			System.out.print(matrix[row][j]);
		}
		System.out.println();
	}
	

}
