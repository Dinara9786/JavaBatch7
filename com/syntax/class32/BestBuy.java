package com.syntax.class32;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BestBuy {
//	Create a map of Best Buy store. Place
//	item id and item name into it. 
//	Example (7664847 = Printer, 7879885= TV etc )
//
//	Retrieve all keys and values from a Best Buy map using EntrySet.

	public static void main(String[] args) {
		
		
		Map <Integer, String> bestb = new LinkedHashMap<>();
		
		bestb.put(7664847, "Printer");
		bestb.put(787988, "TV");
		bestb.put(71245, "Laptop");
		bestb.put(712, "Monitor");
		
		System.out.println(bestb); // this is map {}
		
		Set <Entry<Integer, String>> entry = bestb.entrySet();
		System.out.println("Set of Entry objects" + entry);//collection???
		
		
		for (Entry <Integer, String> ent:entry) {
			System.out.println(ent.getKey()+ "==" + ent.getValue());
		}
		System.out.println(" ====== using Iterator ========");
		System.out.println();
		
		Iterator<Entry<Integer, String>> iterator = entry.iterator();
		while(iterator.hasNext()) {
			Entry<Integer, String> ent = iterator.next();
			System.out.println(ent.getKey()+ "==" + ent.getValue());
		}
		
	}
	
}
