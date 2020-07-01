package com.syntax.class10;

public class Recap {
	
	public static void main(String[] args) {
		
		//Nested loops → Loop inside another loop
		// there are 4 floors
		//Room numbers go from 1.1, 1.2, .....1.7
		
		// Task: Ask the user how many floors does your hotel have?
		// And how many rooms in each floor.
		int floor= 4;
		int room = 7;
		for (int i=1; i<=floor; i++) {
		System.out.println("We are on floor " + i + "-->");

		for (int j=1; 1<=room; j++) {
				System.out.print(i + "." + " ");
		}
		System.out.println();
		}

	}

}
