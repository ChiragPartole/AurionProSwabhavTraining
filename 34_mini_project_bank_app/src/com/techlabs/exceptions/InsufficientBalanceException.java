package com.techlabs.exceptions;

public class InsufficientBalanceException extends RuntimeException{

	public String getMessage()
	{
		return "Cannot perform transaction!! \n Insufficient Balance";
	}
}
