package com.techlabs.srp.solution.model;

public class InvoicePrinter {

	private Invoice invoice;
	private TaxCalculator taxCalculator;
	public InvoicePrinter(Invoice invoice, TaxCalculator taxCalculator) {
		super();
		this.invoice = invoice;
		this.taxCalculator = taxCalculator;
	}
	
	public void display()
	{
		System.out.println( "Invoice [id=" + invoice.getId() + ", description=" + invoice.getDescription() +
				", amount=" +invoice.getAmount() + ", tax=" + invoice.getTax() + ",total amount=" +(taxCalculator.calculateTax()+invoice.getAmount())+ "]");
	}
}
