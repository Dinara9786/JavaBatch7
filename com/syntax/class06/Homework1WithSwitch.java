package com.syntax.class06;

import java.util.Scanner;

public class Homework1WithSwitch {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		
//		if (month.equals("September") ||month.equals("October")||month.equals("November")) {
//			season = "Fall";
//		} else if (month.equals("December") ||month.equals("January")||month.equals("February")) {
//			season = "Winter";
//		} else if (month.equals("March") ||month.equals("April")||month.equals("May")) {
//			season = "Spring";
//		} else if (month.equals("June") ||month.equals("July")||month.equals("August")) {
//			season = "Summer";
//		} else {
//			season = "unknown";
//		} if (!season.equals("unknown")) {
//			System.out.println("You were born in " + season);
//			
//			double a = 0;
//			System.out.println(a);
//		}
//		
		System.out.println("Please enter your birth month.");
		String month=scan.nextLine();
		String season;
		
		switch (month.toLowerCase()) { // .toLowerCase() converts DECember--> december
		case "december":
		case "January":
		case "February":
			season = "Winter";
			break;
		case "March":
		case "April":
		case "may":
			season = "Spring";	
			break;
		case "june":
		case "july":
		case "august":
			season = "Summer";	
			break;
		case "september":
		case "october":
		case "november":
			season = "Autumn";	
			break;
		default:
			season = "Unknown";
		}
		System.out.println("Your were born in " +season);
		
		}
		
		
	}


