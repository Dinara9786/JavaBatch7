package com.syntax.class13Duplicate;

public class Car {
	
	//this is blueprint/template
	// define car features in a from of variables
	String make;
	String model;
	String color;
	int year;
	int speed;
	
	public static void main (String []args ) {
		
		System.out.println("Hello I am a code from main method");
		
	 Car car1=new Car();
	 
	 car1.make = "Toyota";
	 car1.model = "Camry";
	 car1.color = "Yellow";
	 car1.year = 2020;
	 car1.speed = 240;
	 
	 //calling method drive
	 car1.drive();
	 //calling method transportPeople
	 car1.transportPeople();
	 //calling method stop
	 car1.stop();
	 //calling method reverse
	 car1.reverse();
	}
	 
	//define behavior in a from of methods
	
	void drive() {
		System.out.println(make+ " can drive");
	}
	
	void reverse () {
		System.out.println(make + " can reverse");
	}
	
	void transportPeople () {
		System.out.println(make + " can transport people");
	}
	
	void stop () {
		System.out.println(make+ " will stop when press break");
		System.out.println(make+ " stop");
	}
	
	
	
	

}
