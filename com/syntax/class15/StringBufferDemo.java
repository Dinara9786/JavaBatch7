package com.syntax.class15;

public class StringBufferDemo {

		public static void main(String[] args) {
	
		StringBuffer strBuffer = new StringBuffer ("Hello"); //is a mutable object
       
       	strBuffer.append(" friends"); // when we perform operation it happens on same object and no new object gets created
	
       	System.out.println(strBuffer); // hello friends
	
		String str2="hello"; // String is immutable object
		str2.concat(" friends"); // new object gets created that will have value "hello friends" ---> no one takes it
	
		System.out.println(str2); //hello
	

			
		}
}
