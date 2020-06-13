package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo{
 	
	public static void main(String[] args) {
		
		int a = 65;
		String s = "bla";
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println ("Please wirte some text and press enter!");
		String text = scan.nextLine();
		System.out.println("===========================");
		System.out.println(text);
		
		//int a = 33.4;//compile timr error
		
		// lelt me read an integer (age)
		System.out.println("please enter your age. It should be a number!");
		int age = scan.nextInt(); // if not an integer, run time error
		System.out.println("The Age you entered is " + age);
		
	}

}

