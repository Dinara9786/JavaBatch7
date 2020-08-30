package com.syntax.class18;

public class House {

	
	public static void main(String[] args) {
		
		Cat cat1 = new Cat(); //cat 1 is local variable
		
		cat1.name = "Jessy";// accessing instance variable and assigning value 
		cat1.age = 8; 
		cat1.color = "grey";
		
		// to access static variables we use name of the class where they were declared
//		
//		System.out.println("number of paws is " + Cat.paws);
//		System.out.println("number of paws is " + Cat.tail);
//		System.out.println("number of paws is " + Cat.mustache);
		
		String color = "Yellow"; // declaring local value
		
		Cat cat2 = new Cat();
		
		cat2.name = "Lucy";
		cat2.age = 6; 
		cat2.color = "white";
		
		cat2.name = "Bonchuk";
		cat2.mustache = false; //-- > possible throuh the variable , but not the correct way
		Cat.tail = false; // correct way accessing using Class
		
		cat1.displayInfo();
		cat1.displayCommonFeatures();
		
		cat2.displayInfo();
		cat2.displayCommonFeatures();
				
		Cat cat3 = new Cat();
		
		cat3.name = "Cathy";
		cat3.age = 3; 
		cat3.color = "yellow";
		cat3.displayInfo();
		cat3.displayCommonFeatures();
	
		
	}
}
