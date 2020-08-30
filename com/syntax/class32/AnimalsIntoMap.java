package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AnimalsIntoMap {
	
	public static void main(String[] args) {
		
		Map<Integer, Animal> life = new LinkedHashMap<>();
		
		life.put(1, new Dog ("Dog", "Grey"));
		life.put(1, new Zebra ("Zebra", "White-Black"));
		life.put(1, new Monkey ("Monkey", "Brown"));
		
		System.out.println(" 1.         Using EntrySet                 ");
		
		Set<Entry<Integer, Animal>> entries = life.entrySet();
		
		System.out.println("   Access all variables and call all availables methods             ");
		
		for (Entry <Integer, Animal> ent :entries) {
		Animal animal = ent.getValue();
		System.out.println(animal.type);
		System.out.println(animal.color);
		animal.eat();
		animal.sleep();
		System.out.println(" ------------------  ");
		
	}
		Iterator<Entry<Integer, Animal>> iterate = entries.iterator();
        while(iterate.hasNext()) {
        	Entry<Integer, Animal> ent = iterate.next();
        	Integer key = ent.getKey();
        	Animal animal = ent.getValue();
        	System.out.println(animal.type);
        	System.out.println(animal.color);
        	animal.eat();
        	animal.sleep();
        	System.out.println("--------------------");
        }
		// write with Iterator
		System.out.println(" 2. ----------    Using values()     -----------    ");
		
		Collection <Animal> values = life.values(); // life is MAP
		for (Animal animal :values) {
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
	}
	
	// write with Iterator
	
	System.out.println(" 3. ----------    Using keySet()     -----------    ");

	Set<Integer> keys = life.keySet();
	
	for (int key:keys) {
		
	Animal animal = life.get(key);
	System.out.println(animal.type);
	System.out.println(animal.color);
	animal.eat();
	animal.sleep();
	
	System.out.println("------------------");
	}
	
	// write with Iterator
	
	}
}
