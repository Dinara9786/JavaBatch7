package com.syntax.class27;

public interface Drivable { // interface is a collection of public abstract methods and public static final variables
	
	String DRIVE = "Drive safe";//by default compiler will add 	public static final
	
	//int maxSpeed; cannot have isntance variables because compiler adds PSF
	
	void driving();//public abstract to the methods
	
	void breaking();
}
//we can extend ONLY 1 class but we can implement MULTIPLE interfaces
								//parent			//interface
abstract class Motorcycle extends Vehicle implements Drivable {
	
	public void driving () {
		System.out.println("Motorcycle is driving");
	}	
}

class Bike extends Motorcycle { // Concrete class
	public void breaking () {
		System.out.println("Bike has breaks");
	}
}

class Vehicle {
	public void operateVehicle () {
		System.out.println("To operate Vehicle you need driver license");
	}
}