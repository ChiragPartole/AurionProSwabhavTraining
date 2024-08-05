package com.aurionpro.model;

public class CreditCardPayments extends Payments{

	
	
	@Override
	public void processPayment() {
		System.out.println("Proccess payment called in credit card payments");
		
	}

	@Override
	public void refund() {
		System.out.println("Refund is called in credit card payments");
		
	}

}
