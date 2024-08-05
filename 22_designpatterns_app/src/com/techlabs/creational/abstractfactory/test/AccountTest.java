package com.techlabs.creational.abstractfactory.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.techlabs.creational.abstractfactory.model.CurrentAccountFactory;
import com.techlabs.creational.abstractfactory.model.IAccount;
import com.techlabs.creational.abstractfactory.model.ICurrentAccountFactory;
import com.techlabs.creational.abstractfactory.model.ISavingsAccountFactory;
import com.techlabs.creational.abstractfactory.model.SavingsAccountFactory;


public class AccountTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<IAccount> users= new ArrayList<IAccount>();
		
		inputUsers(users,scanner);
		
		performTransactions(users,scanner);
		
	}
	
	private static void inputUsers(List<IAccount> users, Scanner scanner) {
		double minimumBalance =500;
		double overDraft = 1000;
		System.out.println("Enter your name: ");
		String name = (scanner.next());
		System.out.println("Enter your balance");		
		double balance = (scanner.nextDouble());
		if(balance < 500) {
			balance = 500;
			System.out.println("Balance entered is less than the 500, balance changed to: " + balance);
		}
		long accountNumber = (long) Math.floor(Math.random() * 9000000000L) + 1000000000L;
		System.out.println("What is your account type(enter 1 for current and 2 for savings): ");
		int input = scanner.nextInt();
		switch(input) {
		case 1:
			ICurrentAccountFactory currentAccountFactory = new CurrentAccountFactory();
			IAccount currentAccount = currentAccountFactory.createAccount(accountNumber, name, balance, overDraft);
			users.add(currentAccount);
			break;
		case 2:
			ISavingsAccountFactory savingsAccountFactory = new SavingsAccountFactory();
			IAccount savingsAccount = savingsAccountFactory.createAccount(accountNumber, name, balance, minimumBalance);
			users.add(savingsAccount);
			break;
		default:
			System.out.println("Enter valid choice");
		}
		System.out.println("Account created!");
		System.out.println("Your account number is: "+ users.get(users.size()-1).getAccountNumber());
		System.out.println("--------------------------");
		
	}
	
	
	private static void performTransactions(List<IAccount> users, Scanner scanner) {
		boolean exit = false;
		int currentUser = accountSwitch(users,scanner);
		
		
		do {
			if(currentUser >= users.size())
				currentUser = 0;
			if(users.size() ==0)
			{
				System.out.println("No accounts to display, create new account");
				inputUsers(users,scanner);	
			}
			System.out.println("--------------------------");
			System.out.println("Welcome "+ users.get(currentUser).getName());
			System.out.println("ATM Menu: \n1. Check Balance \n2. Deposit Money "
					+ "\n3. Withdraw Money \n4. Switch users \n5. Add Account \n6. Display users"
					+ "\n7. Delete Account \n8.Exit");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1: System.out.println("Your current balance is: "+ users.get(currentUser).getBalance());break;
			case 2: 
				System.out.println("Enter amount to deposit: ");
				double amount = scanner.nextDouble();
				users.get(currentUser).credit(amount);
				break;
			case 3:
				System.out.println("Enter amount to withdraw: ");
				double amount2 = scanner.nextDouble();
				users.get(currentUser).debit(amount2);
				break;
			case 4:		
				currentUser = accountSwitch(users,scanner);
				break;
			
			case 5: inputUsers(users,scanner); break;
			case 6: displayUsers(users); break;
			case 7: deleteAccount(users,scanner); break;
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

	private static void deleteAccount(List<IAccount> users, Scanner scanner) {
		System.out.println("--------------------------");
		System.out.println("Enter account number of the account you want to delete: ");
		long number = scanner.nextLong();
		boolean checker = false;
		for(int i=0; i<users.size(); i++) {
			if(number == users.get(i).getAccountNumber()) {
				System.out.println(" account has deleted successfully.");
				users.remove(i);
				checker = true;
				break;
			}
		}
		if(checker == false)
			System.out.println("some error has occured, try again.");
		
		
		
	}

	private static int accountSwitch(List<IAccount> users, Scanner scanner) {
		System.out.println("--------------------------");
		System.out.println("Enter your account number to get started: ");
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

	private static void displayUsers(List<IAccount> users) {
		for(IAccount user : users)
			System.out.println(user);
	}


}
