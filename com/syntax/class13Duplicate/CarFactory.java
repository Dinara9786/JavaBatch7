package com.syntax.class13Duplicate;

public class CarFactory {
	public static void main(String[] args) {
	
		// this is execution code
		
	Car car1=new Car(); // subject
	//building 1 car. This is an object
	// define car features using variables
	
	car1.make = "Tesla"; //variable
	car1.model = "X";
	car1.color = "red";
	car1.year = 2020;
	car1.speed = 200;
	System.out.println(car1.make);
	
	System.out.println("===========Accessing methods from Car class using car1============");
	
	//actions, behavior
	car1.drive();
	car1.reverse();
	car1.transportPeople();
	System.out.println("===============================================================");
	
	Car car2=new Car();
	//building 2 car. This is an object
	car2.make = "BMW";
	car2.model = "M5";
	car2.color = "Blue";
	car2.year = 2018;
	car2.speed = 240;
	System.out.println(car2.make);
	
	System.out.println("===========Accessing methods from Car class using car2============");
	
	car2.drive();
	car2.reverse();
	car2.transportPeople();
	
	System.out.println("===============================================================");
	
	Car car3=new Car();
	//building 2 car. This is an object
	car3.make = "Toyota";
	car3.model = "Avalon";
	car3.color = "Orange";
	car3.year = 2019;
	car3.speed = 190;
	System.out.println(car3.make);
	
	System.out.println("===========Accessing methods from Car class using car3============");
	
	car3.drive();
	car3.reverse();
	car3.transportPeople();
	
	System.out.println("==================================================================");
	
	Car car4=new Car();
	//building 2 car. This is an object
	car4.make = "Ferrari";
	car4.model = "Ferrari2";
	car4.color = "BrightRed";
	car4.year = 2020;
	car4.speed = 270;
	System.out.println(car4.make);
	
	System.out.println("===========Accessing methods from Car class using car4============");
	
	car4.drive();
	car4.reverse();
	car4.transportPeople();
	
	
	//new Bus(); compiler will give an error
	//because we never created Bus class
	
	//actions, behavior
//	car1.drive();
//	car1.reverse();
//	car2.transport();
	
	}
}
