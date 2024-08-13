package com.techlabs.entity;

public class Account {

	private int accID;
	private int accNumber;
	private double balance;
	private int customerID;
	private String firstName;
	private String lastName;
	private String email;
	public Account(int accID, int accNumber, double balance, int customerID, String firstName, String lastName,
			String email) {
		super();
		this.accID = accID;
		this.accNumber = accNumber;
		this.balance = balance;
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public int getAccID() {
		return accID;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public double getBalance() {
		return balance;
	}
	public int getCustomerID() {
		return customerID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Account [accID=" + accID + ", accNumber=" + accNumber + ", balance=" + balance + ", customerID="
				+ customerID + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
	
	
}
