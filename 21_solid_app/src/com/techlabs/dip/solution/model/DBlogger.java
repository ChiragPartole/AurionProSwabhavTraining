package com.techlabs.dip.solution.model;

public class DBlogger implements Ilogger{

	@Override
	public void log(String err) {
		System.out.println("Logged to database " + err);
	}

}
