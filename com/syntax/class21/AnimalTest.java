
package com.syntax.class21;

public class AnimalTest {
	
	public static void main(String[] args) {
		
		// object of parent class has an access to all variales and methods of it is own class ONLY
		Animal a = new Animal();
		a.breed = "Something";
		a.color = "greay";
		a.paws = 4;
		
		a.sleep();
		a.eat();
		
		// object of child class has an access to all variales and methods of its Parent class (Animal)		Dog dog = new Dog ();
		Dog dog = new Dog();
		dog.breed = "HUsky";
		dog.color = "Yellow";
		dog.paws = 4;
		dog.tail = true;
		
		dog.eat();
		dog.sleep();
		dog.bark();
		
		Cat cat = new Cat();
		cat.breed = "Something";
		cat.color = "white";
		cat.paws = 4;
		cat.tail = true;
				
		cat.eat();
		cat.sleep();
		cat.purr();
		
	}
	

}
