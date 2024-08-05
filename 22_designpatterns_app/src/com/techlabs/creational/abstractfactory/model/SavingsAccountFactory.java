package com.techlabs.creational.abstractfactory.model;

public class SavingsAccountFactory implements ISavingsAccountFactory{

	@Override
	public IAccount createAccount(long accountNumber, String name, double balance, double minimumBalance) {
		return new SavingsAccount(accountNumber,name,balance,minimumBalance);
	}

}
