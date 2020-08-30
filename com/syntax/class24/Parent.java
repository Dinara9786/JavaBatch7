package com.syntax.class24;

public class Parent {
	
	private void hello () {// private methods not participate in inheritance
		System.out.println("Hello from parent class");
	}
	
	protected static void hi() {
		System.out.println("Hi from parent class");
	}
}

class Child extends Parent {
	
	// creating own method inside Child class
	private void hello () {
		System.out.println("Hello from child class");
	}
	
	public static void hi () {
		System.out.println("Hello from child class");
	}

}
