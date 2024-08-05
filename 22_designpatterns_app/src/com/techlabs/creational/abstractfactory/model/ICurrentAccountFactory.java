package com.techlabs.creational.abstractfactory.model;

public interface ICurrentAccountFactory{

	IAccount createAccount(long accountNumber, String name, double balance, double overDraft);
}
