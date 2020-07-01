package com.syntax.class09;

public class Patterns {
	public static void main(String[] args) {
		
		// I want to print this pattern
		//		****
		//		****
		//		****
		//		****
		System.out.println("Silly way, not nested loop");
		for (int i=1; i<=4; i++) {
			System.out.println("****");
		}
		
		System.out.println("=============1 way=================");
		
		for (int i=1; i<=4; i++) {
			
			for (int j=1; j<=5; j++) {
				System.out.print("*");
			}
			
			System.out.println();
	}
		
		System.out.println("Another silly way");
		for (int i=1; i<5; i ++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i=1; i<5; i ++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i=1; i<5; i ++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i=1; i<5; i ++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i=1; i<5; i ++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("=============2 way=================");
		
		for (int c=4; c>=1; c--) {
			for (int j=1; j<=4; j++) {
				System.out.print("*");
		}
			System.out.println();
		}
		
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		
}
	
	
}
