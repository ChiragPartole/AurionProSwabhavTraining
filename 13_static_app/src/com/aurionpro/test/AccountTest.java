package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many account to create: ");
		int numberOfAccounts = scanner.nextInt();
		Account accounts[]= new Account[numberOfAccounts];
		
		for(int i=0; i<numberOfAccounts; i++) {
			System.out.println("Enter id: ");
			int id = scanner.nextInt();
			accounts[i] = new Account(id);
		}
		
		for(Account  account : accounts) {
			account.display();
		}

	}

}
