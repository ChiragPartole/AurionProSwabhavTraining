package com.aurionpro.exceptions;

public class NegativeAmountEnteredException extends RuntimeException{

	public String getMessage() {
		return "Cannot credit a negative number, please enter a positive number";
	}
}
