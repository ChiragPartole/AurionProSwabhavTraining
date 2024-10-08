package com.techlabs.structural.adapter.model;

public class HatAdapter implements IItems{
	private Hat hat;

	public HatAdapter (Hat hat)
	{
		this.hat = hat;
	}
	@Override
	public String getItemName() {
		return hat.getShortName().concat(hat.getLongName());
		
	}

	@Override
	public double getItemPrice() {
		return hat.getBasePrice()+(hat.getBasePrice()*hat.getTax()/100);
		
	}
}