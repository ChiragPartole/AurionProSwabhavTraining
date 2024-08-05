package com.aurionpro.test;

import java.util.Scanner;

public class AddtionOf2Matrices {

	private static int[][] readArray(){
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
		return matrix;
	}
	
	private static void printArray(int[][] matrix,int rows,int cols) {
		System.out.println("Addition of the two arrays: ");
		for(int i=0; i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	private static int[][] addition(int[][] matrix1, int[][] matrix2,int[][] ans) {
		for(int i=0; i<matrix1[0].length;i++) {
			for(int j=0;j<matrix1[1].length;j++) {
				ans[i][j] = matrix1[i][j] +matrix2[i][j];
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix1 = readArray();
		int [][] matrix2 = readArray();
		
		if(matrix1[0].length != matrix2[0].length || matrix1[1].length!=matrix2[1].length) {
			System.out.println("Cannot add the matrices as dimensions are different");
		}else {
			
		int[][] ans = new int[matrix1[0].length][matrix1[1].length];
		
		addition(matrix1,matrix2,ans);
		
		printArray(ans,ans[0].length,ans[1].length);
		}
		

	}

}
