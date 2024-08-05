package com.techlabs.behavioural.observer.model;


public class SMSNotifier implements INotifiers{

	@Override
	public void notifyUser(Account account,String operation, double amount) {
		System.out.println("sms");
		System.out.println("Your account number: "+ account.getAccountNumber()+
				", operation: " + operation+" ,amount: "+ amount+" ,balance is "+account.getBalance());
		System.out.println("---------------------");
	}
}
