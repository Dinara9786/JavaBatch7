package com.syntax.class04;

import java.util.Scanner;

public class ScannerHomework03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please state if you have a credit card? Please enter YES or NO");
		String card = scanner.nextLine();
		String yes = "yes"; 
		String no = "no";
		if (card.equalsIgnoreCase(no)) {
			System.out.println("Would you like to apply for a credit card?");
			
			}
		if (card.equalsIgnoreCase (yes)) {
			System.out.println("Please state your balance on your credit card");
			int balance = scanner.nextInt();
			if (balance>=1000) {
			System.out.println("Please pay off immediatly!");
			}else{ 
				System.out.println("You can spend more.");
			}	
			
	
		}
}
}