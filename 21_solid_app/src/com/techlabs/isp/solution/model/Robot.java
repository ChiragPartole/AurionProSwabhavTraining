package com.techlabs.isp.solution.model;

public class Robot implements IWorkable{

	public void startWork() {
		System.out.println("RObot has started working");
	}
	public void stopWork() {
		System.out.println("RObot has stopped working");
	}
}
