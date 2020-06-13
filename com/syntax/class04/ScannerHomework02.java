package com.syntax.class04;

import java.util.Scanner;

public class ScannerHomework02 {
	public static void main(String[] args) {
		
		Scanner license=new Scanner(System.in);
		System.out.println("Please state your age");
		int age = license.nextInt();
		if (age>=18) {
			System.out.println("Driver's license will be issued to you.");
		} else {
			System.out.println("You will need to get driver's permit first.");
			
		}
		
	}

}
