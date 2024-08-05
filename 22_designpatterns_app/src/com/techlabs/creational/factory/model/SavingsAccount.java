package com.techlabs.creational.factory.model;

public class SavingsAccount implements IAccount{
	
	private int accountNumber;
	private String name;
	private double balance;
	public SavingsAccount(int accountNumber, String name, double balance) {
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	@Override
	public void credit(int amount) {
		if(amount <0) {
			System.out.println("Cannot credit negative value");
			return;
		}
		
		balance = balance +amount;
		System.out.println(amount + " credited, balance is: " + balance);
		
	}
	@Override
	public void debit(int amount) {
		if(amount <0) {
			System.out.println("Cannot debit negative value");
			return;
		}
		if(amount > balance) {
			System.out.println("cannot debit, amount exceeds balance");
			return;
		}
		balance = balance - amount;
		System.out.println(amount + " debited, balance is: " + balance);
		
		
	}
	
	
	

}
