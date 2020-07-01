package com.syntax.class15;

public class StringBuffer {
public StringBuffer(String string) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	
       StringBuffer strBuffer = new StringBuffer("hello"); //is a mutable object
	strBuffer.append(" friends"); // when we perform operation it happens on same object and no new object gets created
	
	System.out.println(strBuffer); // hello friends
	
		String str2="hello"; // String is immutable object
	str2.concat(" friends"); // new object gets created that will have value "hello friends" ---> nno one takes it
	
	System.out.println(str2); //hello
	
	
	
	
	
	
	
	
	
	
	
	
	
}

private void append(String string) {
	// TODO Auto-generated method stub
	
}
}
