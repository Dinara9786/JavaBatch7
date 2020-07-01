package com.syntax.class10;

public class ClassTaskArray {

	public static void main(String[] args) {
		
		//1.Create an array of chars and store grades into it: A,B,C,D,E,F.
		//Then print a grade B (use 2 different ways of creating an array).
		//2.Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		//3. Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using elements of array: “Saturday is Java coding Day”.
		
		char [] letters = {'A','B','C','D','E','F'};
		
		System.out.println(letters[1]);
		
		
		
		System.out.println("=====================================");
		
		String [] words = {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(words [1]+" "+words [4]+" "+words [0]+" "+words [3]+" "+words [2]);
		
		System.out.println("========================================");
		
		String[] names = new String [5];
		names [3] = "Kamila";
		names [1]= "Elshan";
		names [4]= "Yuriy";
//		names [2]= "Yuriy";
//		names [5]= "Yuriy";
		
		System.out.println(names[0]); // Default for String is NULL
		
		int arrLength = names.length;
		
		System.out.println("The length of the array is: " +arrLength);
		
		System.out.println("========================");
		
		String [] group2 = {"Ali", "Ksenia", "Olga", "Catro"};
		System.out.println("The size of group 2 is: " + group2.length);
		
		//HW create an array of 4 integers adn see teh default values.
		
	}
}
