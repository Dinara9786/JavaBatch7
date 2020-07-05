package com.syntax.class11;

public class Task1 {
	public static void main(String[] args) {
		
		int [] numbers = {23, 56, 73, 16, 80, 70, 39} ;
		
		int sum = 0;
		for (int num:numbers) {
		sum+=num;
		}
		System.out.println("Total of integers is " +  sum);
		
		System.out.println("====================using for loop=========================");
		
		int total = 0;
		for (int k = 0; k<numbers.length; k++) {
			total +=numbers[k];
		}
		
		System.out.println("Total of integers is " + total);
		System.out.println("=================================");
		
		String [] countries = {"Tajikistan", "Brazil", "Pakistan", "Gambia", "US"};
		String [] capitals = {"Dushanbe", "Brazilia", "Islamabad", "Tirana", "Washington DC"};
		
		System.out.println();
		
		for (int m=0; m<countries.length; m++) {
//			String country = countries[m];
//			String capital = capitals[m];
//			System.out.println("Capital of " + country + " is " + capital);
			System.out.println("Capital of " + countries[m] + " is " + capitals[m]);
		}
		
		System.out.println("========try to solve this with enhanced for loop===========");
		
		
			}
		
}
		
		// try to solve this with enhanced for loop
		
		
		
		
//		for (int i = 0; i<countries.length; i++) {
//			switch (countries[i]) {
//			case "Tajikistan":
//				System.out.println("Dushanbe");
//				break;
//			case "Brazil":
//				System.out.println("Brazilia");
//				break;
//			case "Pakistan":
//				System.out.println("Karachi");
//				break;
//			case "Gambia":
//				System.out.println("Tirana");
//				break;
//			case "US":
//			case "USA":
//				System.out.println("Washington");
//				break;
//				default:
//					System.out.println("Not in my list");
//				
//			}
//		}
//	}
//	}

