package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListIntro {
	
	public static void main(String[] args) {
		
		ArrayList<String>arrayList=new ArrayList<>();
		// to add values to the array list. to have method add
		
		arrayList.add("Hello");//0
		arrayList.add("Welcome");//1
		arrayList.add("How are you");//2
		
		System.out.println("Original arrayList is  " + arrayList);
		
		// how many elements inside my ArrayList
		int arrayListSize = arrayList.size();
		System.out.println("Size of origial arrayList" + arrayListSize);
		
		// how to access elements from ArrayList 
		String elementIndex2 =arrayList.get(2);
		System.out.println(elementIndex2);
		
		// I would like to add more Objects into ArrayList
		
		arrayList.add("Good bye");//4
		arrayList.add("thank you");//5
		
		System.out.println("Size of ArrayList after adding more String objects " + arrayList.size());
		
		System.out.println("==========ArrayList after adding more String objects====================== " + arrayList);
		
		// I want to remove element "Hello"
		
		arrayList.remove(0);
		System.out.println("size of arrayList after removing Object " + arrayList.size());
		
		// I want to update value "good bye" to "Bye". this method is called set
		
		arrayList.set(2, "Bye" ); // replaced Good Bye with Bye
		System.out.println(arrayList);
		System.out.println("arrayList after removing Object " + arrayList.size());
		
		
		
		
		
	}
}
