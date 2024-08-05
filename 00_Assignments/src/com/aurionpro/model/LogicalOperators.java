package com.aurionpro.model;

public class LogicalOperators {

	public static void main(String[] args) {

		boolean x = true;
        boolean y = false;
      
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        
        if(x==true && y==false) {
        	System.out.println("x is true and y is false");
        }
        if(x==true || y==true) {
        	System.out.println("either x is true or y is true");
        }
    }
}