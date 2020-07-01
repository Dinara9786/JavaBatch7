package com.syntax.class08;

public class SkipNumbers {
	public static void main(String[] args) {
		
		// I want to print from 1 to 10 
		// and I want to skip 5, 6 and 7
		
		System.out.println("Skipping the numbers");
		for (int i=1; i<11; i++) {
			if (i == 5 || i==6 || i==7) {
				
						System.out.println("We skipped 5, 6 and 7");
						continue;
			}
			System.out.println(i);
			
			//we want to print numbers from 1 to 100
			// but we want to skip the numbers between 35 adn 55
			System.out.println("I want to skip numbers from 35 to 55");
			for (i = 1; i<=100; i++) {
				
				if (i>=35 && i<=55) {
					continue;
				}
					System.out.println(i);
				
			
				}
		
	}
		}
	}


