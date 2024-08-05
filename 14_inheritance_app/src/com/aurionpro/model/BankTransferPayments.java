package com.aurionpro.model;

public class BankTransferPayments extends Payments{

	@Override
	public void processPayment() {
		System.out.println("process payment called in bank payments");
		
	}

	@Override
	public void refund() {
		System.out.println("refund called in bank payments");
		
	}

}
