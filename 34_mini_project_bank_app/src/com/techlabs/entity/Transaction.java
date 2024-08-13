package com.techlabs.entity;

import java.sql.Date;

public class Transaction {

	private int senderAccNO;
	private int receiverAccNo;
	private String typeOfTransaction;
	private double amount;
	private Date date;
	public Transaction(int senderAccNO, int receiverAccNo, String typeOfTransaction, double amount, Date date) {
		super();
		this.senderAccNO = senderAccNO;
		this.receiverAccNo = receiverAccNo;
		this.typeOfTransaction = typeOfTransaction;
		this.amount = amount;
		this.date = date;
	}
	public int getSenderAccNO() {
		return senderAccNO;
	}
	public int getReceiverAccNo() {
		return receiverAccNo;
	}
	public String getTypeOfTransaction() {
		return typeOfTransaction;
	}
	public double getAmount() {
		return amount;
	}
	public Date getDate() {
		return date;
	}
	@Override
	public String toString() {
		return "Transaction [senderAccNO=" + senderAccNO + ", receiverAccNo=" + receiverAccNo + ", typeOfTransaction="
				+ typeOfTransaction + ", amount=" + amount + ", date=" + date + "]";
	}
	
	
}
