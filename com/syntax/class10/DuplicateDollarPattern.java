package com.syntax.class10;

public class DuplicateDollarPattern {
	public static void main(String[] args) {
		
//		$$$$
//		$  $
//		$  $
//		$  $
//		$$$$
		
//		for (int row=1; row <=5; row++ ) {//the outer loop controls the rows
//			
//			for (int column= 1; column <=4; column++) {//the inner loop controls the columns
//				
//				if (row==1 || row==5) { // in the first row  or last row : print every "$"
//				System.out.print("$");
//				
//			} else { // in the other rows
//				
//				if (column == 1 || column == 4) {// in the first or last column print $
//					System.out.print("$" );
//					
//				}else { // in the other column print space
//					System.out.print(" ");
//				}
//			}
//		}
//			System.out.println();
//		}
		
		 for (int i = 1; i<5; i++) {
		      for (int j =1; j<=4; j++) {
		        if (i==1 || i==4) {
		        System.out.print("$");
		      } else {
		        		      
		        if (j==1 || j ==4) {
		          System.out.print("$");
		        } else {
		           System.out.print(" ");
		        }
		      }
		    }
		    System.out.println();
	}

}
}

