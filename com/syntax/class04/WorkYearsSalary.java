package com.syntax.class04;

import java.util.Scanner;

public class WorkYearsSalary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please state the total number of years of working experience.");
		int years = scanner.nextInt();
		System.out.println("Please state your current annual salary ");
		int salary = scanner.nextInt();
		if (years>=5) {
			System.out.println("You are eligible for bonus");
			if (salary>500000) {
				System.out.println("Congrats, you are eligible bonus is 5000");
			}else {
				System.out.println("Congrats, you are eligible bonus is 3000");
			}
		}else{
			System.out.println("Sorry, you are not eligible for bonus");
		}
		
	}
}

				