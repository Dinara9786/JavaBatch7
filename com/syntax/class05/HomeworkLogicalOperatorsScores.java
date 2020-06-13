package com.syntax.class05;

import java.util.Scanner;

public class HomeworkLogicalOperatorsScores {
	
	public static void main(String []args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("What is your quiz score?");
		int quiz = scan.nextInt(); 
		
		System.out.println("What is your mid term score?");
		int midterm = scan.nextInt();
		
		System.out.println("What are your final scores?");
		int finalScores = scan.nextInt();
		
		double average = (quiz+midterm+finalScores)/3;
		
		if (average>=90) {
			System.out.println("Grade is A");
		}
		else if (average>= 70 && average <90) {
			System.out.println("Grade is B");
		} 
		else if (average>=50 && average <70) {
			System.out.println("Grade is C");
		} 
		else {
			System.out.println("F");
		}
	}

}
