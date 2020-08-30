package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList <String> food = new LinkedList<>();
		
		food.add("Beshbarmak");
		food.add("pizza");
		food.add("biryani");
		food.add("tacos");
		
		//System.out.println(food.get(2));
		String myFood=food.get(2); // we remove element using index (2)
		System.out.println(myFood);
		
		
		LinkedList <String> deserts = new LinkedList<>();
		deserts.add("cake");
		deserts.add("ice cream");
		deserts.add("cookies");
		
		food.addAll(deserts);
		System.out.println(food);
		
		food.remove("pizza"); // we remove element using index object (pizza)/ remove method here belongs to collection
		System.out.println(food);
		
		food.set(3, "brownie"); // replacing cake with brownie, using method set
		
		//food.clear(); // remove all the elements
		
		// I want to get all values 1 by 1
		
		Iterator<String> foodIt = food.iterator();
		
		while(foodIt.hasNext()) {
			String fooood = foodIt.next();
			System.out.print(fooood + ", ");
			
			if (fooood.equals("cookies") || fooood.contentEquals("brownie")) {
				foodIt.remove(); // remove method here does not accept any parameters. the method remove belongs to iterator
			}
			
		}
		System.out.println();
		
		// lets create list with Country type of objects
		
		LinkedList<Country> countries = new LinkedList<>();
		 countries.add(new USA("USA"));
		 countries.add(new Kazakhstan("Kazakhstan"));
		 countries.add(new Italy ("Italy"));
		 
		 System.out.println("Collection of Country Object has " + countries.size() + " elements");
		 
		 for (Country count:countries) {
			 count.election();
		 }
		 
		 
		LinkedList<String> webelements = new LinkedList<>();
		
		
		
		
		
		}

}
