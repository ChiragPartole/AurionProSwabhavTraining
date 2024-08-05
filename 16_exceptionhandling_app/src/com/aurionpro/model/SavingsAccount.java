package com.aurionpro.model;

import com.aurionpro.exceptions.InsufficientBalanceException;
import com.aurionpro.exceptions.MinimumBalanceException;
import com.aurionpro.exceptions.NegativeAmountEnteredException;

public class SavingsAccount implements BankAccount{

	private long accountNumber;
	private String name;
	protected double balance;
	private double minimumBalance;
	private String accountType;
	public SavingsAccount(long accountNumber, String name, double balance, double minimumBalance, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.minimumBalance = minimumBalance;
		this.accountType = accountType;
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
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public void debit(int amount) {
		if(amount < 0)
			throw new NegativeAmountEnteredException();
		if(amount > this.balance)
			throw new InsufficientBalanceException();
		if(balance - amount < this.minimumBalance)
			throw new MinimumBalanceException(minimumBalance);
		
		balance -= amount;
		System.out.println(amount +" debited successfully!!");
		System.out.println("Your current balance is "+ balance);
	}
	@Override
	public void credit(int amount) {
		if(amount < 0)
			throw new NegativeAmountEnteredException();
		
		this.balance += amount;
		System.out.println(amount +" credited successfully!!");
		System.out.println("Your current balance is "+ balance);
	}
	
	@Override
	public void display() {
		System.out.println("SavingsAccount [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
				+ ", minimumBalance=" + minimumBalance + ", accountType=" + accountType + "]");
		
	}
	
	
	
}
