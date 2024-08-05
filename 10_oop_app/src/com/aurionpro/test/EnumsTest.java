package com.aurionpro.test;

public class EnumsTest {

	
	enum Season {Summer, Winter, Rainy};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season s1 = Season.Summer;
		
		
		 switch(s1) {
	      case Summer:
	        System.out.println("Summer");
	        break;
	      case Winter:
	         System.out.println("Winter");
	        break;
	      case Rainy:
	        System.out.println("Rainy");
	        break;
	    }

	}

}
