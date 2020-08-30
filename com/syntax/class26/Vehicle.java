package com.syntax.class26;

public abstract class Vehicle{

	public String vinNumber; // instance variable
	public static int totalVehicles; // static
	
	public Vehicle (String vinNumber) { // Constructor cannot be static 
		this.vinNumber=vinNumber;
		totalVehicles++; // increase number of vehicles
	}
	
	public static int getTotal () {
		return totalVehicles;
	}
	
	public void drive () {
		System.out.println("Press gas and start moving");
	}

	public void stop () {
		System.out.println("Vehicles will stop");
	}

	abstract void start();
	abstract void openTrunk();
}

class Bus extends Vehicle {
	public Bus (String vinNumber) {
		super(vinNumber);
	}
	
	public void start () {
		System.out.println("Insert the keys");
	}
	
	public void openTrunk () {
		System.out.println("Open manually");
	}
}
abstract class Car extends Vehicle {
	public Car (String vinNumber) {
		super(vinNumber);
	}
	
	public void openTrunk () {
		System.out.println("Open trunk manually");
	}
}

class Lamborgini extends Car {
	public Lamborgini (String vinNumber) {
		super (vinNumber);
	}
	
	public void start () {
		System.out.println("insert the key and start the engine magically");
	}
}
//class Tesla extends Car {
//	
//	public Tesla (String vinNumber) {
//		super (vinNumber);
//	}
//	
//	public void start () {
//		System.out.println("The car can be started remotely");
//	}

// INTERVIEW QUESTIONS

// can we make abstract method as static? NO. we should follow rule of Overriding. But Overriding cannot be static
	
// can we make abstract class as final ? NO. Final is unchangeable. Using Final we are defining that our entity has been completed. 
	
// can we make abstract class as private? NO. we should follow rule of Overriding. Private does not participate in Inheritance
	
	


