package com.syntax.class31;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Country {
	public static void main(String[] args) {
		
		Set<String> country = new TreeSet<>();
		
		country.add("USA");
		country.add("France");
		country.add("Canada");
		country.add("Italy");
		country.add("Denmark");
		
		System.out.println(country);
		System.out.println(" =============Using iterator===========");
		
		Iterator<String> iterator = country.iterator();
		
		while(iterator.hasNext()) {
			String obj = iterator.next();
			System.out.println(obj);
			
		}
		System.out.println("=====using enhanced loop ===========");
		for (String countries:country) {
			System.out.println(countries);
		}
	}

}
