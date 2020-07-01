package com.syntax.class14;

public class Repl3HomeworkJune28 {
	
	public static void main (String [] args) {
		
		{
			int[][] a = {
					{-5,-2,-3,7},
					{1,-5,-2,2},
					{1,-2,3,-4}
				};
				 int sum = 0;
				 for (int i = 0; i<a.length; i++) {
				   if (i%2 ==0) {
				     for(int c = 0; c<a[i].length; c++) {
				       if (c%2==0) {
				         sum = sum+a[i][c];
				       }
				     } 
				   }
				   
				 }
		
				 System.out.println(sum);
	}

}
}
