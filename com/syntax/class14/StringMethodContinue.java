package com.syntax.class14;

public class StringMethodContinue {
public static void main(String[] args) {
	
	System.out.println("=====.contains() methhod======");
	
	String str="good afternoon all";
	String searchValue="afternoon";
	
	boolean contains=str.contains("afternoon");
	System.out.println(contains);
	
	String searchValuee="sdfgh";
	
	boolean isitthere=str.contains(searchValuee);
	System.out.println(isitthere);
	
	
	System.out.println("=====.startsWith() methhod======");
	
	String drink="water";
	boolean starts=drink.startsWith("w");
	System.out.println(starts);
	
	System.out.println("=====.endsWiht() methhod======");
	
	boolean ends=drink.endsWith("a");
	System.out.println(ends);
	
	
	//drink.startsWith; CE: we need to check if it starts with specified String, cannot be just char
	
	
	System.out.println("=====.equals() methhod======");
	
	String string1="today is Saturday";
	String string2="Saturday";
	
	boolean equality=string1.contentEquals(string2);
	System.out.println(equality);
	
	System.out.println("=====.equalsIgnoreCase() methhod======");
	
	boolean noequality=string1.equalsIgnoreCase(string2);
	System.out.println(noequality);
	
	System.out.println("=====real example of .equalsIgnoreCase() methhod======");
	
	String expected="password cannot be empty";
	String actual="password can not be empty";
	
	if(expected.equals(actual)) {
		System.out.println("test pass");
	}else {
		System.out.println("test fail");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
