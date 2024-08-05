package com.aurionpro.test;

import com.aurionpro.model.BankTransferPayments;
import com.aurionpro.model.CreditCardPayments;
import com.aurionpro.model.PayPalPayments;
import com.aurionpro.model.Payments;

public class PaymentTest {

	public static void main(String[] args) {


		Payments payment;
		payment = new CreditCardPayments();
		payment.processPayment();
		payment.refund();
		
		payment = new PayPalPayments();
		payment.processPayment();
		payment.refund();
		
		payment = new BankTransferPayments();
		payment.processPayment();
		payment.refund();

	}

}
