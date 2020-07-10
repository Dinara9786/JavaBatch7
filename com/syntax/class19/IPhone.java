package com.syntax.class19;

public class IPhone {
	
	static String brand = "Apple";
	static String operatingSystem = "iOS";
	static boolean touchScreen=true;
	
	
	String model;
	int memory;
	double price; 
	String color;
	
	static void displayInfo() {//static works only with static
		System.out.println("IPhone belongs to brand " + brand + " and it has operating system " + 
				operatingSystem + " and all iPhones have touchScreen = " + touchScreen);
	}
	
//	static void displayDetails() {// static methods cannot access instance method/non=static members/variables
//		System.out.println("We build iPhone " + model + " with memory = " + memory + " in " + color  + 
//				"and for the price " + price);
	
	void displayDetails() {//instance workswith static and non static
	System.out.println("We build iPhone " + model + " with memory = " + memory + " in " + color  + 
			"and for the price " + price);
	}
	
	//can instance method/static method access static memebers?
	
}
