package com.techlabs.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(15,25,35,45);
		
//		Stream<Integer> numberStream = numbers.stream();
//		
//		numberStream.forEach((number) -> System.out.println(number));
		System.out.println("numbers");
		numbers.stream().forEach((number)->System.out.println(number));
		
		System.out.println("numbers after filter");
		List<Integer> filteredList = numbers.stream()
			   .filter((number) -> (number%2 !=0))
			   .filter((number)-> number>25)
			   .collect(Collectors.toList());
		
		filteredList.stream()
					.forEach((number) ->System.out.println(number));
	
		List<Integer> squaredNumbers = numbers.stream()
											  .map((number)-> number*number)
											  .collect(Collectors.toList());
		System.out.println("Squared numbers");
		squaredNumbers.stream()
					  .forEach((number) ->System.out.println(number));
		
		int sum = numbers.stream().reduce(0, (number1,number2) -> number1+number2);
		System.out.println("Sum: "+sum);
		
		List<Integer> sortedNumbers = numbers.stream()
											 .sorted(Comparator.reverseOrder())
											 .limit(3)
											 .collect(Collectors.toList());
		
		System.out.println("Descending order top3");
		sortedNumbers.stream().forEach((number)-> System.out.println(number));
		Collections.reverse(sortedNumbers);
		System.out.println("Reverse order:");
		sortedNumbers.stream().forEach((number)-> System.out.println(number));
		
		Optional<Integer> max = numbers.stream().max((number1,number2)->number1-number2);
		if(max.isPresent())
			System.out.println("Max is: "+max.get());
		
		Optional<Integer> min = numbers.stream().min((number1,number2)->number1-number2);
		if(min.isPresent())
			System.out.println("Min is: "+min.get());
		
	}

}
