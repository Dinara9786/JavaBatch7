package com.syntax.class06;

import java.util.Scanner;

public class HomeworkGrade {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please state your grade");
		
		String grade=scan.nextLine();
		String explanation;
		
		switch (grade) {
		case "A": 
			explanation = "Excellent";
		break;
		case "B":
			explanation = "Good";
		break;
		case "C":
			explanation = "Average";
		break;
		case "D":
			explanation = "Bad";
		default:
			explanation = "Not Acceptable";
		}
		
		System.out.println("Your grade is " + grade+ " which corresponds to " + explanation);
		
		
	}

}
