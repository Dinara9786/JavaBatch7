package com.syntax.class05;

import java.util.Scanner;

public class Recap {
	
	public static void main(String[] args) {
//		Scanner myScanner;
//		myScanner = new Scanner (System.in);
//		String line = myScanner.nextLine();
//		String word = myScanner.next();
//		myScanner.nextInt();
		
		Scanner myScanner = new Scanner (System.in);
		
		System.out.println("Please write a long text");
		String text = myScanner.nextLine();
		System.out.println(text);
		
		System.out.println("Please enter a integer!");
		int num = myScanner.nextInt();
		System.out.println(num);
		
		System.out.println("Please enter a double");
		double d = myScanner.nextDouble();
		System.out.println(d);
		
		System.out.println("Please enter a boolean");
		boolean b = myScanner.nextBoolean();
		System.out.println(b);
		
		System.out.println("Please enter a char");
		char myChar = myScanner.next().charAt(0);
		System.out.println(myChar);
		
	}

}
