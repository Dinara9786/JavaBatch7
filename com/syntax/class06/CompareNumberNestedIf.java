package com.syntax.class06;

import java.util.Scanner;

public class CompareNumberNestedIf {
	public static void main (String [] args) {
	
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please enter first number");
		double a = scan.nextDouble();
		
		System.out.println("Please enter second number");
		double b = scan.nextDouble();
		
		System.out.println("Please enter third number");
		double c = scan.nextDouble();
		
		double largest;
		
	if (a>b) {
		//here a is already larger than b
		if (a>c) {
			//a is the largest
			largest = a;
		} else {
			//a is larger than, but c is larger than a
			largest = c;
		}
	} else { 
		// here b is already larger than a
		if (b>c) {
			// b is the largest
			largest = b;
		} else {
			//b is larger than a, but c is larger than b
			largest = c;
		}
	}
	
	System.out.println("The largest number is " + largest);
}
}
