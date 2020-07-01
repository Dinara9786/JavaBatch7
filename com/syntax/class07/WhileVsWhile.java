package com.syntax.class07;

public class WhileVsWhile {
	public static void main(String[] args) {
		
		//print hello 5 times
		// while checks if soup is hot, before eating
		// do checks if soup is hot, after eating
		// with do while loop you will get burn
		
		int x = 1;
		while (x<=3) { // checks before going into the loop
		System.out.println("Hello");
		x++;
		}
		
		System.out.println("=========Using a Do While loop============");
		
		int y=1;
		do {
			System.out.println("Hello");
			y++;
		}while (y<=3); // checks after going into the loop
	}

}
