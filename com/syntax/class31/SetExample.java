package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		
		// create an object of HashSet 
		HashSet < String> brands = new HashSet<>();
		//LinkedHashSet = does not keep order, no duplicates
		
		brands.add("Nike");
		brands.add("Adidas");
		brands.add("H&M");
		brands.add("Zara");
		brands.add("Uniqlo");
		brands.add("Adidas");
		brands.add("H&M");
		
		System.out.println(brands);
		System.out.println(brands.size());
		
		// how to verify if element is there
		
		boolean isItThere = brands.contains("Nike");
		System.out.println(isItThere);
		
		// how to access element from a Set collection?
		//brands.get() is not availabe to objects of Set Type
		
		Iterator <String> iterator = brands.iterator();
		String obj = iterator.next();
		System.out.println(obj);
		
		String obj1 = iterator.next();
		System.out.println(obj1);
		
		System.out.println("============retrieving elements one by one usig while loop from iterator object ==============");
		
		while (iterator.hasNext()) {
			obj = iterator.next();
			System.out.println(obj);
		}
		
		// if we need to iterate over entire collection again we need a NEW ITERATOR OBJECT
		
		System.out.println("============retrieving elements one by one usig while loop to get values from iterator object ==============");
		
		Iterator<String>it = brands.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// is there other way to get all elements from Set collection?
		
		System.out.println("============ using enhanced loop to get values from set collection ==============");
			for (String brand : brands) {
				System.out.println(brand);
			}
					
		System.out.println("============creating an object of LinkedHashSet ==============");

					
			LinkedHashSet <String> luxBrand = new LinkedHashSet();
			//LinkedHashSet = keeps order, no duplicates
			
			luxBrand.add("Prada");
			luxBrand.add("Chanel");
			luxBrand.add("Gucci");
			luxBrand.add("LV");
			luxBrand.add("Gucci");
			luxBrand.add("LV");
			
			System.out.println(luxBrand.size());
			System.out.println(luxBrand);
			
			System.out.println("============creating an object of TreeSet ==============");
			
			TreeSet<String> allBrands = new TreeSet<>(brands);// we passed our collection to our constructor
			
			// TreeSet will preserve the sorting of all objects. In this particular case in alphabetical order. 
			allBrands.add("Calvin Klein");
			allBrands.addAll(luxBrand);
			System.out.println(allBrands);
			
			System.out.println("===========Retrieving elements from TreeSet==================");
			
			Iterator<String> brandIterator = allBrands.iterator();
			while (brandIterator.hasNext()) {
				String obj2 = brandIterator.next();
				System.out.print(obj2 + ", ");
			}
			System.out.println();
			
			System.out.println("=========Creating an object of GTreeSet to store Double==================");
			
			Set <Double> tset = new TreeSet(); // if changed to LInkedHashSet , then order will be different, it keeps insertion order. If HashSet = there will no be insertion order
			// i am changing the object. Java will call the specified method based on object type
			
			tset.add(10.99);
			tset.add(1.99);
			tset.add(1000.99);
			tset.add(10.19);
			tset.add(10.02);
			tset.add(110.99);
			
			System.out.println(tset);// order in ascending order
	}

}
