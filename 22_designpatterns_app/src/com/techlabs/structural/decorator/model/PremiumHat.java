package com.techlabs.structural.decorator.model;

public class PremiumHat implements IHat{

	 @Override
	 public String getName() {
	  // TODO Auto-generated method stub
	  return "Premium Hat";
	 }

	 @Override
	 public double getPrice() {
	  // TODO Auto-generated method stub
	  return 500;
	 }

	 @Override
	 public String getDescription() {
	  // TODO Auto-generated method stub
	  return "Puma Hat";
	 }

	}