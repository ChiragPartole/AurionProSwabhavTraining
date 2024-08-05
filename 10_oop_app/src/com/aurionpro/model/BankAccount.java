package com.aurionpro.model;

import java.util.Random;

public class BankAccount {

	private long accountNumber;
	private String name;
	private int balance;
	private BankAccountType accountType ;
	Random random = new Random();
	
	public BankAccount() {
		this.accountNumber =100;
		this.name = "abc";
		this.balance = 500;
		this.accountType = accountType.current;
	}
	
	public BankAccount(long accountNumber, String name, int balance, BankAccountType accountType) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance =balance;
		this.accountType = accountType;
	}
	
	public long getAccountNumber() {
		return this.accountNumber;
	}
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBalance() {
		return this.balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public BankAccountType getAccountType() {
		return this.accountType;
	}
	public void setAccountType(BankAccountType accountType) {
		this.accountType = accountType;
	}
	
	public void credit(int balance) {
		
		if(balance < 0) {
			System.out.println("Invalid, enter postive number");
		}else {
			
		this.balance = this.balance+balance;
		
		System.out.println(balance + " is credited in your account.");
		System.out.println("Your balance is: "+this.balance);
		}
		return ;
	}
	
	public void debit(int balance) {
		
		if(balance > this.balance) {
			System.out.println("Cannot withdraw, insufficient balance");
		}else {
			
			this.balance = this.balance-balance;
			System.out.println(balance + " is debited in your account.");
			System.out.println("Your balance is: "+this.balance);
		}
	}
	
	public void display() {
		System.out.println("account number: "+this.accountNumber);
		System.out.println("Name: "+this.name);
		System.out.println("Balance: "+this.balance);
		System.out.println("Account type: "+this.accountType);
	
	}

}
