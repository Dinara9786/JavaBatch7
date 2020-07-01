	package com.syntax.class08;

import java.util.Scanner;

public class TaskClass08 {
	public static void main(String[] args) {
		
//		1.Print numbers from 1 to 50 except those that are divisible by 3
//		Create a program that will be asking user to apply for a credit card 10 times. 
//		As soon you get an “yes” from a user program should stop asking.
		
//		for (int i = 1; i<=50; i++) {
//			if (i%3==0) { // divisible by 3
//				continue;
//		}
//			System.out.println(i);
//		}
//		Scanner scan = new Scanner (System.in);
//				
//		for (int x = 101; x<=110; x++) {
//			System.out.println("do you want to appoy for a credit card?");
//			String answer = scan.next();
//			
//			if (answer.contentEquals("yes")) {
//				System.out.println("Congrats! you have a credit card");
//				break; 
//			}
//		}
		
		 int num=1;
	      while (num<13) {
	    	  
	      if (num%2==0) {
	      System.out.println (num);
	       }
	      num++;
	    }
	}

}
