package com.syntax.class15;

public class StringImmutable {
	
	public static void main(String[] args) {
			
	String str = "Today is a good day"; // new object gets created
	
	str = str.replace("good", "amazing"); // another object gets created and that object is assigned to str
	System.out.println(str);
	
	str.concat("I love Sundays."); // new object gets created but no one is referring to that object
	System.out.println(str); //original String did not get changed
	
	String str1 = new String ("Hello");
	
	str1 = str1.toUpperCase(); 
	
	
	System.out.println(str1);
	
	String str2 = new String ("Hello ");
	String str3 = new String ("Hello ");
	String str4 = new String ("Hello ");
	
	//Strings are unchangeable. Strings are immutable 
	
	String str5 = new String ("Hello");
}
}
