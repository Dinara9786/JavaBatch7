package com.syntax.class08;

import java.util.Scanner;

public class lottery {
	public static void main(String[] args) {
		//we are playing lottery game and the lucky is 17
		//we want to keep asking user to enter numbers from 1-20
		//until he guesses the lucky number --> in that case we print "congrats! you won!"
		
	Scanner scan = new Scanner (System.in);
	
	int lucky = 17;
	int num=0;
	
   while (num != lucky) {
	System.out.println("please enter a number from 1-20");
	  num = scan.nextInt();
   }
   
//do{
//	System.out.println("please enter a number from 1-20");
//	   num = scan.nextInt();
//}while (num!= lucky);
//	System.out.println("Congrats!!! You won!!!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
