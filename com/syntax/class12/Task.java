package com.syntax.class12;

public class Task {
public static void main(String[] args) {
	String[][] food = {
			{"ramen" , "sushi" , "mochi"},
			{"beshbarmak" , "samsy" , "kuurdak"},
			{"taco" , "nachos" , "guakomole"}
	};
	
	for(int r=0; r<food.length; r++) {
		for(int c=0; c<food[r].length; c++) {
			String meal = food [r][c];
System.out.print(meal + " ");
		}
System.out.println();
	}
	
	
	//another way
System.out.println("=============2nd way================");


	for(String[] array: food) {
		for(String meal:array) {
System.out.println(meal);
		}
	}

System.out.println("====================HW====ANSWER==============");
	
	int [][] numbers = {
			{10,20,30,40},
			{334,678,123},
			{23,56,78}
	};

	int sum = 0;
	
	for(int i=0; i<numbers.length; i++) {
		for(int j=0; j<numbers[i].length; j++) {
			
			int element = numbers[i][j];
			
			if(element%2!=0) {
				sum += element;
			}
			
		}
		System.out.println(sum);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
