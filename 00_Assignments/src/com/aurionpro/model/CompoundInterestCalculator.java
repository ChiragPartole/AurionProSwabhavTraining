package com.aurionpro.model;

import java.util.Scanner;

public class CompoundInterestCalculator {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter principal: ");
		double principal = scanner.nextDouble();
		
		System.out.println("Enter rate of interest: ");
		double rate = scanner.nextDouble();
		
		System.out.println("Enter time: ");
		double time = scanner.nextDouble();
		
		
		double compoundInterest = principal * Math.pow((1+rate/100), time);
		System.out.println("Compound Interest is -> "+ compoundInterest);
}
}