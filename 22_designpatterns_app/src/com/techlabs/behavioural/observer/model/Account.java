package com.techlabs.behavioural.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	

	private long accountNumber;
	private String name;
	private double balance;
	private List<INotifiers> notifiers = new ArrayList<INotifiers>();
	
	public Account(long accountNumber, String name, double balance, List<INotifiers> notifiers) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.notifiers = notifiers;
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
	public List<INotifiers> getNotifiers() {
		return notifiers;
	}
	public void setNotifiers(List<INotifiers> notifiers) {
		this.notifiers = notifiers;
	}
	
	
	
	public void deposit(int amount)
	{
		if(amount<0)
		{
			System.out.println("Cannot accept negative value");
			return;
		}
		balance += amount;
		
		for(INotifiers notify: notifiers)
			notify.notifyUser(this,"Deposit",amount);
		
	}
	
	public void withdraw(int amount)
	{
		if(amount<0)
		{
			System.out.println("Cannot accept negative value");
			return;
		}
		if(amount>balance)
			throw new InsufficientFundsException();
		
		balance -= amount;
		for(INotifiers notify: notifiers)
			notify.notifyUser(this,"withdraw,", amount);
		
	}
	
	
	public void registerNotifier(List<INotifiers> notifiers)
	{
		this.notifiers = notifiers;
	}
	

}