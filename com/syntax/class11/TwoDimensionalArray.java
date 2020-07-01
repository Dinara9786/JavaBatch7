package com.syntax.class11;

public class TwoDimensionalArray {
public static void main(String[] args) {
	
	int [][] numbers = new int [3] [4]; // [rows] [cols]
	//first row
	numbers[0][0] = 10;
	numbers[0][1] = 15;
	numbers[0][2] = 20;
	numbers[0][3] = 25;
	
	
	// second row, row with index 1 
	numbers[1][0] = 32;
	numbers[1][1] = 66;
	numbers[1][2] = 36;
	numbers[1][3] = 40;
	//numbers[0][0] = 48;//run time error 
	
	// third row
	numbers[2][0] = 85;
	numbers[2][1] = 45;
	numbers[2][2] = 98;
	numbers[2][3] = 12;
	
	System.out.println(numbers[0][2]);
	
	//if we know the values upfront
	//2D is array of arrays
	int[][] nums = {
			{10, 15, 0, 25},
			{32, 66, 36, 40},
			{85, 45, 98, 12}
	};
	
	System.out.println(nums [2][2]); //98
	System.out.println(nums [1][1]); //66
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
