package com.syntax.class20;

public class Car {
	
	// static = global maining and belongs to Class
	
	public static String make; 
	protected String model, color;
	private double price;
	int year, door, speed;
	
	public void displayInfo () {
		System.out.println("We built " + year + " " + make + " "+ model + " for price " + price);
	}
	
	Car () {
		System.out.println("I am a constructor. I have not return type and my name is same as calss");
	}
	
	public static void main(String[] args) {
		
		/*
		 * Car -- > class name
		 * car -- > variable or reference variable
		 * new -- > key word
		 * Car (); -- > calling Constructor. It is a block of code is similar to method. -- > block of the code that initialize the obj
		 * 
		 */
		Car car = new Car ();
		
		car.make = "BMW";
		car.model = "M5";
		car.year = 2021;
		car.color = "BMW";
		car.door = 4;
		car.speed = 400;
		car.price = 3505;
		
		Car car1 = new Car ();
		
		car1.make = "BMW";
		car1.model = "M5";
		car1.year = 2021;
		car1.color = "BMW";
		car1.door = 4;
		car1.speed = 400;
		
		car.displayInfo();
		car1.displayInfo();
		System.out.println(car.model);
		
		//String driver;// driver is local variable. and it should be initialized
		//System.out.println(driver);
		
		// local variables belong to main method
		
		//local variables can never be static
		
	}

}
