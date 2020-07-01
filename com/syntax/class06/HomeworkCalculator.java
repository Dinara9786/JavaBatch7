package com.syntax.class06;

import java.util.Scanner;

public class HomeworkCalculator {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		double result=0;
		
		System.out.println("Please enter a number");
		double num1 = scan.nextDouble();
		
		System.out.println("Please enter another number");
		double num2 = scan.nextDouble();
					
		System.out.println("Please enter 1 Operator ( * / + -)");
				
		char operator=scan.next().charAt(0);
		
		switch (operator) {
		case '*':
			result = num1*num2;
		break;
		case '/':
			result = num1/num2;
		break;
		case '-':
			result = num1-num2;
		break;
		case '+':
			result = num1+num2;
		break;
		default:
		System.out.println("Invalid Operator!");
		}
		
		if (operator =='-' || operator =='+' ||operator =='*' ||operator =='/');{
		System.out.println("The result is: " + result);
		
		}
	}

}
