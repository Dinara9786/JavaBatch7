package com.syntax.class10;

public class DuplicateDinaraPatterns {
	
	public static void main(String[] args) {
		
		
//		55555
//		4444
//		333
//		22
//		1
		
		for (int i=5; i>=1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}		
			System.out.println("=========================================");
			
//			12345
//			1234
//			123
//			12
//			1
			
			for (int x=5; x>0; x--) {
				for (int y = 1; y <=x; y++) {
					System.out.print(y);
				}
				System.out.println();	
			}	
				System.out.println("=========================================");
				
//				54321
//				4321
//				321
//				21
//				1
				
				for (int n=5; n>0; n--) {
					for (int m = n; m >=1; m--) {
						System.out.print(m);
					}
					System.out.println();	
				
				}	
		}
	}
	



