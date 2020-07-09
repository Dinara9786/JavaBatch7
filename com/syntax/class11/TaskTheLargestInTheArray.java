package com.syntax.class11;

public class TaskTheLargestInTheArray {
	public static void main(String [] args) {
		
		System.out.println("=======find the largest in the array=============");
		
		int [] numbers = {21, 74, 98, 33, 16};
		
		int largest = numbers[0];
		
		for (int num:numbers ) {
			if (num>largest) {
				largest=num;
			}
			
		}
		
		System.out.println(largest);
		System.out.println("===================professional way with positive or negative numbers=========================");
		
		int [] numbers1 = {-21, -74, -98, -33, -16};
		
		int largest1 = numbers1[0];
		
		for (int num1:numbers1 ) {
			if (num1>largest1) {
				largest1=num1;
			}
			
		}
		
		System.out.println(largest);
	}

}
