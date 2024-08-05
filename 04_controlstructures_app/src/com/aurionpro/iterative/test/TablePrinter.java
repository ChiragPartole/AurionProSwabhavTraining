package com.aurionpro.iterative.test;

import java.util.Scanner;

public abstract class TablePrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(number + "*" + i + "=" + number*i);
		}

	}

}
