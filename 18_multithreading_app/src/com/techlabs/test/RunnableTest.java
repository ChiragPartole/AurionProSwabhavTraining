package com.techlabs.test;

import com.techlabs.threads.RunnableThread;

public class RunnableTest {

	public static void main(String[] args) {


		RunnableThread thread1 = new RunnableThread("Thread1");
		
		System.out.println(thread1.getThread().isAlive());
		try {
			thread1.getThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(thread1.getThread().isAlive());

	}

}
