package com.techlabs.threads;

public class RunnableThread implements Runnable{

	private Thread thread;
	
	public RunnableThread(String name)
	{
		thread = new Thread(this);
		thread.start();
		thread.setName(name);
	}
	
	
	public Thread getThread() {
		return thread;
	}


	public void setThread(Thread thread) {
		this.thread = thread;
	}


	@Override
	public void run() {
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
