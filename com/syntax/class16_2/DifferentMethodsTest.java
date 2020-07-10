package com.syntax.class16_2;

public class DifferentMethodsTest {
	public static void main(String[] args) {
		
		DifferentMethods obj= new DifferentMethods();
		
		// call method sayHello
		obj.sayHello(5);
		
		System.out.println("====================");
		
		
		//call method printAnyWord
		obj.printAnyWord("I love you", 3);
		
		obj.printAnyWord("Bye",5);
		
		//obj.printAnyWord(5, "Bye"); //CE we should follow sequence
		
		//call method isHungry
		
		obj.isHungry(true);//accepts only boolean value true or false
		
	}

}
