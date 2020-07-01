package com.syntax.class13;

public class Phone {
	
//	1. Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia 
//	with specific  attributes 	and behaviors.

	String model; 
	String color;
	int year; 
	int camera;
	int memory;
	
	public static void main(String[] args) {
		
	Phone ph1 = new Phone ();
	ph1.model = "iPhone"; 
	ph1.color = "white";
	ph1.year = 2019;
	ph1.camera = 2;
	ph1.memory = 256;
	
	ph1.dial();
	ph1.makePicturesVideos();
	ph1.touchScreen();
	
	}
	void dial() {
	
		System.out.println( model + " can dial");
	}
	void makePicturesVideos() {
		System.out.println( model + " can makePicturesVideos");
	}
	void touchScreen () {
		System.out.println( model + " touchScreen");
	}
}


