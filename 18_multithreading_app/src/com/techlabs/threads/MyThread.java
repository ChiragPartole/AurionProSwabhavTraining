package com.techlabs.threads;

public class MyThread extends Thread{

	public MyThread(String name)
	{
		super(name);
		start();
	}
	public void run()
	{
		for(int i=5; i>0;i--)
		{
			System.out.println(Thread.currentThread().getName() + ":"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
