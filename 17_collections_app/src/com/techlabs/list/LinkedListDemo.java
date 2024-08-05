package com.techlabs.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> lists = new LinkedList<String>();
		
		lists.add("Chirag");
		lists.add("Rohit");
		lists.addLast("Sumit");
		lists.addFirst("Ankit");

		for(String list: lists)
			System.out.println(list);
	System.out.println(lists.pop());
	}
	

}
