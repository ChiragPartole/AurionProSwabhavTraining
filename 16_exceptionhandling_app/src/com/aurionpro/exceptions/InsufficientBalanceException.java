package com.aurionpro.exceptions;

public class InsufficientBalanceException extends RuntimeException {
 
	public String getMessage() {
		return "Insufficient Balance, the requested amount is greater than the current balance.";
	}
}
