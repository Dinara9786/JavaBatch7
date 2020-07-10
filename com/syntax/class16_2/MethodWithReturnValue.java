package com.syntax.class16_2;

public class MethodWithReturnValue {
	
	public static void main(String[] args) {
			
	// create a String and based on number of characters, define weather String is long or short
	// long if length <10, short if less
	
	
	String str = "I love Java";
	
	int length = str.length(); // returns us an integer value
	
	if(length>=10) {
		System.out.println("Created String is long");
	} else {
		System.out.println("Created String is short");
	}
	
	// identify which number is the largest and define if this largest number is even or odd
	

	Palidrome obj = new Palidrome ();
	obj.isLarger (10, 20);
		
	}
	
	//create a method that will RETURN the largest number
	int largest (int a, int b) {
		int largest;
		if (a>b) {
			largest =a; 			
		}else {
			largest=b; 
		}
		return largest;
	}
}


