package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {
	public static void main(String[] args) {
		
		// we want to ask user's name 5 times
		// and print Good Afternoon 5 times
		
		Scanner scan=new Scanner (System.in);
		
		
		
		
		
		
		
		int num= 1;
		while (num <=5 ) {
			System.out.println("Please enter your name:");
			String name = scan.nextLine();
			
			System.out.println("Good afternoon "+ name);
			num++;
		}
		
		
		
	}

}
