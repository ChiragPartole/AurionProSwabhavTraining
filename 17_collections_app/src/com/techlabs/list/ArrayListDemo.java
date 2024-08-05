package com.techlabs.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("chirag");
		list.add("devan");
		list.add("rohit");

		System.out.println(list);
		
		System.out.println("using normal for loop");
		for(int i =0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Using advanced for loop");
		for(String name: list) {
			System.out.println(name);
		}
		
		System.out.println("Using iterator");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Using list iterator");
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) 
			System.out.println(listIterator.next());
		
		while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
		
	}

}
