package com.syntax.class16_2;

public class DifferentMethods {
	
	// let's create method that says hello any number of times
	
	void sayHello(int times) {
		for (int i=1; i<=10; i++) {
			System.out.println("Hello");
			
			
		}
	}
	
	// create that will print any word any number of times
	
	void printAnyWord (String word, int times) {
		
		for (int i=1; i<=10; i++) {
			System.out.println(word);
	}
	}
	
	//let us create a method isHungry that will accept boolean value 
	// and print it, if passed value is true -- > go cook, otherwise 
	// we print go study
	
	void isHungry (boolean areYouHungry) {
		if (areYouHungry) {
			System.out.println("please cook for yourself");
		}else { 
			System.out.println("go study");
		}
	
	}

}
 