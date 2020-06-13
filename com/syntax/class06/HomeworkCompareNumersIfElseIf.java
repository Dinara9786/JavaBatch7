package com.syntax.class06;

import java.util.Scanner;

public class HomeworkCompareNumersIfElseIf {
	
	public static void main(String[]args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter 3 distinct numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		int largest;
		
		if (num1>num2 && num1>num3) {
			largest = num1;
		
		} else if (num2>num1 && num2>num3) {
			largest =num2;
		
		} else if (num3>num1 && num3>num1) {
			largest = num3;
		
		}  else {
			largest = 0;
		} if (largest == 0) {
			
			System.out.println("The largest number is " +largest);
			
		}
	}	

}
