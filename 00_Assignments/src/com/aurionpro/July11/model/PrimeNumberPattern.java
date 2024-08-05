package com.aurionpro.July11.model;
import java.util.Scanner;
public class PrimeNumberPattern {
	public static boolean PrimeChecker(int number) {
		for(int i=2; i<=number/2; i++) {
			if(number%i ==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		int counter =2;
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i; j++) {
				while(PrimeChecker(counter) == false) {
					counter++;
				}
				System.out.print(" "+counter+" ");
				counter++;			
			}
			System.out.println();
		}
	}
}
