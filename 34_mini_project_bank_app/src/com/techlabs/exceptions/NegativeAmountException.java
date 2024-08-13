package com.techlabs.exceptions;

public class NegativeAmountException extends RuntimeException{

	public String getMessage()
	{
		return "Unable to perform transaction!! \n Negative amount entered.";
	}
}
