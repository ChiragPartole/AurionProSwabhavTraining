package com.aurionpro.July11.model;

import java.util.Scanner;

public class AtmSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your balance");		
		int balance = scanner.nextInt();
		
		boolean exit = false;
		
		do {
			System.out.println("ATM Menu: \n1. Check Balance \n2. Deposit Money "
					+ "\n3. Withdraw Money \n4. Exit");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1: System.out.println("Your current balance is: "+ balance);break;
			case 2: 
				System.out.println("Enter amount to deposit: "); 
				int deposit = scanner.nextInt();
				balance = balance + deposit;
				System.out.println("You have deposited $"+deposit+". \nYour new balance is $"+balance);
				break;
			case 3:
				System.out.println("Enter amount to withdraw: ");
				int withdraw = scanner.nextInt();
				if(withdraw >balance) {
					System.out.println("Withdraw exceeds balance");
					withdraw =0;
				}
				balance = balance- withdraw;
				System.out.println("You have withdrawn $"+withdraw+". \n Your new balance is $"+balance);
				break;
			case 4: exit =true; break;
			default:
				System.out.println("Invalid input. Please select correct option");
			}
		}
		while(exit == false);
		
		
		if(exit == true) {
			System.out.println("Thank you for using the ATM. Goodbye!");
		}
		

	}

}
