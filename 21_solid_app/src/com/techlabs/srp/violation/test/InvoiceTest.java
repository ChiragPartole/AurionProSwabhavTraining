package com.techlabs.srp.violation.test;

import com.techlabs.srp.violation.model.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice invoice1 = new Invoice("a","desc",100,10);
		
		System.out.println("tax: " +invoice1.calculateTax());
		invoice1.display();

	}

}
