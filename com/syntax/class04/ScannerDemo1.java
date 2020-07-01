package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo1 {
	
	public static void main (String [] args) {
	Scanner scan= new Scanner (System.in);
	
	System.out.println ("Please enter your name");
	String name = scan.nextLine();
	System.out.println ("Please enter your age");
	int age = scan.nextInt();
	System.out.println ("Please enter your mobile number");
	String mobileNumber;
	mobileNumber = scan.nextLine();
	System.out.println ("Your name is "+ name + ", your age is " + age + ", "
			+ "and your mobile number is " + mobileNumber);

	
	
	
	}

}
