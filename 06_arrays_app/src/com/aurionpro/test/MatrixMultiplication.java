package com.aurionpro.test;

import java.util.Scanner;

public class MatrixMultiplication {
	
	private static int[][] readArray(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		System.out.println("Enter number of columns");
		int cols = scanner.nextInt();
		
		int[][] matrix = new int[rows][cols];
		
		System.out.println("Enter array elements: ");
		
		for(int i=0; i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		return matrix;
	}
	
	private static void printArray(int[][] matrix) {
		
		for(int i=0; i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	private static int[][] multiplication(int[][] matrix1, int[][] matrix2,int[][] ans) {
		for(int i=0; i<matrix1.length;i++) {
			for(int j=0;j<matrix2[0].length;j++) {
				for(int k=0; k<matrix2.length; k++) {
					ans[i][j] = ans[i][j] + matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int [][] matrix1 = readArray();
		System.out.println("Matrix1: ");
		printArray(matrix1);
		int [][] matrix2 = readArray();
		System.out.println("Matrix2: ");
		printArray(matrix2);
		if(matrix1[0].length != matrix2.length) {
			System.out.println(matrix1.length + "X" +matrix1[0].length);
			System.out.println(matrix2.length + "X" +matrix2[0].length);
			System.out.println("Multiplication not possible!");
		}else {
			int[][] ans = new int[matrix1.length][matrix2[0].length];
			
			multiplication(matrix1,matrix2,ans);
			System.out.println("Matrix1: ");
			printArray(matrix1);
			System.out.println("Matrix2: ");
			printArray(matrix2);
			System.out.println("Multiplication of the two arrays: ");
			printArray(ans);
		}

	}

}
