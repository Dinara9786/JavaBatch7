package com.syntax.class21;

public class Person {
	
	String name, lastName;
	  int age;
	 
	  Person (String name, String lastName, int age) {
		  this.name = name;
		  this.lastName = lastName;
		  this.age = age;
		  
	  }
}
	
class Employee extends Person {
	  int salary;
	   Employee  (String name, String lastName, int age, int salary) {
		   super(name, lastName, age);
		   this.salary = salary;
	}
	   
	   public void info () {
		   System.out.println(name + " " + lastName + " " + age + " " + salary);
	   }
	}
class Student extends Person {
	  
	  int grade;
	  
	Student (String name, String lastName, int age, int grade) {
			super (name, lastName, age);
			this.grade = grade;
		}
	public void info () {
		   System.out.println(name + " " + lastName + " " + age + " " + grade);
	   }
	}
class Retiree extends Person { 
	 
	  String seniorActivity;
	  
	 Retiree (String name, String lastName, int age, String seniorActivity) {
	  super(name, lastName, age);
	  this.seniorActivity = seniorActivity;
	  
		}
	 public void info () {
		   System.out.println(name + " " + lastName + " " + age + " " + seniorActivity);
	   }
	}


