package com.syntax.class31;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CollectionViewsOfMap {
	
	public static void main(String[] args) {
		
		Map<String, Double> grocery = new LinkedHashMap<>();//preserved the order
		
		grocery.put("Apple", 3.99 );
		grocery.put("Milk", 4.99);
		grocery.put("Ice Cream", 5.35);
		grocery.put("Eggs", 1.99);
		grocery.put("Juice", 1.2);
		grocery.put("Milk", 2.3);
											// we know the key and specifying key we retrieve the value
		double value = grocery.get("Milk"); // to get a value of Milk. in MAP when we know key we can get value. 
		System.out.println(value);
		
		// how to get all values
		Collection<Double>values = grocery.values();// all the values of Double type
		
		System.out.println("=========get all values one by one using loop================");
		
		for (Double val:values) {
			System.out.println(val);
		}
		
		// Iteration is associated with our collections
		
		System.out.println("=========get all values one by one using Iterator================");
		
		Iterator<Double>iterator = values.iterator();
		
		while(iterator.hasNext()) {
			double it = iterator.next();
			System.out.println(it);
			
		}
		
		// how to get all keys. Every time when we need to get keys we call Set
		Set <String>keys=grocery.keySet();
		
		System.out.println("=========get all keys one by one using Iterator================");
		
		Iterator<String> keysIterator = keys.iterator();
		while(keysIterator.hasNext()) {
			System.out.println(keysIterator.next());
			
		}	
		
		System.out.println("=========get all keys one by one enhanced loop===============");
			
		for (String key:keys) {
			//System.out.println(key);
			//I want to print key+pair together
		
			System.out.println("Key is " + key+ " and its value is " + grocery.get(key));
																	//method .get() from Map which is grocery
		}
		}
		}
	
	
	// to retrieve values we call Collection
	// to retrieve key we call Set
	

