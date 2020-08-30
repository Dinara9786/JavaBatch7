package com.syntax.class24;

public class Programming {
	
	public String name;
		
	public void programming () {
		System.out.println("I love programming languages");
	}
	
	public void programming (String programming){
		System.out.println("I love " + programming);
		
	}
	
	public static void main (String [] args) {
		
		Programming obj = new Programming ();
		
		obj.programming();
		obj.programming("Java");		
		
	}
}
