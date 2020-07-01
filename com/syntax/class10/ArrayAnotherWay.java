package com.syntax.class10;

public class ArrayAnotherWay {
	
	public static void main(String[] args) {
		
		//we created an arrays and stored teh initial values
		String [] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursda", "Friday"};
		
		// let us print the element with index 3
		System.out.println(weekdays[3]);
		
		weekdays[3] = "Thursday";
		System.out.println(weekdays[3]);
		
		//weekdays[5] = "Saturday"; // we cannot add elements to erray
		
		double[] balances = {10000, 23.50, 5540.0};
		//1t way
		System.out.println("total money is: " +balances[0]+balances[1]+balances[2]);
		
		//2nd way
		double total1 = balances[0]+balances[1]+balances[2];
		
		System.out.println("total is:" + total1);
		
		// if to convert double to int
		
		int total = (int) balances[0]+ (int) balances[1]+ (int) balances[2];
		System.out.println("total is: " +  total);
		
		//3rd way
		int total2 = (int) (balances[0]+ (int) balances[1]+ (int) balances[2]);
		System.out.println("total is: " +  total2);
		
		// do not ever create an array with 0 elements, because you cannot add elements later
		int [] numbers1= new int[0]; 
		
		int [] numbers2 = {};
		numbers2[0] = 5;
		System.out.println(numbers2[0]);
		
	}
 
}
