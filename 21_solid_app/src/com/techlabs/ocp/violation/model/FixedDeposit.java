package com.techlabs.ocp.violation.model;

public class FixedDeposit {

	private int accountNumber;
	private String name;
	private double amount;
	private int duration;
	private FestivalType festivalType;
	public FixedDeposit(int accountNumber, String name, double amount, int duration, FestivalType festivalType) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.amount = amount;
		this.duration = duration;
		this.festivalType = festivalType;
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
	public FestivalType getFestivalType() {
		return festivalType;
	}
	public void setFestivalType(FestivalType festivalType) {
		this.festivalType = festivalType;
	}
	
	
	private double getInterestRates() {
	
		switch(festivalType) {
		case NEWYEAR:
			return 8;
		case DIWALI:
			return 8.5;
		case HOLI:
			return 7.5;
		case OTHERS:
			return 6.5;
		default:
			return 0;
		}
	}
	
	public double calculateSimpleInterest() {
		return (amount * getInterestRates() * duration)/100;
	}
}
