package com.techlabs.dip.solution.test;

import com.techlabs.dip.solution.model.DBlogger;
import com.techlabs.dip.solution.model.FileLogger;
import com.techlabs.dip.solution.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		TaxCalculator t1 =new TaxCalculator(new DBlogger());
		t1.calculateTax(100	, 10);
		
		TaxCalculator t2 =new TaxCalculator(new FileLogger());
		t2.calculateTax(2000, 0);

	}

}
