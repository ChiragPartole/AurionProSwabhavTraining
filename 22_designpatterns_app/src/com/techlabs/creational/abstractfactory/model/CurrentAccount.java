package com.techlabs.creational.abstractfactory.model;

public class CurrentAccount implements IAccount{

	private long accountNumber;
	private String name;
	private double balance;
	private double overDraft;
	private double overDraftAvailable;
	public CurrentAccount(long accountNumber, String name, double balance, double overDraft) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.overDraft = overDraft;
		overDraftAvailable = overDraft;
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
	public double getOverDraft() {
		return overDraft;
	}
	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}
	
	
	@Override
	public String toString() {
		return "CurrentAccount [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
				+ ", overDraft=" + overDraft + "]";
	}
	
	@Override
	public void credit(double amount) {
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
	
	
	@Override
	public void debit(double amount) {
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
