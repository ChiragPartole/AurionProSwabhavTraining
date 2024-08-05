package com.aurionpro.July11.model;

import java.util.Scanner;

public class BillCalculator {

	public static void main(String[] args) {
		
		int bill =0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter height: ");
		int height = scanner.nextInt();
		
		if(height <120) {
			System.out.println("Sorry you cannot ride");
		}else {
			System.out.println("Enter age: ");
			int age = scanner.nextInt();
			System.out.println("Do you want photos? (Type yes or no): ");
			String photo = scanner.next();
			if(age<12) {
				bill += 5;
			}else if(age<18) {
				bill += 7;
			}else if(age<45) {
				bill += 12;
			}else if(age<56) {
				bill += 0;
			}else {
				System.out.println("Cannot ride");
			}
			switch(photo) {
			case "yes" : bill += 3;
			break;
			case "no" : bill +=0;
			break;
			default : System.out.println("Enter correct answer for photos question, Retry");
			bill =0;
			break;
			}
			System.out.println("Your bill is: $"+bill);
		}

	}

}
