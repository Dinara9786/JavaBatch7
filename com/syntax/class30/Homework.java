package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework {
	
	//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 
	
    public static void main(String[] args) {
		
    	ArrayList<String> drinks = new ArrayList<>();
    	
    	drinks.add("juice");
    	drinks.add("vodka");
    	drinks.add("tea");
    	drinks.add("nectar");
    	drinks.add("wine");
    	
    	System.out.println(drinks);
    	
    	for (int i=0; i <drinks.size(); i++) {
    		if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
    			drinks.set(i, "water");
    		}
    	}
    	
    	System.out.println(drinks);
    	
	
    
    //Create an arrayList of even numbers from 1 to 50. Remove any number that is divisible by 5 from that arrayList.
    
    ArrayList<Integer> numbers = new ArrayList <>();
    
    for (int j=1; j<50; j+=2) {
    	numbers.add(j);
    }
    System.out.println(numbers);
    
    Iterator<Integer>number = numbers.iterator();
    
    while (number.hasNext()) {
    	if (number.next()%5==0) {
    		number.remove();
    	}
    }
    System.out.println(numbers);
    
   
   
    }
    
    

}
