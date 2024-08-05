package com.techlabs.dip.solution.model;

public class NetworkLogger implements Ilogger{

	@Override
	public void log(String err) {
		System.out.println("Logged to network " + err);
		
	}

}
