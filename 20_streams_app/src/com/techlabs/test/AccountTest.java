package com.techlabs.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.techlabs.model.Account;

public class AccountTest {

	public static void main(String[] args) {


		List<Account> accounts = Arrays.asList(new Account(1,"Chirag",1000)
				,new Account(2,"Rohit",2000),new Account(3,"Ankit",300)
				,new Account(4,"Aakash",4000),new Account(5,"Vaibhav",1000));

		
		//Account with minimum balance
		Optional<Account> minBalAccount = accounts.stream()
												  .min((account1,account2)-> account1.getBalance() - account2.getBalance());
		if(minBalAccount.isPresent())
			System.out.println("Account with minimum balance is: "+minBalAccount.get());
		
		
		//Account with maximum balance is
		Optional<Account> maxBalAccount = accounts.stream()
												  .max((account1,account2)-> account1.getBalance() - account2.getBalance());
		if(maxBalAccount.isPresent())
			System.out.println("Account with maximum balance is: "+maxBalAccount.get());
		
		
		//Accounts with name length greater than 6
		List<Account> accWithLen6 = accounts.stream()
											.filter((account)-> account.getName().length()>6)
											.collect(Collectors.toList());
		System.out.println("Accounts with name length greater than 6");
		accWithLen6.stream().forEach((account)-> System.out.println(account));
		
		
		//sum of balance of all accounts
		double sum = accounts.stream()
							 .map((account)-> account.getBalance())
							 .reduce(0, (account1,account2)-> account1+account2);
		System.out.println("sum of balance of all accounts: "+sum);
	}

}
