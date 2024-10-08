package com.techlabs.behavioural.strategy.test;

import com.techlabs.behavioural.strategy.model.AddOperation;
import com.techlabs.behavioural.strategy.model.MultiplyOperation;
import com.techlabs.behavioural.strategy.model.OperationStrategy;

public class OperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperationStrategy operation = new OperationStrategy(new AddOperation());
		System.out.println(operation.doOperation(10, 20));
		
		operation.setOperation(new MultiplyOperation());
		System.out.println(operation.doOperation(10, 20));

	}

}
