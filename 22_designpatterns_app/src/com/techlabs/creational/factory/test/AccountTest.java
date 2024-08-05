package com.techlabs.creational.factory.test;

import com.techlabs.creational.factory.model.AccountFactory;
import com.techlabs.creational.factory.model.AccountTypes;
import com.techlabs.creational.factory.model.IAccount;

public class AccountTest {

	public static void main(String[] args) {
		IAccount current = AccountFactory.createCurrentAccount();		current.credit(100);

	}

}
