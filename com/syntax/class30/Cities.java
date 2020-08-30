package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Cities {
	public static void main(String[] args) {
		
	// create an array LIst of city names
	
	ArrayList<String>cities = new ArrayList<>();
	
	cities.add("Kyiv");
	cities.add("LA");
	cities.add("LA");
	cities.add("Istanbul");
	cities.add("DC");
	cities.add("New York");
	
	System.out.println(cities);
	
	System.out.println("================removing elements using regular for loop ===================== "); // possible, but not good option 
	// remove cities LA, DC
	
	for (int i=0; i<cities.size(); i++) { // in collection we use size, in array we use length
		if (cities.get(i).equals("LA") || cities.get(i).equals("DC")) {
			cities.remove(i);
			//System.out.println(cities);
		}
	}
	System.out.println("Removing using regular for loop: " + cities);
	
	System.out.println("================removing Objects using enhanced loop =================== ");
	
	for (String city: cities) {
		if(city.equals("Instanbul")) {
			cities.remove(city);
		}
	}
	System.out.println("Removing using enhanced loop: " + cities); // it is not good option to remove objects from collection
	
	cities.add("LA");
	cities.add("LA");
	cities.add("Miami");
	cities.add("Miami");
	cities.add("Miami");
	cities.add("Miami");
	
	System.out.println(cities);
	
		System.out.println("================removing Objects using Iterator =================== ");

	Iterator<String>citiesIt = cities.iterator();
	
	while (citiesIt.hasNext()) {
		String ci = citiesIt.next(); // I am storing inside variable
		if(ci.equals("LA")|| ci.equals("Miami")){
			citiesIt.remove();
		}
	}	// using Iterator is the best way to remove objects from collection
	System.out.println("List of cities after removal LA using Iterator: " + cities);
	}
}	

	

