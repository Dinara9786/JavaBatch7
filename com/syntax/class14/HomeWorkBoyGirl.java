package com.syntax.class14;

import java.util.Scanner;

public class HomeWorkBoyGirl {
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner (System.in);
//		
//		System.out.println("Please enter father's name");
//		String father = scan.nextLine();
//		
//		System.out.println("Please enter mother's name");
//		String mother = scan.nextLine();
//		
//		System.out.println("Is it a boy or a girl?");
//		String gender = scan.nextLine();
//		
//		String babyName;
//		
//		// Boy --> first converts to lower case and from lower case string we calling method .equals();
//		if (gender.toLowerCase().equals("boy")) {
//			babyName = father.substring(0, father.length()/2) + mother.substring(mother.length()/2);
//					
//		}	else if (gender.equalsIgnoreCase("girl")) {// or using IgnoreCase
//			babyName = mother.substring(0,mother.length()/2) + father.substring(father.length()/2);
//			
//		} else {
//			babyName = "unknown";
//		}
//		
//		System.out.println(babyName.toUpperCase());
//		scan.close();
		
		String day = "Sunday";
		// String --> --> sorry cannot call String a method because you are not a String
		//day.charAt(1).toUpperCase (); will not work. Upper case works for String
		
		char letter =day.toUpperCase().charAt(1);
		String length = day.substring(3).toUpperCase(); // it is string, and we can call another function toUpperCase
		System.out.println(length);
		
		for (int i = day.length()-1; i>=0; i-- ) {
			System.out.print(day.charAt(i));
		}	
			System.out.println();
		
			String day1 = "Monday";
			String newDay1="";
			for (int j = day1.length()-1; j>=0; j-- ) {
			newDay1 +=day1.charAt(j);
			}	
			System.out.println(newDay1);
		}
	}

	




