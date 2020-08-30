package com.syntax.class31;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Question {
	
	public static void main(String[] args) {
		
		List <String>aList = new ArrayList<>();
		
		aList.add("John");
		aList.add("Mary");
		aList.add("Mary");
		aList.add("John");
		aList.add("Alex");
		
		
		// we do not want duplicates, then we convert to Set
		
		Set<String> set = new LinkedHashSet<>(aList);
		
		//      set.addAll(aList);
		System.out.println(set);
		
		
		// how to get only 1 specific element
		
		Set<String>country = new LinkedHashSet<>();
		
		country.add("USA");
		country.add("France");
		country.add("Canada");
		country.add("Italy");
		country.add("Denmark");
		
		List<String> list = new ArrayList<>(country);
		
		String countr =list.get(2);
		System.out.println(countr);
		
	}

}
