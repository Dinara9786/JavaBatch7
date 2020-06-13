package com.syntax.class04;

public class MoreNestedIf {
	
	public static void main(String[] args) {
		
		//let us have a date of month and a day of week
		//if it is Friday  -- > We are going to to watch a movie
		//		if date is  13  -- > watch a scary movie 
		// 		if date is not 13 --> watch a comedy
		// if its is not Friday --> We are going to study JAVA
		
		boolean isFriday = true;
		int date = 13;
		
		if (isFriday) {
			System.out.println("I am going to watch a movie");
			if (date ==13) {
				System.out.println("I will watch a scary movie");
			}else {
				System.out.println("I watch a comedy");
		
		} else {
				System.out.println("It is NOT Friday. I am going to study JAVA");
			}
		
		}
	}

}
