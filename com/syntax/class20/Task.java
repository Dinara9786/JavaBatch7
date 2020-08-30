package com.syntax.class20;

public class Task {
	
	String name; 
	String lastName; 
	int age;
	
	Task (String taskName, String taskLastName, int taskAge) {
		name = taskName;
		lastName = taskLastName;
		age = taskAge;
	}
		Task () {
		
			System.out.println("I am non argument consturctor");
		}
		
		void info() {
			System.out.println("My name is " + name + " and my last name is " + lastName);
		}
	
	
	public static void main (String [] args) {
		
		Task task = new Task("Dinara" , "Rysalieva", 49);
		task.info();
		
		Task task1 = new Task ();
	
	}
	

}
