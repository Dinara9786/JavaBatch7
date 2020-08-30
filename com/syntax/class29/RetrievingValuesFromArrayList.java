package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class RetrievingValuesFromArrayList {
	
	public static void main (String [] args) {
			
		ArrayList<String> names = new ArrayList();
		
		names.add("Anna");
		names.add("Alla");
		names.add("Igor");
		names.add("Senya");
		names.add("Gozde");
		
		//how to retrieve a value
		
		String str = names.get(3);
		System.out.println(str);
		
		System.out.println("=====Retrievig values from arrayList using enhanced for loop=======");
		
		//how to retrieve a values 1 by 1 
		for (String name : names) {
			System.out.println(name);
			if (name.contentEquals("Alla")) {
				System.out.println("You are awesome");
			}
		}
		
		System.out.println("====Retrievig values from arrayList using regular for loop=======");
				
		for (int i=0; i<names.size(); i++) {
			String name1= names.get(i);
			System.out.println(name1);
		}

		System.out.println("====Retrievig values from arrayList using iterator method=======");
		
		// inside of our collection we have a method iterator. we call this method 
		
		Iterator<String>it = names.iterator();// iterating String objects. It will help us to iterate our collection. 
		//hasNext is there any 
			
	}
}
