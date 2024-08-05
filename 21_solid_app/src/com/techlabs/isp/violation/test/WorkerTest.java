package com.techlabs.isp.violation.test;

import com.techlabs.isp.violation.model.IWorker;
import com.techlabs.isp.violation.model.Labour;
import com.techlabs.isp.violation.model.Robot;

public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWorker labour = new Labour();
		IWorker robot = new Robot();
		
		labour.startWork();
		labour.stopWork();
		labour.eat();
		labour.drink();
		
		robot.startWork();
		robot.stopWork();
		robot.eat();
		robot.drink();

	}

}