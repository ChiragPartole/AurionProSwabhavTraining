package com.aurionpro.model;

public class SavingsAccount extends Account{

	private double minimumBalance;
	private String accountType;

	public SavingsAccount(long accountNumber, String name, double balance, double minimumBalance,String accountType) {
		super(accountNumber, name, balance);
		this.minimumBalance = minimumBalance;
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "SavingsAccount [AccountNumber=" + getAccountNumber()
				+ ", Name=" + getName() + ", Balance=" + getBalance()+ ", minimumBalance=" + minimumBalance+" ]";
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	

	 public void debit(int amount) {
		 if(amount > balance) {
			 System.out.println("Insufficient balance");
			 return;
		 }
		 if (balance - amount < minimumBalance) {
			 System.out.println("Minimum balance requirement not met");
			 return;
		 }
		 balance -= amount;
		 System.out.println(amount +" debited successfully");
		 System.out.println("Your current balance is: "+ balance);
		 
	 }
	
	
}
