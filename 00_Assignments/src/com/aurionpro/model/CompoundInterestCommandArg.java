package com.aurionpro.model;

public class CompoundInterestCommandArg {

	public static void main(String[] args) {
		
		double principal = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		double time = Double.parseDouble(args[2]);
		
		
		double compoundInterest = principal * Math.pow((1+rate/100), time);
		System.out.println("Compound Interest is -> "+ compoundInterest);
}
}