package com.techlabs.test;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.model.Computer;
import com.techlabs.model.HardDisk;

public class ComputerTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

//		HardDisk disk = (HardDisk) context.getBean("harddisk","HardDisk.class");
//		System.out.println(disk);
		
		Computer computer = (Computer) context.getBean("computer", "Computer.class");
		System.out.println(computer);
				
	}
	
}
