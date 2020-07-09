package com.syntax.class13Duplicate;

public class DogHouse {
	
	public static void main(String[] args) {
		
	Dog dog1 = new Dog ();
	
	dog1.breed = "Lambrador";
	dog1.color = "Yellow";
	dog1.age = 3; 
	dog1.ears = "long";
	
	System.out.println(dog1.breed);
	
	dog1.bark();
	dog1.run();
	dog1.jump();
	
	Dog dog2 = new Dog ();
	
	dog2.breed = "Buldog";
	dog2.color = "Greay";
	dog2.age = 2; 
	dog2.ears = "short";
	
	System.out.println(dog2.breed);
	
	dog2.bark();
	dog2.run();
	dog2.jump();
	
	Dog dog3 = new Dog ();
	
	dog3.breed = "Husky";
	dog3.color = "Golden";
	dog3.age = 1; 
	dog3.ears = "Medium";
	
	System.out.println(dog3.breed);
	
	dog3.bark();
	dog3.run();
	dog3.jump();
	
	
	}

}
