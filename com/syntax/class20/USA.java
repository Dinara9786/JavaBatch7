package com.syntax.class20;

public class USA {
	
	// define 2 variables for state and capital and have a constructor to initialize it.
	
	public static String country;
	String state; // instance variable
	String capital; // instance variable
	
	USA (String state, String capital) { // local variables that declared inside constructor
		this.state= state; // local variable
		this.capital=capital; // local variable
		
		// when instance and local variables have the same names, then we add key word -- > this.
		
	}
	
	public void display() {
		
		System.out.println("The State is " + state + " and capital is " + capital);
		
		
	}
	public static void main(String[] args) {
		
		USA state = new USA ("Virginia", "Richmond");
		state.display();
		
	}

}
