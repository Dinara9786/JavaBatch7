package com.syntax.class12;

public class Recap2DArray {
public static void main(String[] args) {
	

String [] [] animals = {
		{"cat" , "dog" , "bird" , "hamster"}, // first array or the first row
		{"bear" , "tiger" , "monkey"}, //second array or the second row 
		{"salmon" , "shrimmp" , "sea bass"}
};

	int howmanyarrays = animals.length; // how many rows
System.out.println(howmanyarrays);

	int elements = animals[1].length; // how many columns in two rows
System.out.println(elements);

	String element = animals[1][1];
System.out.println(element);

System.out.println("=====================USING FOR LOOP=============================");

		//how to get all elements from 2D array

	for(int r=0; r<animals.length; r++) { // loops over rows or 1D arrays
		for(int c=0; c<animals[r].length; c++) {
			String animal = animals [r][c];
System.out.print(animal + " ");
		}
System.out.println();
	}

System.out.println("========================USING ENHANCED FOR LOOP=================");

	    for(String[] array:animals) {
	    	for(String animal:array) {
	    		System.out.println(animal);
	    	}
	    }





































}
}
