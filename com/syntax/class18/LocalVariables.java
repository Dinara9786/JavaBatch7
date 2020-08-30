package com.syntax.class18;

public class LocalVariables {
	
	public static void main(String[] args) {
		
		String name = "Mohammad";// local to main method and it is scope only within main method
		
		for (int i = 1; i<=5; i++) {
			System.out.println("Today is Java class");
			System.out.println(i);
		}
		
		
		//String name = "Ali";
		int a; // declare a variable
		for (a=0; a<=3; a++) { 
			System.out.println(a);
		}
		
		System.out.println(a);
		
	}	//System.out.println(i); CE: I cannot be resolved to a variable
		
		void displayName() {
			//System.out.println(name); // name it is not visible to the displayName methods because it local to main
		}
		
		// create a method to return sum of 2 numbers
		
		int sum (int num1, int num2) {//num1 and num2 are local variables to method sum
			return num1+num2;
			
		}
		
		double div (double num1, double num2) {//num1 and num2 are local variables to method div
			return num1/num2;
			
			
		}
	}


