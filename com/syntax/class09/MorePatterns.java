package com.syntax.class09;

public class MorePatterns {

	public static void main(String[] args) {
		
		// I want to print more patterns 
		//1234
		//1234
		//1234
		
		// how many rows we have - 3
		
//		for (int i=1; i<=5; i++) {
//			// how many columns? 5
//			for (int j=1; j<=5; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		
		//1111
		//2222
		//3333
		//4444
		
//		 for (int i=7; i>=0; i--) {
//			 System.out.print(i);
//			
//		 }
//		 System.out.println();
		
		for (int row = 11; row <= 17; row++) {
			for (int col = 1; col<=9; col ++) {
				System.out.print(row+" ");
			}
			//move to the new line
			System.out.println();
		}
	}
}
