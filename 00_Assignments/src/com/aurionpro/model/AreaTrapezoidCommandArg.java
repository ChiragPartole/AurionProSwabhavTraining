package com.aurionpro.model;

public class AreaTrapezoidCommandArg {

	public static void main(String[] args) {

		int base1 = Integer.parseInt(args[0]);
		int base2 = Integer.parseInt(args[1]);
		int height = Integer.parseInt(args[2]);
		
		double area = ((base1+base2) * height)/2;
		System.out.println("Area is -> "+ area);
}
}