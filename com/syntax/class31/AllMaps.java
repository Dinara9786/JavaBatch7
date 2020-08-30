package com.syntax.class31;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {
	public static void main(String[] args) {
		
//		In HashMap, if duplicate, the new value is override the old value
//		HashMap is very similar to HashSet
		// this is map = { }
		
		Map<String, Double>grocery = new HashMap<>(); // HahsMap does not keep the order. HashMap is collection
		grocery.put("Apple",  null);
		grocery.put("Milk",  4.99);
		grocery.put("Ice Cream",  2.99);
		grocery.put("Eggs",  6.99);
//		grocery.put(null,  0.99);
//		grocery.put(null,  null);
		
		System.out.println(grocery);
	
		Map <String, Double> mall = new LinkedHashMap(); // order is preserved
		
		mall.put("Parfume", 6.88);
		mall.put("T-shirt", 8.88);
		mall.put("Shoes", 6.90);
//	
		mall.put(null, 6.88);
//		mall.put(null, null);	
		System.out.println(mall);
		
		Map <String, Double> shopping = new TreeMap<>(); // sorting keys in ascending order
								// TreeMap cannot have null values
		shopping.putAll(grocery);
		shopping.putAll(mall);
		
		System.out.println(shopping);
		
//		Map<String, Double> htable = new Hashtable<>();// very similar to HashMap. 
//		
//		htable.put("House", 600.0);
//		htable.put("Car", 608.0);
//		htable.put("table", 700.0);
//		System.out.println(htable);
//		
			//Hashmap can have at least null key and multiple null values
		//Hashtable does not allow null key and value and does not allow duplicate keys and values
		
		// adding null keys and null values into LInkedHashmap
		mall.put(null, 6.88);
		mall.put(null, null);
		System.out.println(mall);
				
	}

}
