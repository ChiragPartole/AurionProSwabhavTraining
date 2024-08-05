package com.techlabs.structural.decorator.model;

public class GoldenHat extends HatDecorator {

	 public GoldenHat(IHat hat) {
	  super(hat);
	 }

	 @Override
	 public String getName() {
	  // TODO Auto-generated method stub
	  return hat.getName()+" golden styling ";
	 }

	 @Override
	 public double getPrice() {
	  // TODO Auto-generated method stub
	  return hat.getPrice()+200;
	 }

	 @Override
	 public String getDescription() {
	  // TODO Auto-generated method stub
	  return hat.getDescription()+" golden lining on edges ";
	 }

	}