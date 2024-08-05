package com.aurionpro.model;

import java.util.Scanner;

public class HoursToMinutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter hours: ");
		int hours =scanner.nextInt();
		System.out.println("Enter minutes: ");
		int minutes =scanner.nextInt();
		
		int result = hours*60 + minutes;
		
		System.out.println(hours+ "hours and " +minutes+ "minutes is-> "+ result+ "minutes");

	}

}
