package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class City {
	
	public static void main(String[] args) {
		
		Set<String> city = new LinkedHashSet();
		
		city.add("Amsterdam");
		city.add("Washington DC");
		city.add("Paris");
		city.add("Rome");
		city.add("Astana");
		
		System.out.println("===========using iterator remove city which starts with A=================");
		
		Iterator<String> cities = city.iterator();
		
		while(cities.hasNext()) {
			String cit=cities.next();
			if (cit.startsWith("A")) {
				cities.remove();
			}
		}
		
		System.out.println(city);
		
	}

}
