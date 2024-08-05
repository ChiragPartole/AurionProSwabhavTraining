package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.aurionpro.model.BankAccount;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingsAccount;

public class BankAccountTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		List<BankAccount> users= new ArrayList<BankAccount>();
		
		inputUsers(users,scanner);
		
		performTransactions(users,scanner);
		
		
	}
	
	private static void inputUsers(List<BankAccount> users, Scanner scanner) {

		double minimumBalance =500;
		double overDraftLimit = 1000;
		String accountType = null;
		
	
		
		System.out.println("Enter your name: ");
		String name = (scanner.next());
		
		System.out.println("Enter your balance");		
		double balance = (scanner.nextDouble());
		
		if(balance < minimumBalance) {
			balance = minimumBalance;
			System.out.println("Balance entered is less than the minimum balance, balance changed to: " + balance);
		}
		
		
		long accountNumber = (long) Math.floor(Math.random() * 9000000000L) + 1000000000L;
		
		System.out.println("What is your account type(1 for current and 2 for savings): ");
		int input = scanner.nextInt();
		switch(input) {
		case 1:
			accountType = "current";
			users.add(new CurrentAccount(accountNumber,name,balance,overDraftLimit,accountType));
			break;
		case 2:
			accountType = "savings";
			users.add(new SavingsAccount(accountNumber,name,balance,minimumBalance,accountType));
			break;
		default:
			System.out.println("Enter valid choice");
		}
		System.out.println("Account created!");
		
		System.out.println("Your account number is: "+ users.get(users.size()-1).getAccountNumber());
		System.out.println("--------------------------");
		
		
	}

	private static void displayUsers(List<BankAccount> users) {
		
		for(int i=0; i<users.size();i++) {
			for(int j=0; j<users.size()-i-1; j++) {
				if(users.get(j).getBalance() < users.get(j+1).getBalance()) {
					BankAccount temp =users.get(j);
					users.set(j, users.get(j+1));
					users.set(j+1, temp);
				}
			}
		}
		for(int i=0; i<users.size(); i++) {
			users.get(i).display();
		}
		
	}

	private static void performTransactions(List<BankAccount> users, Scanner scanner) {
		boolean exit = false;
		int currentUser = accountSwitch(users,scanner);
		
		do {
			System.out.println("--------------------------");
			System.out.println("Welcome "+ users.get(currentUser).getName());
			System.out.println("ATM Menu: \n1. Check Balance \n2. Deposit Money "
					+ "\n3. Withdraw Money \n4. Switch users \n5. Add Account \n6. Display users"
					+ "\n7. Get details of account with maximum balance \n8.Exit");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1: System.out.println("Your current balance is: "+ users.get(currentUser).getBalance());break;
			case 2: 
				System.out.println("Enter amount to deposit: ");
				
				try
				{
					
				if(users.get(currentUser).getAccountType().equals("current")) {
					((CurrentAccount)users.get(currentUser)).credit(scanner.nextInt());
				}
				if(users.get(currentUser).getAccountType().equals("savings")) {
					((SavingsAccount)users.get(currentUser)).credit(scanner.nextInt());
				}
				}
				catch(Exception exception)
				{
					System.out.println(exception.getMessage());
				}
				break;
			case 3:
				System.out.println("Enter amount to withdraw: ");
				
				try
				{
					
				if(users.get(currentUser).getAccountType().equals("current")) {
					((CurrentAccount)users.get(currentUser)).debit(scanner.nextInt());
				}
				if(users.get(currentUser).getAccountType().equals("savings")) {
					((SavingsAccount)users.get(currentUser)).debit(scanner.nextInt());
				}
				}
				catch(Exception exception)
				{
					System.out.println(exception.getMessage());
				}
				break;
			case 4:		
				currentUser = accountSwitch(users,scanner);
				break;
			
			case 5: inputUsers(users,scanner); break;
			case 6: displayUsers(users); break;
			case 7: getMaximumBalanceAccount(users); break;
			case 8: exit =true; break;
			default:
				System.out.println("Invalid input. Please select correct option");
			}
			System.out.println("--------------------------");
		}
		while(exit == false);
		
		
		if(exit == true) {
			System.out.println("Thank you for using the ATM. Goodbye!");
		}
		
	}
	
	private static void getMaximumBalanceAccount(List<BankAccount> users) {
		int maximumBalance =0;
		int index =0;
		for(int i=0; i<users.size(); i++) {
			if(maximumBalance < users.get(i).getBalance()) {
				maximumBalance = (int) users.get(i).getBalance();
				index =i;
			}
		}
		
		users.get(index).display();
		
		
	}

	private static int accountSwitch(List<BankAccount> users, Scanner scanner) {
		
		System.out.println("--------------------------");
		System.out.println("Enter your account number: ");
		long checker = scanner.nextLong();
		int currentUser = 0;
		for(int i=0; i<users.size(); i++) {
			if(checker == users.get(i).getAccountNumber()) {
				currentUser =i;
				break;
			}
		}
		return currentUser;
	}
	
}
