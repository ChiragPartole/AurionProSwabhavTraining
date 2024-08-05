package com.techlabs.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("chirag","rohit","ankit","aakash","vinayak");
		
		List<String> sortedNames = names.stream()
										.sorted()
										.limit(3)
										.collect((Collectors.toList()));
		
		System.out.println("First three students sorted in ascending order: ");
		sortedNames.stream().forEach((name)->System.out.println(name));
		
		List<String> sortedByChar = names.stream()
										 .filter((name)-> name.contains("a"))
										 .sorted().limit(3)
										 .collect((Collectors.toList()));
		
		System.out.println("First three students sorted in ascending order that contains 'a': ");
		sortedByChar.stream().forEach((name)->System.out.println(name));
		
		List<String> sortedDescending = names.stream()
				.sorted(Comparator.reverseOrder())
				.limit(3)
				.collect((Collectors.toList()));
		
		System.out.println("First three students sorted in descending: ");
		sortedDescending.stream().forEach((name)-> System.out.println(name));
		
		Stream<String> first3Char = names.stream().map((name)->name.substring(0, 3));
		
		System.out.println("FIrst 3 char");
		first3Char.forEach((name)-> System.out.println(name));
		
		List<String> namesLength = names.stream()
										.filter((name)-> name.length()<=4)
										.collect(Collectors.toList());
		System.out.println("Names having length less than 4");
		namesLength.forEach((name)-> System.out.println(name));

	}

}
