package com.aurionpro.exceptions;

public class MinimumBalanceException extends RuntimeException {

	private double minimumBalance;
	
	
	public MinimumBalanceException(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}


	public String getMessage() {
		return "Cannot debit, minimum balance of "+minimumBalance+ " must be in your account";
	}
}
