package com.syntax.class10;

public class ArrayDemoDuplicate {
	
	public static void main(String[] args) {
		
		// array is a tray of teacups
		
		int num1 = 10;
		int num2 = 15; 
		int num3 = 20; 
		int num4 = 25;
		
		// declare and initialize one array of integers
		//Scanner scan  = new Scanner ();
		   int[] numbers = new int [4]; // 4 elements and index from 0 to 3
		   numbers [0] =10;
		   numbers [1] =15;
		   numbers [2] =20;
		   numbers [3] =25;
		   // numbers[4] --> this is wrong. 
		  
		   // access elements from the array
		   System.out.println(numbers[3]);
		   
		   // if array is storing integers, when I getr one element I will get one integer
		   
		   System.out.println("==========================================");
		   
		   int element0 = numbers[0];
		   
		   // we are just declaring, not initializing
		   String [] carArray;
		   
		   //we are creating array/initializing array
		   carArray= new String[3]; // the size is 3 but the numbers are 0, 1, 2
		   //storing cars
		   carArray[0] = "BMV";
		   carArray[1] = "Toyota";
		   carArray[2] = "Benz";
		   //carArray[3] = "Tesla"; //runtime error, because we declare only 3 elements
		   
		   String car = carArray[2];
		   System.out.println(car);//or
		   System.out.println(carArray[2]);
		   
		   System.out.println("==========================================");
		   
		   char[] letters = new char [4];
		   letters[0]= 'C';
		   letters[3]= 'B';
		   letters[2]= 'G';
		   letters[1]= 'Z';
		   
		   System.out.println(letters[2]);
		   
		   // re-assigning another letter into spot with index [2]
		   letters[2] = 'K'; 
		   
		   char letter = letters[2];
		   System.out.println(letter);
		   System.out.println(letters[2]);
 	}

}
