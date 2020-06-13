package com.syntax.class04;

public class NestedIfContinues {
	
	public static void main (String [] args) {
		
		// check if patient has allergies
		// if no allergies --> You are healthy
		//otherwise: 
		// if peanut allergy: Do not eat peanut
		// Lactose allergy: do not drink milk
		// Bee allergy: do not mess with bees
		// seafood allergy: Do not eat fish
		
		boolean allergies = true;
		boolean peanut = true;
		boolean lactose = false;
		boolean bees = true;

		if (!allergies) {
			//No allergy
			System.out.println("You are healthy!");
		}else {
			//we have to check which allergy
			if (peanut) {
				System.out.println("Do not eat peanut");
			}if (lactose) {
				System.out.println("Do not drink milk");
			}if (bees) {
				System.out.println("Do not mess with bees");
			}
			System.out.println("========================================");
			
			// User has diploma
			
			boolean diploma = false;
			double scoreGpa = 3.0;
			
			
			
			if (!diploma) {
				System.out.println ("Congratulations User!");
			}else {
				System.out.println("User, please get a degree");
			} if (scoreGpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
			
			int mortgage = 150000;
			double rate = 3.4;
			
			if (rate>4.5) {
				System.out.println("User will consider buying a house");
			}else {
				System.out.println("User will not buy a house");
			} if (mortgage>200000) {
				System.out.println("User decides to take a loan");
			}else {
				System.out.println("User will pay cash");
			}
			System.out.println("===========================");
			
			//Class Task
			
			boolean diploma1 = true;
			double gpa = 1.92;			
			if (diploma1) {
				System.out.println("Congratulations!");
				
				if (gpa>=3.5) {
					System.out.println("You are eligible for scholarship");
				}else {
					System.out.println("You should have studied harder");
				}
			}else {
				System.out.println("You should get a degree!");
			}
			
			
			
			
		}
		
		
	}
}
