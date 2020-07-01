package com.syntax.class06;

import java.util.Scanner;

public class Recap {
	public static void main(String[] args) {
		// if hour between 1 and 11 --> morning
		// if hour between 12 and 15 --> afternoon
		// if hour between 16 and 20 --> evening
		// if hour between 21 and 24 --> night
		// We will print: Right now is____________
		
//		int hour=127;
//		String dayTime;
//		
//		if (hour >=1 && hour<=11) {
//			dayTime = "morning";
//		} 
//		else if (hour >=12 && hour<=15) {
//			dayTime = "afternoon";
//		} 
//		else if (hour >=16 && hour<=20) {
//			dayTime = "evening";
//		} 
//		else if (hour >=21 && hour<=24) {
//			dayTime = "night";
//		} 
//		else {
//			dayTime = "unknown";
//		}
//		// if it is unknown I do not want to print anything
//		if (!dayTime.equalsIgnoreCase("uNknown")){
//			System.out.println("Right now it is "+ dayTime);
//		}
		
//		double discount;
//		char code = 'C' ;
//
//		switch ( code ) {
//		case 'A':
//		discount = 0.0;
//
//		case 'B':
//		discount = 0.1;
//
//		case 'C':
//		discount = 0.2;
//
//		default:
//		discount = 0.3;
//		}
		
		Scanner scan = new Scanner (System.in);
		System.out.println ("Please enter your favourite car make");
	    
	    String car = scan.nextLine();
	    String carOrigin;
	    
	    switch (car) {
	      case "BMW":
	        carOrigin = "german car";
	        
	        break;
	        
	      case "Toyota":
	        carOrigin = "japanese car";
	       
	       break;
	       
	      case "Maserati":
	        carOrigin = "italian car";
	       
	       break;
	       
	      default:
	        carOrigin = "unknown";
	       
	        
	            }
	 
	    
		}
	}


