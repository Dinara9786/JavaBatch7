package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingElementsFromCollection {
	
	public static void main(String[] args) {
		
		// create an arrayList of city names
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("New York");
		cities.add("Kyiv");
		cities.add("LA");
		cities.add("LA");
		cities.add("Istanbul");
		cities.add("DC");
				
		System.out.println("original array list: " + cities);
		
		// to remove cities - LA and DC
		
		System.out.println("======remove elements using regular for loop=================");
		
		for (int i = 0; i<cities.size(); i++) {
			if (cities.get(i).equals("LA") || cities.get(i).equals("DC")) {
				// cities.get(i) = element
				cities.remove(i);
				System.out.println(" list after removal LA and DC: "+ cities);
				//where do we use length? we use with arrays. where do we use size? we use with collections
			}
		}
		System.out.println("======remove elements using regular advanced/enhanced loop=================");
		
		// it is not good option remove elements from collection using enhanced loop
		for (String city : cities) {
			if (city.contentEquals("New York")) {
				cities.remove(city);
				System.out.println(" list after removal New York: "+ cities);
			}
		}
		System.out.println("======remove elements from collection using Iterator=================");
		// the best way to remove elemets from collection is using iterator
		
		cities.add("LA");
		cities.add("LA");
		cities.add("Miami");
		
		System.out.println(cities);
		
		Iterator<String> citiesIt = cities.iterator();
		
		while(citiesIt.hasNext()) {
			if (citiesIt.next().equals("LA") || citiesIt.next().equals("New York")) {
			citiesIt.remove();
		}
	}
		System.out.println("ArrayList after modifications from Iterator: " + cities);
	}
}

