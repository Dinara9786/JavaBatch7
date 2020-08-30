package com.syntax.class20;

public class ConstructorTypes {
	
	
//	if I want to create a constructor
//	 we should follow 2 rules we have to follow
//	No return type, not even void
//	2. Name must be same as CLASSNAME

	ConstructorTypes () {
		System.out.println("I am a constructor");
		
	}
	
	ConstructorTypes(String str) {
		System.out.println("I am a constructor with 1 String parameter " + str);
		
	}
	
	ConstructorTypes(int num) {
		System.out.println("I am a consturctor with  1 int parameter " + num);
	}
	
	ConstructorTypes(double num1) {
		System.out.println("I am a consturctor with 1 double parameter " + num1);
	}
	
	ConstructorTypes(String name, int age) {
		System.out.println("I am a consturctor with 2 parameters " + name +" "+ age);
	}
	
	public static void main(String[] args) {
		
		ConstructorTypes obj = new ConstructorTypes("Akerke", 15);
		System.out.println("I am a code inside main method");
		speak("Hello Class");
	}
	
	
	static void speak (String str ) {
		System.out.println(str);
	}
}
