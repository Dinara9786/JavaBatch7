package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {
	
	public static void main(String[] args) {
		
	// I need collection that can store double objects and can have duplicates and I woulud like to maintain the order
		
			// double is a wrapper
	ArrayList<Double>numbers = new ArrayList<>();// when we create an object we do not have to specify the type coz java8
	
	numbers.add(10.99);// boxing primitive in double type
	numbers.add(9.99);
	numbers.add(8.99);
	numbers.add(10.99);
	numbers.add(10.99);
	
	Double num = numbers.get(2);// storing in Object (Doulbe) 
	double num1 = numbers.get(1);// storing as primitive type (double)
	
	System.out.println(numbers);
	
	//difference between num and num1 is num is Object and num1 is primitive. because Double is class.  
	//and with object type  - methods are available
	
	System.out.println("==========retrieving elements using advanced loop========");
	
	for (Double number:numbers) {
		System.out.print(number + " ");
	}
	
	System.out.println();
	System.out.println("==========retrieving elements backwards using for regular loop========");
	
	for (int i = numbers.size()-1; i>=0; i--) { // size returns the number of elements
		double myNum = numbers.get(i);
		System.out.print(myNum + " ");
	}
	
	System.out.println();
	System.out.println("==========retrieving elements using iterator=======");
	
	Iterator <Double> it = numbers.iterator();
	
	//inside Iterator 3 methods
	//next(); = > gets next object
	// hasNext(); = > it checks if there is any next element
	//remove(); => removes element from the collection
	
	double d = it.next();
	double d1 = it.next();
	System.out.println(d1);
	
	System.out.println("==========printing all values using iterator=======");

	while (it.hasNext()) {
		System.out.println(it.next() + " ");
	}
	
	System.out.println("==========printing all values using new iterator object =======");
	
	Iterator<Double> doubleIt=numbers.iterator();
	while (doubleIt.hasNext()) {
			System.out.print(doubleIt.next() + " ");
	}
	System.out.println();
	System.out.println("==========remove element using iterator object ======="); // using iterator is the best way to remove object 
	// iterator is static
	
	Iterator<Double> doubleItremove=numbers.iterator();
	while (doubleItremove.hasNext()) {
		double element = doubleItremove.next();// unboxing 
		if (element <10) {
			doubleItremove.remove();// removing element from collection
		}
	}
	System.out.println(numbers);
}
}
