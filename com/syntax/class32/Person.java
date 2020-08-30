package com.syntax.class32;

public class Person {
	

//	Create a Person class with following private fields: name, lastName, age, salary. 
//	Variables should be initialized through constructor.
//	Inside the class also create a method to print user details.
//	In Test Class create a Map that will store key in ascending order. 
//	In that map store personId and a Person Object. Print each object details.

	private String name, lastName;
	private int age, salary;
	

//	Person (String name, String lastName, int age, int salary) {
//		this.name = name;
//		this.lastName = lastName; 
//		this.age = age;
//		this.salary = salary;
//	}	
		public void setName(String name) {
		this.name = name;
	}
		
		public String getName() {
			return name;
		}
		
		public void setlastName(String lastName) {
			this.lastName = lastName;
		}
		
		public String getlastName() {
			return lastName;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public int getAge() {
			return age;
		}
		public void setSalary(int salary) {
			this.salary=salary;
		}
		public int getSalary() {
			return salary;
		}
		public void display () {
			System.out.println("The employee's name is " + name + " , last name is " + lastName + ", age is " + age + ", and her salary is " + salary );
}
}
