package com.aurionpro.model;

public class Account {
	
	private long accountNumber;
	private String name;
	protected double balance;
	
	public Account(long accountNumber, String name, double balance) {
		
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		// TODO Auto-generated method stub
		return this.getAccountType();
	}

	public void debit(int amount) {
	}

	public void credit(int amount) {

		if(amount<0) {
			System.out.println("enter positive number");
			return;
		}
		balance += amount;
		System.out.println(amount +" credited in your account");
		System.out.println("your balance is: "+this.balance);
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
				+ ", getAccountType()=" + getAccountType() + "]";
	}




}
