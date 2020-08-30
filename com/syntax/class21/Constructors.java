package com.syntax.class21;

public class Constructors {
	
	String word;
	
	public Constructors () {
		this(12);
		this.word=word;
		System.out.println("I am a non argument constructor");
	}
	
	public Constructors (String word) {
		this(12, word); // IF NEED TO MAKE A CALL ALWAYS MUST BE A 1 STATEMENT INSIDE THEH CONSTRUCTOR
		this.word=word;
		System.out.println("I am a parameterized constructor " + word);
	}
	
	public Constructors (int num) {
		System.out.println("I am constructor dwith 1 parameter " + num);
		
	}
	
	public Constructors (int num, String word) {
	
	System.out.println("I am constructor dwith 2 parameterS " + num +" " + 	word);
}
		
	public static void main (String [] args) {
		
		Constructors obj = new Constructors ("Java");
		System.out.println(obj.word);
		
	}

}
