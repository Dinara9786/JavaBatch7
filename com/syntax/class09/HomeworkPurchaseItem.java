package com.syntax.class09;

import java.util.Scanner;

public class HomeworkPurchaseItem {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Please enter the item you want to buy");
		String item = scan.nextLine();
		
		System.out.println("Please enter the price of the item you want to buy");
		double price = scan.nextDouble();
		double totalAmount=0;
		double remainingBalance;
		double change;
		
		do {
			System.out.println("Please give me the payment");
			double money = scan.nextDouble();
			totalAmount+=money;
			if (totalAmount<price) {
				remainingBalance = price-totalAmount;
				System.out.println("Please pay more " + remainingBalance);
			}else if (totalAmount>price) {
				change = totalAmount-price;
				
			System.out.println("Please take your " +change);
			} else {
				System.out.println("You paid in full");
			}
		} while (totalAmount < price);
			System.out.println("Thank you for shopping");
				
	
}
}

