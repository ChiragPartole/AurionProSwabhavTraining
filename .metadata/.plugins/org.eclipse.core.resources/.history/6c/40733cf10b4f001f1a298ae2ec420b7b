package com.techlabs.creational.factory.model;

public class CurrentAccount implements IAccount{
	private int accountNumber;
	private double overDraft;
	private double balance;
	
	
	
	public CurrentAccount(int accountNumber, double overDraft, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.overDraft = overDraft;
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void credit(int amount) {
		if(amount <0) {
			System.out.println("Cannot credit negative value");
			return;
		}
		if(overDraftAvailable==overDraft) { 
			balance = balance +amount;
			System.out.println(amount + " credited, balance is: " + balance);
			return;
		} 
		if(amount<=overDraft) { 
			if(amount + overDraftAvailable > overDraft) {
				balance =  amount - (overDraft - overDraftAvailable );
				overDraftAvailable=overDraft;
				System.out.println(amount + " credited, balance is: " + balance);
				System.out.println("overDraftAvailable: "+overDraftAvailable);
				System.out.println("overDraft: "+overDraft);
				return;
			}
			overDraftAvailable += amount;  
			System.out.println(amount + " credited, balance is: " + balance);
			System.out.println("overDraftAvailable: "+overDraftAvailable);
			System.out.println("overDraft: "+overDraft);
			return;
		}
		double limit = overDraftAvailable-amount; 
		overDraftAvailable = overDraft; 
		balance = limit; 
		System.out.println(amount + " credited, balance is: " + balance);
		System.out.println("overDraftAvailable: "+overDraftAvailable);
		System.out.println("overDraft: "+overDraft);
		return;
		
		
	}
	
	private double overDraftAvailable = overDraft;
	@Override
	public void debit(int amount) {
		if(amount <0) {
			System.out.println("Cannot debit negative value");
			return;
		}
		if(balance + overDraftAvailable < amount) {
			System.out.println("cannot debit, amount exceeds balance and overdraft");
			return;
		}
		if(balance + overDraftAvailable >= amount) {
			overDraftAvailable = balance+overDraftAvailable-amount;
			balance =0;
			System.out.println(amount + " debited, balance is: " + balance + "overDraftAvailable: "+overDraftAvailable);
			return;
		}
		balance = balance - amount;
		System.out.println(amount + " debited, balance is: " + balance);
		
	}
	

}
