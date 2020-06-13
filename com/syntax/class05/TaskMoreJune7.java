package com.syntax.class05;

import java.util.Scanner;

public class TaskMoreJune7 {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please state your quiz score");
	int quizScore = scan.nextInt();
	if (quizScore >=90) {
		System.out.println("Your grade is A");
	} else if (quizScore>72 && quizScore<90) {
		System.out.println("Your grade is B");
	}
		
		
		
	}

}
