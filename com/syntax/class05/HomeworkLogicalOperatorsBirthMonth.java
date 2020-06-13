package com.syntax.class05;

import java.util.Scanner;

public class HomeworkLogicalOperatorsBirthMonth {
	
	public static void main (String [] args) {
		
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Please enter your birth month");
	
	String month = scan.nextLine();
	
	System.out.print("You were born in ");
	
	if (month.equals("June")||month.equals("July")||month.equals("August")) {
		System.out.println("Summer");
	} 
	else if (month.equals("September")||month.equals("October")||month.equals("November")) {
		System.out.println("Fall");
	}
	else if (month.equals("December")||month.equals("January")||month.equals("February")) {
		System.out.println("Winter");
	}
	else if (month.equals("March")||month.equals("April")||month.equals("May")) {
		System.out.println("Spring");
		}
	}
}