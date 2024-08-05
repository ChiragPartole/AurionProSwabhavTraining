package com.aurionpro.model;

public class PayPalPayments extends Payments{

	@Override
	public void processPayment() {
		System.out.println("process payment called in paypal payments");
		
	}

	@Override
	public void refund() {
		System.out.println("refund called in paypal payments");
		
	}

}
