package com.syntax.class10;

public class ArrayAnotherWayDuplicate {
	
	public static void main(String[] args) {
		
		// we create an array and stored the initial values
		String [] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursda", "Friday"};
		
		//let us print the element with index 3
		System.out.println(weekdays[3]);
		weekdays[3]="Thursday";
		System.out.println(weekdays[3]);
		
		// I want to add more
		//weekdays[5] = "Saturday"; // compiler will not give an error, but runtime will give an error. 
		//We cannot add elements to the array, because array is fixed
		
		
		double [] balances = {10000, 23.50, 5540.0};
		System.out.println("total money is " + (balances[0]+balances[1]+balances[2]));
		
		int total1 = (int) (balances[0]+balances[1]+balances[2]);//casting to integer
		
		System.out.println(total1);
		
		// if I do not want initialize
		// do not ever creat array with 0 elements, because we cannot add elements later
		int [] numbers1 = new int [5];
		int [] numbers2;
	
	}

}
