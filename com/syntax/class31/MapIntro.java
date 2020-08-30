package com.syntax.class31;

import java.util.HashMap;

public class MapIntro {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap=new HashMap<>();
		
		// we store objects inside mapas a Key and value Pair
		
		hmap.put(10, "John");  // K+V = Entry
		hmap.put(12, "Jane");  // K+V = Entry
		hmap.put(11, "James"); // K+V = Entry
				
		System.out.println(hmap);
		
		//cannot have duplicate keys//KEY IS ALWAYS UNIQUE
		hmap.put(12,"Gozde");
		hmap.put(13,"Olga");
		hmap.put(1,"Olga");
		
		//but we can have duplicate values
		System.out.println(hmap);
		
		//how many entry objects inside the map
		int entryObjects = hmap.size();
		System.out.println(entryObjects);
		
		// how to check in map has any elements
		
		boolean isEmpty = hmap.isEmpty();
		System.out.println(isEmpty);
		
		// check if maps has specific key ro value
		
		boolean  hasKey= hmap.containsKey(12);
		System.out.println(hasKey);
		System.out.println("Map contains key object 12 " + hasKey);
		
		boolean hasValue = hmap.containsValue("John");
		System.out.println("Map contains value object John "+ hasValue);
	
	// how to retriev one 1 single value on the map
		String value=hmap.get(13); // gets the value of specified key
		System.out.println(value);

		// how to remove a key from a map
		hmap.remove(10);
		System.out.println(hmap);
	
	
	
	}
	
	

}
