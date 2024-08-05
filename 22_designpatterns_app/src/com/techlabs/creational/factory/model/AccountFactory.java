package com.techlabs.creational.factory.model;

public class AccountFactory {

	public static IAccount createCurrentAccount() {
		IAccount account = null;
		account = new CurrentAccount(0, 0, 0);
		return account;
	}
	public static IAccount createSavingsAccount() {
		IAccount account = null;
		account = new SavingsAccount(0, null, 0);
		return account;
	}
	

}
