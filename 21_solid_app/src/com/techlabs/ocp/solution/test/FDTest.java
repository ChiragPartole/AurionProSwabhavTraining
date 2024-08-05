package com.techlabs.ocp.solution.test;

import com.techlabs.ocp.solution.model.DiwaliInterest;
import com.techlabs.ocp.solution.model.FixedDeposit;

public class FDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedDeposit fd1 = new FixedDeposit(1,"Chirag",1000,2,new DiwaliInterest());
		
		System.out.println(fd1.calculateSimpleInterest());

	}

}
