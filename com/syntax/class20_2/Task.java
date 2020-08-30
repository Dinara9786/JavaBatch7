package com.syntax.class20_2;

public class Task {
	
	public static String dog;
	String color; 
	protected int year;
	
	Task () {
		System.out.println(" I have no parameters");
	}
	public void displayInfo() {
		System.out.println("I have a dog " + dog + " and its color is " + color  + " and its age is " + year);
	}
	
	Task (String dogDog, String dogColor, int dogYear) {
		color = dogColor;
		dog=dogDog;
		year=dogYear;
		
	}
	
	public static void main (String [] args ) {
		
		Task dog = new Task ("Husky", "white", 3);
		dog.displayInfo();
		
		Task t1 = new Task ();
	}

}
