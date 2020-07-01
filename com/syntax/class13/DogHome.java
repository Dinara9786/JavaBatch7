package com.syntax.class13;

public class DogHome {

	public static void main(String[] args) {
		
System.out.println("=================Husky=================");
		
		Dog dog1 = new Dog ();
		
		dog1.breed = "Husky";
		dog1.color = "Grey";
		dog1.age = 5;
		dog1.type = "Home";
		
		dog1.bark();
		dog1.hunt();
		dog1.jump();
		dog1.run();
		
System.out.println("=================Bulldog=================");
		
		Dog dog2 = new Dog ();
		
		dog2.breed = "Bulldog";
		dog2.color = "Balck";
		dog2.age = 1;
		dog2.type = "Fighting";
		
		dog2.bark();
		dog2.hunt();
		dog2.jump();
		dog2.run();
System.out.println("=================Labrador=================");
		
		Dog dog3 = new Dog ();
		
		dog3.breed = "Labrador";
		dog3.color = "Green";
		dog3.age = 15;
		dog3.type = "Street";
		
		dog3.bark();
		dog3.hunt();
		dog3.jump();
		dog3.run();
		
		
	}
}
