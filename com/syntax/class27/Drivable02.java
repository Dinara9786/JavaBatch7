package com.syntax.class27;

public interface Drivable02 {
	
	String DRIVE="Drive safe"; // by default compiler adds public static final to variables
	
	//int maxSpeed; cannot have instance variables because compiler adds PSF (public static final)
	
	// we cannot create of object of it
	
	void driving (); // compiler will add public abstract by default
	
	void breaking();
	}

// we can extends only 1 class but we can implement MUTlIPLE interfaces
abstract class Motorcycle02 extends Vehicle02 implements Drivable02 { // from class to interface we are using keyword IMPLEMENTS
	//abstract class
	public void driving () {
		System.out.println("Motorcycle is driving");
	}
}

class Bike02 extends Motorcycle02 {// concrete class
	
	public void breaking () {
		
		System.out.println("Bikes can break");
	}
}

class Vehicle02 { 
	public void operateVehicle() {
		System.out.println("Operate any vehicle you need to have driver licence");
	}
}
