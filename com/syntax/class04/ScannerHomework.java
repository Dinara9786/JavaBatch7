package com.syntax.class04;

import java.util.Scanner;

public class ScannerHomework {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner (System.in);
		
		System.out.println("Please enter the amount of the loan you need");
		int amount = scanner.nextInt();
		if (amount <=200000) {
			System.out.println("You would lend the money");
		}else {
			System.out.println("Sorry we will reject you");
		}
		
		
		
	}

}
