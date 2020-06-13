package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		
		// we have 7 days of week
		//if day is 2,4 --> SDLC class
		//if day is 6,7 --> Java class
		// if day is 1,5 --> No class
		// if day is 3 -->  Review class
		
		int day = 7;
		// to compare equality of two numbers we use == 
		if(day==2 || day ==4) {
			System.out.println("We have SDLS class");
		}else if (day==7 || day==6) {
			System.out.println("We have Java class");
		}else if (day ==1 || day ==5){
			System.out.println("WE have no class");
		}else if (day ==3){
			System.out.println("Review class");
		}else {
			System.out.println("Wrong day");
		}
		
		System.out.println("====================================Using String=========================");
		// to compare the equality of 2 strings we use .equals()
		
		String day2 = "Wednesday";
		
		if (day2.equals("Tuesday") || day2.equals("Thursday")) {
			System.out.println("SDLS class");
		} else if (day2.equals("Saturday") || day2.equals("Sunday")) {
			System.out.println("Java class");
		} else if (day2.equals("Friday") || day2.equals("Monday")) {
			System.out.println("Relax");
		}else {
			System.out.println("Review Class");
		}
		
		
		
		
		
		
		
	} 

}
