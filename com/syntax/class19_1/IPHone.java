package com.syntax.class19_1;

public class IPHone {
	
	static String brand= "Apple";
	static String operatingSystem = "iOS";
	static boolean touchScreen = true;
	
	
	String model;
	int memory;
	String color;
	double price;
	
	static void displayInfo() { // static works only with static. also this method does not accept any parameters and we do not need object
		System.out.println("iPhone belongs to brand " + brand + " it has operating system of " +operatingSystem + " and all iPhones have touchscreen mode = " + touchScreen);
	}
	
//	static void displayDetails () { // static method cannot access instance/non static members/variables
//		System.out.println("We built iPHone " + model + " with memory of " + memory + " in color of " + color + " with price of " + price);
//	}  
	
		void displayDetails () { // non static method. instance method and access static and non static 
		System.out.println("We built iPHone " + model + " with memory of " + memory + " in color of " + color + " with price of " + price);
	}  

 	public static void main (String [] args ) {
 		
 		System.out.println("====================1 phone========================");
 		
 		IPHone.touchScreen=true; // static variable and it effects to all objects
 		
 		IPHone phone1 = new IPHone ();
 		phone1.model = "11 Pro";
 		phone1.memory = 256;
 		phone1.color = "white";
 		phone1.price = 1200;
 		
 		//phone1.displayInfo(); -- > possible, but not preferrable way
 		phone1.displayDetails();
 		
 		IPHone.touchScreen = false;
 		
 		System.out.println("====================2 phone========================");
 		
 		IPHone phone2 = new IPHone ();
 		phone2.model = "11";
 		phone2.memory = 128;
 		phone2.color = "silver";
 		phone2.price = 900;
 		
 		IPHone.displayInfo(); // this is correct way
 		phone2.displayDetails();
 		
 		System.out.println("====================Calling info method again========================");
 		phone1.displayInfo();
 		phone1.displayDetails();
 	}
}