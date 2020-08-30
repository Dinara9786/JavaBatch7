package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Homework {
	
	public static void main (String [] args) {
			/*
			 * Create a map of a building. Store floor number and it is associated company
			 * name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate
			 * keys and values. Check how many entries you have? Update company on a 4th
			 * floor Remove company on the 7th floor Print your map
			 * 
			 * 2. Write code to get key and a value pair using Iterator 3. Look into
			 * EntrySet 4. Take some rest
			 */
			Map<Integer, String> floors = new LinkedHashMap<>();
			floors.put(1, "Aidana & CO.");
			floors.put(2, "Sema & CO.");
			floors.put(3, "Kamila & CO.");
			floors.put(4, "Mina & CO.");
			floors.put(5, "Sema & CO.");
			floors.put(2, "Olga & CO.");
			floors.put(6, "Kamila & CO.");
			System.out.println(" Original map :" + floors);
			System.out.println("The size of map :" + floors.size());
			
			floors.put(4, "Gozde & CO.");
			floors.remove(7);
			System.out.println("After updating floors :" + floors);
			
			Collection<String> values = floors.values();
			System.out.println("Company list :");
			
			Iterator<String> itValues = values.iterator();
			while (itValues.hasNext()) {
				System.out.println(itValues.next());
			}
			
			Set<Integer> floor = floors.keySet();
			
			Iterator<Integer> fNum = floor.iterator();
			System.out.println("Floor numbers :");
			while (fNum.hasNext()) {
				System.out.println(fNum.next());
			}
			
			System.out.println("Entry:key+value in pair");
			for (Integer keyFloor : floor) {
				System.out.println(floors.get(keyFloor));
			}
			
			System.out.println("=========================");
//			Iterator <Integer> iterator = keys.iterator();
//			while (iterator.hasNext()) {  // in Iterator assign the value and user it
//				int key = iterator.next();
//				System.out.println(key + " ====" + floors.get(key));
			
			//System.out.println(println(Iterator.next() + "================" + floors.get(iterator.next))); this line won't work
			}
			
		}
	
