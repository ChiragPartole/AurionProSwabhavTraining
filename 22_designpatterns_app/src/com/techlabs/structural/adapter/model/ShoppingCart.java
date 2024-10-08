package com.techlabs.structural.adapter.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<IItems> cartItems;

	public ShoppingCart() {
		cartItems = new ArrayList<IItems>();
	}
	
	public ShoppingCart(List<IItems> cartItems) {
		super();
		this.cartItems = cartItems;
	}

	public List<IItems> getCartItem()
	{
		return cartItems;
	}
	
	public void addItem(IItems item)
	{
		cartItems.add(item);
	}
	
	public void displayItems()
	{
		cartItems.forEach((item)->System.out.println(item.getItemName()+ "\t\t"+ item.getItemPrice()));
	}
	
	public double getTotalPrice()
	{
		return cartItems.stream()
						.mapToDouble((item)->item.getItemPrice())
						.reduce(0, (price1,price2)-> price1+price2);
	}
	
	
}
