package com.syntax.class18;

public class Cat {
	
	// instance variables
	String name, color;
	int age;
	
	
	// static variables and belong to class. This type of features are common to all variables
	static int paws = 4; 
	static boolean mustache = true;
	static boolean tail = true;
	
	void displayInfo() {
		System.out.println("Name of the cat is " + name + " of color "+ color + " and age of " + age);
	}
	
	void displayCommonFeatures () {
		System.out.println(name + " has number of paws of  " + paws + " and " + tail + " and " + mustache);
	}

}
