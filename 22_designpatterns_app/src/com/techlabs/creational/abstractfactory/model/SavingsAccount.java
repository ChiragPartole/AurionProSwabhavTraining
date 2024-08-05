package com.techlabs.creational.abstractfactory.model;

public class SavingsAccount implements IAccount{
	private long accountNumber;
	private String name;
	private double balance;
	private double minimumBalance;
	public SavingsAccount(long accountNumber, String name, double balance, double minimumBalance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.minimumBalance = minimumBalance;
	}
	public long getAccountNumber() {
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
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
				+ ", minimumBalance=" + minimumBalance + "]";
	}
	@Override
	public void credit(double amount) {
		if(amount < 0) {
			System.out.println("Cannot credit negative value");
			return;
		}
		this.balance += amount;
		System.out.println(amount +" credited successfully!!");
		System.out.println("Your current balance is "+ balance);
	}
	@Override
	public void debit(double amount) {
		if(amount < 0) {
			System.out.println("Cannot credit negative value");
			return;
		}
		if(amount > this.balance) {
			System.out.println("INsufficient balance");
			return;
		}
		if(balance - amount < this.minimumBalance) {
			System.out.println("Cannot debit, minimum balance of "+minimumBalance+" must be met");
			return;
		}
		
		balance -= amount;
		System.out.println(amount +" debited successfully!!");
		System.out.println("Your current balance is "+ balance);
	}
	
	

}