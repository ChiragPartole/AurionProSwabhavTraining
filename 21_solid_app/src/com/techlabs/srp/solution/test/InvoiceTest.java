package com.techlabs.srp.solution.test;

import com.techlabs.srp.solution.model.Invoice;
import com.techlabs.srp.solution.model.InvoicePrinter;
import com.techlabs.srp.solution.model.TaxCalculator;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice invoice1 = new Invoice("a","desc",100,10);
		TaxCalculator taxCalculator = new TaxCalculator(invoice1);
		InvoicePrinter invoicePrinter = new InvoicePrinter(invoice1,taxCalculator);
		
		System.out.println(taxCalculator.calculateTax());
		invoicePrinter.display();

	}

}
