package com.syntax.class07;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		int x=10;
		x=x+1;
		x+=1;
		//another way to add 1 into the Variable 
		x++;// post increment
		
		System.out.println(x);
		//3++; //this cannot be done, compiler error
		
		int y = 50;
		y = y-1;
		y-=1;
		y--;
		System.out.println(y);
		System.out.println(y);
		
		int z = 5;
		//System.out.println(z++);
		if (z++==5) {
			System.out.println("Hi there");
		}
		
		// 3++ 
		// ++3 
		
	}
}
