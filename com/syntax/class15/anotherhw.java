package com.syntax.class15;

public class anotherhw {
public static void main(String[] args) {
	
	String one="first";
	String two="second";
	
	System.out.println(one+ " " + two);

	one=one+two;
	two=one.substring(0, one.length()-two.length());
	one=one.substring(two.length());
	
	System.out.println(one+  " " + two);
	
	
}
}
