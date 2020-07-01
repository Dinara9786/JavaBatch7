package com.syntax.class11;

public class Task {
public static void main(String[] args) {
	
	
	System.out.println("TASK2");
	int[] numbers = {23, 56, 73, 16, 800,70, 39};
	int sum =0 ;
	
	for(int num : numbers) {
		sum+=num; 
	}
	
	System.out.println("The sum of all numbers is " + sum);
	
	System.out.println("---using for loop---");
	
	int total = 0;
	for(int i=0; i<numbers.length; i++) {
		int num = numbers[i];
		total+=num;
	}
	
	System.out.println("The total of all numbers is " + total);
	
	
	System.out.println("TASK3");
	
	String[] countries = {"Tajikistan", "Brazil", "Gambia", "US"};
	for(String country:countries) {
		if (country.equals("Albania")) {
			System.out.println("Tirana");
		}else if(country.equals("Brazil")) {
			System.out.println("Brazilia");
		}else if(country.equals("US")) {
			System.out.println("Washington");
		}else if(country.equals("Tajikistan")) {
			System.out.println("Dushanbe");
		}else if(country.equalsIgnoreCase("Gambia")) {
			System.out.println("Banjul");
		}else {
			System.out.println("Sorry, the" + country+  "isn't in my database");
		}
	}
	
	System.out.println("========another way of task 3==========");
	
	for(int i=0; i<countries.length; i++) {
		
		switch(countries[i]) {
		case "Tajikistan":
			System.out.println("Dushanbe");
		break;
		case "US":
			System.out.println("Washington");
		break;
		case "USA":
			System.out.println("Washington");
		break;
		case "Albania":
			System.out.println("Tirana");
		break;
		case "Gambia":
			System.out.println("Banjul");
		break;
		default:
			System.out.println("Not in my list");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
