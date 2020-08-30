String ()package com.syntax.class20;

public class Laptop {
	
//	1. 	Write a program that will have a constructor: one with parameters and second without any parameters. 
//		Create a separate Test class where you will execute both of the constructors 1 by 1.
//	2.	Write a java program of Class Students that takes students name and 3 subject grades. 
//		Inside your class also have a method to Calculate Average Grade. 
//		Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.

	public static String make = "Apple";
	int year, memory;
	double price; 
	String model, color;
	
	
	public void displayInfo () {
		System.out.println("I have a laptop of " + model + " for price $ " + price + " and year " + year + " of "+ color + " having memory of size "+ memory);
	}
	
	Laptop (String laptopModel, String laptopColor, int laptopYear, int laptopMemory, double laptopPrice) {
			model = laptopModel;
			color = laptopColor;
			year = laptopYear;
			price = laptopPrice;
			memory=laptopMemory;
	}
	
}
