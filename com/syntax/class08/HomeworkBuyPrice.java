package com.syntax.class08;

import java.util.Scanner;

public class HomeworkBuyPrice {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter the item you would like to purchase");
		String item = scan.nextLine();
		
		System.out.println("Please enter the price of the item");
		int price = scan.nextInt();
		
		System.out.println("Please pay");
		int cash=scan.nextInt();
		
		while (cash<price) {
			
			System.out.println("Please pay off " +(price-cash) + " more ");
		int addCash = scan.nextInt();
			cash+=addCash;
		
		
		}
		
		if (cash > price) {
			System.out.println("Your change is " + (cash-price));
			System.out.println("Thank you for shopping");
		}
		else {
			System.out.println("Thank you for shopping");
		}
		

	}	
	

}
