package com.syntax.class14;

public class StringMethodsMore {
	public static void main(String[] args) {
		
	System.out.println("============.contains() method===========================");
	
	String str = "Good afternoon All";
	
	boolean contains = str.contains("afternoon");
	System.out.println(contains);
	
	String searchValue= "good";
	
	boolean isItThere=str.contains(searchValue);
	
	System.out.println(isItThere);
	System.out.println(str.contains("A"));
	System.out.println(str.contains("after"));
	
	System.out.println("============.startsWith() method===========================");
	
	String drink = "Welcome Students";
	boolean drink1 = drink.startsWith("Welcome");
	System.out.println(drink1);
	
	System.out.println("============.endsWith() method===========================");
	
	boolean ends = drink.endsWith("a");
	System.out.println(ends);
	//drink.endsWith ("w") ; CE we need to check if it starts with spedivied String, cannot be just char
	
	String str1="Hello Mohammed";
	String str2 = "Hello Bulat";
	
	boolean str3=str1.startsWith("Hello");
	System.out.println(str3);
		
	System.out.println(str2.endsWith("Bulat"));
	
	System.out.println("============.equals() method===========================");

	String string1 = "Saturday";
	String string2 = "saturday";
	
	boolean equality = string1.equals(string2);
	System.out.println(equality);
	
	System.out.println("============.equalsIgnoreCase() method===========================");
	
	boolean equality1 = string1.equalsIgnoreCase(string2);
	System.out.println(equality1);
	
	System.out.println("===========real expample of .equals()=====================");
	
	String expected = "Password cannot be empty";
	String actual = "Password can not be empty";
	if (expected.equals(actual)) {
		System.out.println("Test passed");
	}else {
		System.out.println("Test failed");
	}
	System.out.println("===========real expample of .equalsIgnoreCase()=====================");
	
	String expectedBrowser = "Chrome";
	
	if (expectedBrowser.equalsIgnoreCase("chrome")) {
		System.out.println("Test executes on chrome browser"); 
	} else {
		System.out.println("Test executes NOT on chrome browser"); 
	}
	
	
	}
}