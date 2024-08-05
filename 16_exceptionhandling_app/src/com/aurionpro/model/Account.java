package com.aurionpro.model;

import com.aurionpro.exceptions.InsufficientBalanceException;

public class Account {
	private int accountNumber; 
	private String name;
	private int balance;
	public Account(int accountNumber, String name, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void credit(int amount) {
		if(amount < 0)
			return;
		this.balance += amount;
		System.out.println(amount + " credited into your account. \n Your balance is: "+this.balance);
	}

	public void debit(int amount) {
		if(amount > balance)
			throw new InsufficientBalanceException();
		
		balance -= amount;
		
		System.out.println(amount +" debited from your account. \n your balance is: "+ balance);
	}
}
