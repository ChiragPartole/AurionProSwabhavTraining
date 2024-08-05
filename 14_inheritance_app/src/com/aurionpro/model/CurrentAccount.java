package com.aurionpro.model;


public class CurrentAccount extends Account {

	private double overDraftLimit;
	private String accountType;
	private double overDraftLimitAvailable = overDraftLimit;
	
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

	public CurrentAccount(long accountNumber, String name, double balance, double overDraftLimit,String accountType) {
		super(accountNumber, name, balance);
		this.overDraftLimit = overDraftLimit;
		this.accountType = accountType;
		overDraftLimitAvailable = overDraftLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [Account Number=" + getAccountNumber()
				+ ", Name=" + getName() + ", Balance=" + getBalance() + ", overDraftLimit=" + overDraftLimit + "]";
	}

	
	 

	
	@Override
	public void debit(int amount) {
		if(amount < 0) {
			System.out.println("Enter a positive number");
			return;
		}
		
		
		if(balance + overDraftLimitAvailable < amount ) {
			System.out.println("Cannot debit as overDraftLimit is exceeded");
			return;
		}
		
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
		if(amount < 0) {
			System.out.println("Enter a positive number");
			return;
		}
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
	
}
