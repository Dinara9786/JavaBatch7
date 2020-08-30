package com.syntax.class22;

	public class Car {
	
	String make;
	
	public Car(String make) {
		this.make = make;
	}

}
	 class Tesla1 extends Car {
		 
		 boolean autopilot;
		 
		// Tesla1 () {//child class
			 
			 public Tesla1 (String make, boolean autopilot) {
			 
			super(make);
			this.autopilot=autopilot;
			 
		 }
			 
			 void info () {
				 System.out.println("We build " + make + " " + " that has autopilot features " + autopilot);
			 }
		 }