package com.techlabs.ocp.solution.model;


import com.techlabs.ocp.violation.model.FestivalType;

public class FixedDeposit {

	private int accountNumber;
	private String name;
	private double amount;
	private int duration;
	private IFestivalInterest interest;
	public FixedDeposit(int accountNumber, String name, double amount, int duration, IFestivalInterest interest) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.amount = amount;
		this.duration = duration;
		this.interest = interest;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public IFestivalInterest getInterest() {
		return interest;
	}
	public void setInterest(IFestivalInterest interest) {
		this.interest = interest;
	}
	
	public double calculateSimpleInterest() {
		return amount * duration * interest.getInterestRate() /100;
	}
}