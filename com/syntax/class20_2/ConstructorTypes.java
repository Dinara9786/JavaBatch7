package com.syntax.class20_2;

public class ConstructorTypes {
	
	ConstructorTypes() { // i created a constructor
		System.out.println("I am a constructor");
	}
	
	ConstructorTypes(String str) {
		System.out.println("I am a constructor with 1 parameter " + str);
	}
	
	ConstructorTypes (int num) {
		System.out.println("I am a constructor with 1 int parameter " + num);
	}
	
	ConstructorTypes (double num1) {
		System.out.println("I am a constructor with 1 int parameter " + num1);
		
	}
	
	ConstructorTypes (String name, int age) {
		System.out.println("I am a constructor with 2 parameters " + name + " " + age);
	}
	
	public static void main(String[] args) {
		
		ConstructorTypes obj = new ConstructorTypes("Dinara", 49);  // I am callign a constructor
		
		System.out.println("I am inside main method");
		
		speak("Hello Class");
		
	}
	
	static void speak (String str) {
		System.out.println(str);
	}

}
