package com.syntax.class13Duplicate;

public class Dog {
	
	String breed;
	String color;
	int age;
	String ears;
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog ();
		
		d1.breed = "Labrador";
		d1.color = "yellow in black spots";
		d1.ears = "long";
		d1.age = 3;
		
		d1.bark();
		d1.run();
		d1.jump();
	}
	
	void bark () {
		System.out.println(breed + " can bark");
	}
	void run () {
		 System.out.println( breed + " can run");
	}
	void jump () {
		System.out.println(breed + " can jump");
	
	}
	
	

}
