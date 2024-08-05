package com.techlabs.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> set = new LinkedHashSet<String>();
		
		set.add("Rohit");
		set.add("Chirag");
		set.add("Chirag");
		set.add("Shivam");
		
		System.out.println(set);

	}

}
