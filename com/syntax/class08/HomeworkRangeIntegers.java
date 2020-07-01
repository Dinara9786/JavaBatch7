package com.syntax.class08;

import java.util.Scanner;

public class HomeworkRangeIntegers {
	public static void main (String [] args) {
		
//		Write a program that reads a range of integers (start and end point), 
//		provided by a user and then from that range prints 
//		the sum of the even and odd integers.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a range of numbers. Your start point");
		int startPoint = scan.nextInt();
		
		System.out.println("Your end point");
		int endPoint = scan.nextInt ();
		
		int sumOdd=0; 
		int sumEven=0;
				
		for (int c = startPoint; c<=endPoint; c++) {
		if (c%2==0) {
			sumEven=sumEven+c;			
		}
		else {
			sumOdd=sumOdd+c;
		}
			
		}
		
		System.out.println("This is the sum of even integers "+ sumEven);

		System.out.println("This is the sum of odd integers "+ sumOdd);
		
	}

}
