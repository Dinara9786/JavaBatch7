package com.syntax.class17;

public class MethodsWithReturn {
	
	public static void main(String[] args) {
		
		MethodsWithReturn obj = new MethodsWithReturn();
		
		boolean isItEven = obj.isEven(12);
		
		System.out.println(isItEven );
		
		System.out.println(obj.isEven(11));
		
		String word = obj.convertToUpperCase("Thao");
		System.out.println(word);
		
	}
	
	// to create a method that will accept an int value and return wether number is even
	
	boolean isEven (int a) {
		boolean even;
		if (a%2==0) {
			even=true;
		}else {
			even=false;
		}
		
		return even;
	}
	
	// to create a method that will accept 2 integer values and return the largest number
	
	int isLargest (int a, int b) {
		int largest;
		if (a>b) {
			largest = a; 
		}else {
			largest = b; 
		}
		return largest; // return value must be same type as return that we declared in method header
	}
	
	// create a method that will accept String value and then returns that value all in uppercase
	
	String convertToUpperCase (String value) {
	return value.toUpperCase();
	
		
		
		
		
		
	}

}
