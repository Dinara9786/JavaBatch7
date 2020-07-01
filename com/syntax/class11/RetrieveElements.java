package com.syntax.class11;

public class RetrieveElements {
	public static void main(String[] args) {
	
	char[] grades = {'A' , 'B' , 'C' , 'D', 'F'};
	
	
	for (int k=0; k<=grades.length; k++) {
		System.out.print(grades[k] + ",");
		}
	System.out.println();
	
	System.out.println("---print using advanced loop---");
	
	for(char element : grades) {
		System.out.println(element + " ");
	}
	
	System.out.println("====================================");
	
	String[] fruits = {"Apple" , "Orange" , "Grapes" , "Banana" , "Cucumber"};
	
	for(String element : fruits) {
		System.out.println(element + " ");
	}
	
	//another way
	for (int f=0; f<=fruits.length; f++) {
		System.out.print(fruits[f] + ",");
		}
	System.out.println();
	
	
	System.out.println("====================");
	for(String f : fruits) {
		System.out.println(f + " is my favourite fruit");
	}
	
	
	
	
	
	
	
	
	
	
}
}
