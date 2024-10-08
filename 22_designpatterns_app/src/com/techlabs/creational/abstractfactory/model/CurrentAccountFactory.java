package com.techlabs.creational.abstractfactory.model;

public class CurrentAccountFactory implements ICurrentAccountFactory{

	@Override
	public IAccount createAccount(long accountNumber, String name, double balance, double overDraft) {
		return  new CurrentAccount(accountNumber,name,balance,overDraft);
	}

}
