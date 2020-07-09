package com.syntax.class13Duplicate;

public class Phone {
	
	String make;
	String model;
	String color;
	int size;
	
	public static void main (String [] args) {
		
	Phone ph1 = new Phone ();
	
	ph1.make = "Iphone";
	ph1.model = "XR11";
	ph1.color = "white";
	ph1.size = 128;
		
	ph1.dial();
	ph1.touchscreen();
	ph1.makePhoto();	
		
	}
	
	void dial () {
		System.out.println(make +" can dial");
	}
	void touchscreen () {
		System.out.println(make + " is having touchscreen mode");
	}
	 void makePhoto () {
		 System.out.println(make + " can make photos and videos");
	 }
	

}
