package com.aurionpro.model;

public interface BankAccount {
	
	public void debit(int amount);
	public void credit(int amount);
	
	public long getAccountNumber();
	public double getBalance();
	public String getName();
	public String getAccountType();
	public void display();
}
