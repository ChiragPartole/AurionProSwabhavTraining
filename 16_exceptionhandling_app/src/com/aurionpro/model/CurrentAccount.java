package com.aurionpro.model;

import com.aurionpro.exceptions.NegativeAmountEnteredException;
import com.aurionpro.exceptions.OverDraftLimitExceededException;

public class CurrentAccount implements BankAccount{

	private long accountNumber;
	private String name;
	protected double balance;
	private double overDraftLimit;
	private String accountType;
	
	private double overDraftLimitAvailable = overDraftLimit;
	public CurrentAccount(long accountNumber, String name, double balance, double overDraftLimit, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.overDraftLimit = overDraftLimit;
		this.accountType = accountType;
		overDraftLimitAvailable = overDraftLimit;
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

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
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
		
		if(balance + overDraftLimitAvailable < amount )
			throw new OverDraftLimitExceededException();
		
		if(amount < balance) {
			balance -= amount;
			debitMessage(amount);
			return;
		}
		
		if (balance+overDraftLimitAvailable>=amount) { 
			   overDraftLimitAvailable = balance+overDraftLimitAvailable-amount; 
			   balance= 0;
			   debitMessage(amount);
			   return;
			  } 		
	}

	private void debitMessage(int amount) {
		System.out.println(amount + " debited successfully!!");
		System.out.println("Your balance is "+balance);
		System.out.println("Current Overdraft limit = "+ overDraftLimitAvailable);
		System.out.println("Max over draft limit: "+  overDraftLimit);
		
	}

	@Override
	public void credit(int amount) {
		if(amount < 0)
			throw new NegativeAmountEnteredException();
		if(overDraftLimitAvailable==overDraftLimit) { 
			balance = balance + amount; 
			creditMessage(amount);
			return;
		} 
		if(amount<=overDraftLimit) { 
			if(amount + overDraftLimitAvailable > overDraftLimit) {
				balance =  amount - (overDraftLimit - overDraftLimitAvailable );
				overDraftLimitAvailable=overDraftLimit;
				creditMessage(amount);
				return;
			}
			overDraftLimitAvailable += amount;  
			creditMessage(amount);
			return;
		}  
		double limit = overDraftLimitAvailable-amount; 
		overDraftLimitAvailable = overDraftLimit; 
		balance = limit; 
		creditMessage(amount);
		return;
	}
	private void creditMessage(int amount) {
		System.out.println(amount + " credited successfully!!");
		System.out.println("Your balance is "+balance);
		System.out.println("Current Overdraft limit = "+ overDraftLimitAvailable);
		System.out.println("Max overdraft limit: " + overDraftLimit);
	}
	@Override
	public void display() {
		System.out.println("CurrentAccount [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
				+ ", overDraftLimit=" + overDraftLimit + ", accountType=" + accountType + "]");
	}
}
