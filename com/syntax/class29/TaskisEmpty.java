package com.syntax.class29;

import java.util.ArrayList;

public class TaskisEmpty {
	
//	Create an ArrayList that will store 5 names into it. 
//	Find out whether the given ArrayList is empty or not? 
//	Check whether the specific name is present in an ArrayList or not?
//	Find the size of your arrayList and print all values from that

	public static void main (String [] args) {
		
		ArrayList<String> arrList = new ArrayList<>();
		
		arrList.add("Dunkin Doughnuts");
		arrList.add("Baskin Robins");
		arrList.add("Sturbacks");
		arrList.add("Vanilla Sky");
		arrList.add("Bublik");
		
		arrList.isEmpty();
		
		System.out.println(arrList);
		
		System.out.println(arrList.size());
		System.out.println(arrList);
		arrList.clear();
		System.out.println("Collection after clear is " + arrList);
		
		ArrayList<String>list =new ArrayList<>();
		list.add("Anna");
		list.add("Alla");
		list.add("Igor");
		list.add("Senya");
		list.add("Gozde");
		//arrayName.add(10.99); CE
		
		arrList.addAll(arrList);
		
		System.out.println("Collection after add All is " + arrList);

		System.out.println(list);
		//System.out.println("Is ArrayList empty? ” + list.isEmpty());
		//System.out.println("Does ArrayList contain name Kamila? “+list.contains(“Kamila”));
		//System.out.println("The size of ArrayList is “+list.size());
		
		//Generic Collection - this being used now
		ArrayList<String> myList = new ArrayList<>(list); // generic type of collection
		System.out.println(myList);
		
		//Integer num = alist.get(1);
		
		// before java 1.5 collections was not Generic
		// non generic collection - old version and not preferrable and Compiler gives warning
		ArrayList arList = new ArrayList ();
		arList.add("String");
		arList.add(100);
		
		
		
		
		
		
		
		
		
		
		
	}
	}
	
	
	

