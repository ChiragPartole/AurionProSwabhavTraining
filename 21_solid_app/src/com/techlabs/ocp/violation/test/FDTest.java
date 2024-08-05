package com.techlabs.ocp.violation.test;

import com.techlabs.ocp.violation.model.FestivalType;
import com.techlabs.ocp.violation.model.FixedDeposit;

public class FDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedDeposit fd1 = new FixedDeposit(1,"Chirag",1000,2,FestivalType.NEWYEAR);
		FixedDeposit fd2= new FixedDeposit(2,"ANkit",100,3,FestivalType.DIWALI);
		FixedDeposit fd3 = new FixedDeposit(1,"Rohit",2000,2,FestivalType.HOLI);
		FixedDeposit fd4 = new FixedDeposit(1,"Chirag",3000,2,FestivalType.OTHERS);
		
		System.out.println(fd1.calculateSimpleInterest());
		System.out.println(fd2.calculateSimpleInterest());
		System.out.println(fd3.calculateSimpleInterest());
		System.out.println(fd4.calculateSimpleInterest());

	}

}
