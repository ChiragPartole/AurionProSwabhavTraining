package com.techlabs.isp.violation.model;

public class Labour implements IWorker{

	public void startWork() {
		System.out.println("Labour has started working");
	}
	public void stopWork() {
		System.out.println("Labour has stopped working");
	}

	public void eat() {
		System.out.println("Labour has started eating");
	}

	public void drink() {
		System.out.println("Labour has started drinking");
	}
}
