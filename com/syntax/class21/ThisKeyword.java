package com.syntax.class21;

public class ThisKeyword {
	
	int a, b; 
	
	ThisKeyword () {
		System.out.println();
		System.out.println("I am a constructor that you do need");
	}
	
	ThisKeyword  (int a, int b) {
		this.a = a; 
		this.b = b;
		
	}
	
	void sum (int a, int b) {
		//checks sum of local variables
		System.out.println(a=+b);
		//how to get sum of instance variables?
		System.out.println(this.a+this.b);
	}

	public static void main (String [] args) {
		
	
		ThisKeyword obj = new ThisKeyword(100, 200);
		obj.sum(10, 20);
		
		ThisKeyword obj1 = new ThisKeyword();
		obj1.sum(20, 50);
	}
}
	
	