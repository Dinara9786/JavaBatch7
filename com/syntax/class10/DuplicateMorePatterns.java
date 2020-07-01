package com.syntax.class10;

public class DuplicateMorePatterns {
	public static void main(String[] args) {
		
//		1 
//		21
//		321
//		4321
//		54321
//		4321
//		321
//		21
//		1
		
		for (int row = 1; row<=4; row++) {
		
			for (int column = row; column>=1; column--) {
				System.out.print(column);
		}
		
		System.out.println();
	}
		for (int i= 5; i >0; i--) {
			for (int j=i; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
			
	}
	
	
	}

}
