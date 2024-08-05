package com.aurionpro.model;

public class ShiftOperators {

	public static void main(String[] args) {
		int a = 10;
		// 01010
	    
        // using left shift 01010 -> 10100
		System.out.println("a<<1 : " + (a << 1));
    
      // using right shift 01010 -> 00101
		System.out.println("a>>1 : " + (a >> 1));
  }
}