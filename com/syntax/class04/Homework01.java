package com.syntax.class04;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		boolean cc;
		System.out.println("Please state if you have a credit card? (True of False)");
		cc=scan.nextBoolean();
		
		if (cc) {
		System.out.println("Please state your Credit Card Balance");
		double d = scan.nextDouble();
		
			
			System.out.println("Please pay off immediatly");
	
		} else {
				System.out.println("You can spend more");
		
		}
		} else {
				System.out.println("Would you like to apply for a credit card");
			}
	}
}
