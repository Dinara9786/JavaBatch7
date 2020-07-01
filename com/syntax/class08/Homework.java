package com.syntax.class08;

public class Homework {

	public static void main(String[] args) {
		//print numbers from 100 to 1
		//	  step1   step2  step4
		for(int i=100; i>=1; i--) {
			System.out.println(i);
		}
		
		//print numbers 1,2,3
		    System.out.println("--------print from 1 to 3 :}---------");
		for(int z=1; z<=3; z++) {
			System.out.print(z+",");
		}
		
		  
		//print odd numbers between 20 to 50 (2ways)
		   System.out.println("\n-------print from 20 to 50 :)----------");
		for(int u=20; u<=50; u++) {
		if(u%2!=0 || u%2==1) {
		   System.out.println(u);
		}
		}
		
		//another way
		   System.out.println("--------another way from 20 to 50 :>---------");
		for(int f=21; f<=50; f+=2) {
		   System.out.println(f);
		}
		
		//print numbers between 5 to 1
		   System.out.println("--------print numbers from 5 to 1 :] ---------");
		for(int y=5; y>=1; y--) {
			System.out.println(y);
		}
		
		
		//what is the result
		    System.out.println("--------print the result :3---------");
		int total =1;
		for(int k=1; k<=4; k++) {
		total = total+k;
		}
		    System.out.println(total);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
