package com.aurionpro.model;

public class HoursToMinutesCommandArg {

	public static void main(String[] args) {
	
		int hours =Integer.parseInt(args[0]);
		int minutes =Integer.parseInt(args[1]);
		
		int result = hours*60 + minutes;
		
		System.out.println(hours+ "hours and " +minutes+ "minutes is-> "+ result+ "minutes");

	}

}
