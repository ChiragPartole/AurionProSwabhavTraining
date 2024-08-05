package com.techlabs.creational.abstractfactory.model;

public interface ISavingsAccountFactory {

	IAccount createAccount(long accountNumber, String name, double balance, double minimumBalance);

}
