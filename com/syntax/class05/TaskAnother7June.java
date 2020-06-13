package com.syntax.class05;

import java.util.Scanner;

public class TaskAnother7June {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please state day of the week in number");
		int day = scan.nextInt();
		
		if (day >=1 && day<=5) {
			System.out.println("This is a weekday");
		}else if (day>=6 && day<=7)
			System.out.println("This is a weekend day");
		} else {
			System.out.println("Invalid day");
		}
		
		System.out.println("====== =========Using Or================");
		
		if (day ==1 || day==2 || day==3 || day == 4 || day==5) {
			System.out.println("This is a weekday ");
	}
}
}
