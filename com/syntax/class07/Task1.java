package com.syntax.class07;

class Task1 {

	public static void main (String [] args) {
		// print from 1 to 20 only odd numbers
		
		//1st way
		
		int g=1;
		while (g<=20) {
		if (g%2!=0) {
			System.out.println(g);
		}
			g+=1;
		}
		System.out.println("==============================");
		
		// 2nd way, increasing by 2
		
		int y = 1;
		while (y<20) {
			System.out.println(y);
			y+=2;
		}
		System.out.println("==============================");
		
		// 3rd way, 
		
		int z = 0;
		while (z<20) {
			z++;
			System.out.println(z);
			z++;
		}
		
System.out.println("==============================");
		
		// 4th way, 
		
		int m = 0;
		while (m<20) {
			System.out.println(++m);
			m++;
	}
}
}
