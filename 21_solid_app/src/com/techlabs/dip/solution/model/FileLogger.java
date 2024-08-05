package com.techlabs.dip.solution.model;

public class FileLogger implements Ilogger{

	@Override
	public void log(String err) {
		System.out.println("Logged to file " + err);
	}

}
