package com.syntax.class14;

public class MoreStringMethods {
public static void main(String[] args) {
	
	
	System.out.println("=============.charAt() method===========");
	
	String season = "summer";
	
	char character = season.charAt(4);
	System.out.println(character);
	
	
	System.out.println("==============.indexOf() method==========");
	
	int index=season.indexOf('u');
	System.out.println(index);
	

	System.out.println("==============.substring() method==========");
	
	String message="you guys are awesome";
	
	String sybstring = message.substring(4); //take string starting from index 4
	
	System.out.println(sybstring);
	
	String middleWord = message.substring(4, 8);
	System.out.println(middleWord);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
