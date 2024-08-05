package com.aurionpro.model;

public class OperatorsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b=7;
		int c= 7;
		
		System.out.println((a<b) && (b==c));
		
		int d= b + a++;
		System.out.println(d);
		System.out.println("++b ->" + (++b));
		

	}

}
