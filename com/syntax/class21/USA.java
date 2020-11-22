package com.syntax.class21;



public class USA {
	// define 2 variables for state and capital and have a constructor to initialize it.
	
		public static String country;
		String state; // instance variables
		String capital; // instance variables
		
		USA (String state, String capital) { // local variables that declared inside constructor
			this.state= state; // local variable
			this.capital=capital; // local variable
			
			// when instance and local variables have the same names, then we add key word -- > this.
			
		}
		
		public void displayState() {
			
			System.out.println("The State is " + state );
				
		}
		
		public void displayCapital() {
			
			System.out.println("The capital is " + capital);
		}
		public void displayInfo() {
			System.out.println("I live in State " + state + " and in the city of " + capital);
					displayState(); //this keyword calls instance method//this.displayState
					displayCapital();//this.displayCapital (); Compiler adds this to refer to method				
		}	
		
		public static void main(String[] args) {
			
			USA obj = new USA ("Virginia", "Richmond");
			obj.displayInfo();
			
		}

	}



