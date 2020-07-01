package com.syntax.class07;

public class HomeworkJune14 {
	public static void main(String[] args) {
		
		// print number from 1 to 100 in one line
		
		// print numbers from 1 to 100 
		
		// print numbers from 10 to 1 (2 ways)
		
		// print odd numbers between 20 and 50 (2 ways)
		
//		int y = 20;
////		while (y>=30) {
////			System.out.println(y);
////			y++;
		
//		int g=1;
//		while (g<=20) {
//		if (g%2!=0) {
//			System.out.println(g);
//		}
//			g+=1;
//		}
		
//		int num=1;
//		
//		while (num<=100) {
//			System.out.print(num+" ");
//			num++;
//		}
//		System.out.println();
//		
//		System.out.println("=================print numbers from 1 to 100 =====================");
//		
//		int a=1;
//		
//		while (a<=100) {
//			System.out.println(a);
//			a++;
//		}
		
		System.out.println("============print number from 10 to 1: 1st way =====================");
		
		
		for (int b=10; b>=1; b--) {
			System.out.println(b);
		}
		
		System.out.println("=============print number from 10 to 1: 2nd way ===================");
	
	 int x = 10;
	 	while (x>=1){
	 	System.out.println(x+" ");
	 	x--;
	}
	 	System.out.println("============print odd numbers between 20 and 50: 1st way =========");
		
	 	int din = 20;
	 	while (din<=50) {
	 	if (din%2!=0) {
	 		System.out.println(din);
	 	
	 	}	 	
	 	din++;
	 	}
	 	
	 	System.out.println("============print odd numbers between 20 and 50: 2nd way =========");
	 	
	 	int roll = 20;
	 	roll++;
	 	while (roll<=50) {
	 		System.out.println(roll);
	 		roll +=2;
	 		
	 	}
	}
}
