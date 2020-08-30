package com.syntax.class25;

public class Store {

	String name, location;
	
	public Store (String departmentName, String location) {
		this.name=departmentName;
		this.location=location;
	}
	
	public void openHours() {
		System.out.println("Stores are open from 8AM to 8PM");
	}
	
	public void sell() {
		System.out.println("Stores sell items");
	}
}

class Macys extends Store {
	
	public Macys(String departmentName, String location) {
		super (departmentName, location);
		
	}
	
	public void openHours () {
		System.out.println(name + " open everyday from 8 am to 8pm at " + location);
	}
	
}

class Starbucks extends Store {
	public Starbucks (String name, String location) {
		super (name, location);
		
	}
	public void openHours () {
		System.out.println(name + " is open everyday rom 6am to 8pm at " + location);
	}
	
	public void sellDrinks() {
		System.out.println(name + " sells different type of drinks");
	}
}

class Nike extends Store {
	
	String shoes;
	public Nike (String name, String location, String shoes) {
		super (name, location);
		this.shoes = shoes;
		
		
	}
}