package com.techlabs.behavioural.observer.model;

public class InsufficientFundsException extends RuntimeException{
	
	public String getMessage()
	{
		return "Insufficient Funds";
	}

}
