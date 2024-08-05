package com.techlabs.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.techlabs.model.Country;
import com.techlabs.model.Region;

public class RegionTest {

	public static void main(String[] args) {
		
		List<Region> regions = Arrays.asList(new Region(1, "Europe"),
				new Region(2, "Americas"),new Region(3, "Asia"),
				new Region(4, "Middle East and Africa"));
				
				
		List<Country> countries = Arrays.asList(new Country("IT", "Italy", 1),
				new Country("JP", "Japan", 3),new Country("US", "United States of America", 2)
				,new Country("CA", "Canada", 2),new Country("CN", "China", 3)
				,new Country("IN", "India", 3),new Country("AU", "Australia", 3)
				,new Country("ZW", "Zimbabwe",4),new Country("SG", "Singapore", 3)
				,new Country("UK", "United Kingdom", 1),new Country("FR", "France", 1)
				,new Country("DE", "Germany", 1),new Country("ZM", "Zambia", 4)
				,new Country("EG", "Egypt", 4),new Country("BR", "Brazil", 2)
				,new Country("CH", "Switzerland", 1),new Country("NL", "Netherlands", 1),
				new Country("MX", "Mexico", 2),new Country("DK", "Denmark", 1),
				new Country("IL", "Israel", 4),new Country("KW", "Kuwait", 4),
				new Country("HK", "HongKong", 3),new Country("NG", "Nigeria", 4),
				new Country("AR", "Argentina", 2),new Country("BE", "Belgium", 1));
				
	
		//get name of country from country code
		List<Country> countryByCode = countries.stream()
											   .filter((country)-> country.getCountryCode() == "CA")
											   .collect(Collectors.toList());
		
		System.out.println(countryByCode);
		
		
		//Get all countries in a region by region id
		List<Country> countryByRegionId = countries.stream()
				   .filter((country)-> country.getRegionId() == 1)
				   .collect(Collectors.toList());

		System.out.println(countryByRegionId);
		
		
		//find count of countries in each region
		long count = countries.stream().map((country)-> country.getRegionId() ==1).count();
		
		System.out.println(count);
		
		
		
	}

}