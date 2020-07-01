package com.syntax.class13;

public class Dog {
	
//	2. Create a Dog Class and create 3 different objects of it: 
// Husky, Bulldog, Labrador 
//	with specific  attributes and behaviors.
	
	
	String breed;
	String color;
	int age;
	String type;
	
	public static void main(String[] args) {
		
	Dog d1 = new Dog ();
	
	d1.breed = "Bulldog";
	d1.color = "Balck";
	d1.age = 1;
	d1.type = "Fighting";		
	
	d1.bark(); 
	d1.hunt();
	d1.jump();
	d1.run(); 
	}	
	void bark () {
		System.out.println(breed + " can bark");
	}
	void hunt () {
		System.out.println(breed + " can hunt");
	}
	void jump () {
		System.out.println(breed + " can jump");
	}
	void run () {
		System.out.println(breed + " can run");
	}

}
