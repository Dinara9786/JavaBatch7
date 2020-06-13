package com.syntax.class06;

import java.util.Scanner;

public class Homework1BirthMonth {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		// Einstein said: Spend 95% of the time to undertand the problem 
		//and spend 5% of the time solving the problem.
		
		System.out.println("Please enter your birth month:");
		String month = scan.nextLine();
		String season="Unknown";
		
		if (month.equals("September") ||month.equals("October")||month.equals("November")) {
			season = "Fall";
		} else if (month.equals("December") ||month.equals("January")||month.equals("February")) {
			season = "Winter";
		} else if (month.equals("March") ||month.equals("April")||month.equals("May")) {
			season = "Spring";
		} else if (month.equals("June") ||month.equals("July")||month.equals("August")) {
			season = "Summer";
		} else {
			season = "unknown";
		} if (!season.equals("unknown")) {
			System.out.println("You were born in " + season);
			
			double a = 0;
			System.out.println(a);
		}
		
		
		
	}

}
