package com.techlabs.structural.adapter.test;

import com.techlabs.structural.adapter.model.Biscuit;
import com.techlabs.structural.adapter.model.Chocolate;
import com.techlabs.structural.adapter.model.Hat;
import com.techlabs.structural.adapter.model.HatAdapter;
import com.techlabs.structural.adapter.model.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		Biscuit biscuit = new Biscuit("Biscuit", 10);
		Chocolate choclate = new Chocolate("Chocolate", 20);
		HatAdapter hat =new HatAdapter( new Hat( "hat", " straw hat",57, 10));
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(biscuit);
		cart.addItem(choclate);
		
		cart.addItem(hat);
		
		System.out.println("ItemName \t\t Price");
		cart.displayItems();
		
		System.out.println("Total Bill is : "+cart.getTotalPrice());
		
	}
	
}