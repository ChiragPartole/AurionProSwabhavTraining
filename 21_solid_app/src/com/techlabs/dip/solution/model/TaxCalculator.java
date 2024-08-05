package com.techlabs.dip.solution.model;

import com.techlabs.dip.violation.model.DBlogger;

public class TaxCalculator {

	private Ilogger logger;

	public TaxCalculator(Ilogger logger) {
		super();
		this.logger = logger;
	}

	public Ilogger getLogger() {
		return logger;
	}

	public void setLogger(Ilogger logger) {
		this.logger = logger;
	}
	
	public void calculateTax(int amount,int rate) {
		int tax=0;
		try {
			tax = amount/rate;
			System.out.println(tax);
		}catch(Exception e) {
			new DBlogger().log("Divided by zero");
			new FileLogger().log("Divided by zero");
			new NetworkLogger().log("Divided by zero");
		}
	}

}
