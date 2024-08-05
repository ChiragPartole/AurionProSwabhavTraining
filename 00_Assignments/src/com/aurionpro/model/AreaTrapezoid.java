package com.aurionpro.model;

import java.util.Scanner;

public class AreaTrapezoid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter length of base1: ");
		int base1 = scanner.nextInt();
		
		System.out.println("Enter length of base2: ");
		int base2 = scanner.nextInt();
		
		System.out.println("Enter height: ");
		int height = scanner.nextInt();
		
		double area = ((base1+base2) * height)/2;
		System.out.println("Area is -> "+ area);
}
}