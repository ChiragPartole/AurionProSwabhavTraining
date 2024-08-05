package com.techlabs.dip.violation.model;

public class TaxCalculator {

	private DBlogger dblogger;

	
	public void calculateTax(int amount,int rate) {
		int tax=0;
		try {
			tax = amount/rate;
			System.out.println(tax);
		}catch(Exception e) {
			new DBlogger().log("Divided by zero");
		}
	}
}
