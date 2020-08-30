package com.syntax.class24;

public abstract class Parent1 {
	
	public abstract void m1(); 
	public abstract void m1(); 
}


public class Main extends Parent1 {
	  
	  public void m1(String word) {
	    
	    System.out.println (word);
	    
	  } 
	  
	  public void m2 (String word, String word1) { 
	  System.out.println (word + " " + word1);
	 
}
	

	public static void main (String [] args) {
	  
	  Main obj = new Main ();
	  obj.m1 ("m1 without parameters");
	  obj.m2 ("m1 method", "with paramters");
	}
		
	}
	
