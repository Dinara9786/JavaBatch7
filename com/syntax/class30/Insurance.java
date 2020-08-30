package com.syntax.class30;

public abstract class Insurance {
	
//  Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance. 
//  Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
//  Create 3 objects of the sub classes and store them in ArrayList. 
//  Using for loop/advanced for loop/ iterator access all methods of the class. 

	public String insuranceName;
	
	public Insurance(String insuranceName) {
		this.insuranceName=insuranceName;
		
	}
	public abstract void getQuote();
	public abstract void cancelInsurance();
}

class Car extends Insurance {
	
	public String carModel;
	
	Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel=carModel;
	}
	public void getQuote() {
		System.out.println("Car model of " + carModel + " " + " will get quote");
	}
	public void cancelInsurance () {
		System.out.println("Car will cancel insurance");
	}
}
class Pet extends Insurance {
	
	public String petType;

	Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType=petType;
	}
	
	public void getQuote () {
		
		System.out.println("Pet "+ petType + " will get quote");
	
	}
	public void cancelInsurance () {
		System.out.println("Pet will cancel insurance");
	}
}
class Health extends Insurance {
	
	Health (String insuranceName) {
		super(insuranceName);
	}
	
	public void getQuote () {
		
		System.out.println("Everybody should get health insurance quote");
	
	}
	public void cancelInsurance () {
		System.out.println("Everybody should not cancel health insurance");
		
	}

}
