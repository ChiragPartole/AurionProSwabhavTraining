package com.techlabs.model;

public class Task implements Runnable {

	public void run()
	{
		System.out.println("Thread: "+ Thread.currentThread().getName());
	}
}
