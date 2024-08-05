package com.techlabs.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
//		LinkedHashMap<Integer,String> map1 = new LinkedHashMap<Integer,String>();
//		
//		map1.put(5, "Chirag");
//		map1.put(4, "Shirish");
//		map1.put(7, "VInayak");
//		System.out.println(map1);
//		
//		LinkedHashMap<Integer,String> map2 = new LinkedHashMap<Integer,String>();
//		
//		map2.put(5, "Chirag");
//		map2.put(4, "Shirish");
//		map2.put(7, "VInayak");
//
//		System.out.println(map2);
		TreeMap<Integer,String> map3 = new TreeMap<Integer,String>();
		
		map3.put(5, "Chirag");
		map3.put(4, "Shirish");
		map3.put(7, "VInayak");

		System.out.println(map3);
		
		Set<Entry<Integer,String>> entries = map3.entrySet();
		
		for(Entry<Integer,String> entry:  entries)
			System.out.println(entry.getKey() + "-" + entry.getValue());
		
		
	}

}
