package com.syntax.class25;

public class TestClass {

	public static void main(String[] args) {
		
		SuperClass c = new Subclass();
		c.enjoy(); // static from parent class will get executed
		
		SuperClass.enjoy();
		Subclass.enjoy(); // cannot see parent class only your own method
		
	}
}




