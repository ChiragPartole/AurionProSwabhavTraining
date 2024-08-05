package com.techlabs.isp.violation.model;

public class Robot implements IWorker{

	public void startWork() {
		System.out.println("RObot has started working");
	}
	public void stopWork() {
		System.out.println("RObot has stopped working");
	}

	public void eat() {
		System.out.println("RObot has started eating");
	}

	public void drink() {
		System.out.println("RObot has started drinking");
	}

}
