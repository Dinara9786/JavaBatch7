package com.syntax.class15;

import java.util.jar.Attributes.Name;

public class SplitFunction2 {
	public static void main(String[] args) {
		
	String str = "Today is Sunday and we have a Java Class";
	
	String [] array = str.split("Java");
	int howManyElements= array.length;
	System.out.println(howManyElements);// 2 elements
	
	for (String s:array ) {
		
		System.out.print(s);
	}
	System.out.println();
	
	String [] array1 = str.toLowerCase().split("s ");
	int howManyElements1= array1.length;
	System.out.println(howManyElements1);// 4 elements
	
	for(String s1:array1){
		System.out.print(s1+ "|");
	}
	System.out.println();
	
	//String []array2 = str.split("u"); 
		for(int i = str.length() - 1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	}

