package com.syntax.class04;

import java.util.Scanner;

public class HomeworkYearsSalary02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your number of working years");
		int years = scan.nextInt();

		System.out.println("Please state your annual salary");
		double salary = scan.nextDouble();

		if (years > 5) {
			System.out.println("Congratulations! you are eligible for bonus!");
			if (salary >= 50000) {
				System.out.println("Your bonus is 5000!");
		} else {
			System.out.println("Your bonus is 3000!");
		}
		} else {
			System.out.println("You are not eligible for bonus");
		}
	}

}
