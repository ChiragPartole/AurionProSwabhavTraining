package com.techlabs.isp.solution.test;

import com.techlabs.isp.solution.model.Labour;
import com.techlabs.isp.solution.model.Robot;
import com.techlabs.isp.solution.model.IWorkable;


public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labour labour = new Labour();
		IWorkable robot = new Robot();
		
		labour.startWork();
		labour.stopWork();
		labour.eat();
		labour.drink();
		
		robot.startWork();
		robot.stopWork();
	

	}

}
