package com.techlabs.behavioural.observer.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.behavioural.observer.model.Account;
import com.techlabs.behavioural.observer.model.EmailNotifier;
import com.techlabs.behavioural.observer.model.INotifiers;
import com.techlabs.behavioural.observer.model.SMSNotifier;
import com.techlabs.behavioural.observer.model.WhatsappNotifier;



public class AccountTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<INotifiers> notifiers = new ArrayList<INotifiers>();
		
		
		
		Account account = new Account(1,"Chirag",1000,notifiers);

		
		System.out.println("How would you like to recieve notifications?"
				+ "\npress 1 for sms \n2 for email \n3for whatsapp");
		int choice = scanner.nextInt();
		
		//addwhile loop for multiple choices, add default caseS
		switch(choice)
		{
		case 1:notifiers.add(new SMSNotifier());break;
		case 2: notifiers.add(new EmailNotifier());break;
		case 3: notifiers.add(new WhatsappNotifier());
		
		}
		account.registerNotifier(notifiers);
		
		
		account.deposit(100);
		account.withdraw(100);
		try
		{
			account.withdraw(2000);
		}
		catch(Exception exception)
		{
			System.out.println(exception.getMessage());
		}
		
	}

}
