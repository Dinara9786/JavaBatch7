package com.syntax.class05;

import java.util.Scanner;

public class HomeworkLogicalOperatorsLargestDoubleValue {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter 3 distinct numbers");
		
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		
		if (num1>num2 && num1>num3) {
			System.out.println("The largest number is " +num1);
		}
		else if (num2>num1 && num2>num3) {
			System.out.println("The largest number is " +num2);
		}
		else {
			System.out.println("The largest number is " +num3);
		}
	}

}
