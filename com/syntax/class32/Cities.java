package com.syntax.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Cities {
	
//	Create a Map from array of cities that will sort keys in alphabetical order. 
//	As a key store the name of the city and as a value store the length of the city 
//	(Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
//	If any city name is more than 7 characters remove that city . 

public static void main(String[] args) {
	
	Map <String, Integer> cities = new TreeMap<>();
	cities.put("Paris", 20000);
	cities.put("Rome", 30000);
	cities.put("New York", 34000);
	cities.put("Washington DC", 20000);
	cities.put("Arlington", 60030);
	
	System.out.println(cities);
	
//		for (Entry <String, String> c: cities.entrySet()) {
//		System*/.out.println(c.getKey() + "== " + c.getValue());
	
	
	Set <String> keys = cities.keySet();

	Iterator<String>it  = keys.iterator();

	while(it.hasNext()) {
		String key = it.next();
			if (key.length()>7) {
				it.remove();
			}
		}
		
		//System.out.println(key);
		System.out.println(cities);
		
	
	System.out.println("==============IMPROVED WAY==========");
	
//	String [] citi = {"Arlington", "New York", "Paris", "Rome", "Washington DC"};
//	 for (int i = 0; i<citi.length; citi++) {
//		 cityMap.put(citi[i], citi[i].length());
//	System.out.println(cityMap);
	
	
	Iterator<Entry<String, Integer>> iterator = cities.entrySet().iterator();
	
	while(iterator.hasNext()) {
		Entry<String, Integer> entry=iterator.next();
		
		if (entry.getValue()>7) {
			iterator.remove();
		}
		
		
	}
}
}
	

