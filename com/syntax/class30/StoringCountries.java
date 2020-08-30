package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class StoringCountries {
	
	public static void main(String[] args) {
		
		//Country [] countr = {new USA ("USA"), new Kazakhstan ("Kazakhstan"), new Italy ("Italy")};
		
		ArrayList<Country> countries = new ArrayList<>(); // Country is user defined object
		
		countries.add(new USA ("USA"));
		countries.add(new Kazakhstan ("Kazakhstan"));
		countries.add(new Italy ("Italy"));
		
		System.out.println("============Printing using regular for loop============");

		for (int i = 0; i>countries.size(); i++) {
			countries.get(i).election();
		}
		
		System.out.println("============Printing using enhanced loop============");

		for (Country country:countries) {
			country.election();	
		}
		
		System.out.println("============Printing using Iterator============");
		
		Iterator<Country> countryIt = countries.iterator();
		
		while (countryIt.hasNext()) {
			countryIt.next().election();
		}
		
		
	}

}
