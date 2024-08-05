package com.aurionpro.exceptions;

public class OverDraftLimitExceededException extends RuntimeException{

	public String getMessage() {
		return "Cannot debit as the amount exceeds the overdraft limit";
	}
}
