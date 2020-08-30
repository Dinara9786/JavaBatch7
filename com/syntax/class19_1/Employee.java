package com.syntax.class19_1;

public class Employee {
	
	public static String company; // since it is public, it is accessible any class from any package in the project 
	public String name, lastName; // since it is public, it is accessible any class from any package in the project 
	protected int age;	// since it is protected it is accessible within class within the same package and accessible to all protected members
	double   salary; // since it is default, it is ccessible within same package  within the same class and to default members
	private long ssn; // since it is private, it is accessible only in its own class to private members
	
	
	public static void displayCompany() {
		System.out.println("Employee works for " + company);
	}
	 public void displayName () {
	 
	 	System.out.println("Employee's name and last name is " + name + " "+ lastName);
}

	protected void displayAge () {
		System.out.println("The Employee's age is " + age);
}
	void displaySalary () {
		System.out.println("Empoloyee's salary is " + salary);
	}
	
	private void displaySSN () {
		System.out.println("Employee's ssn is " + ssn);
	}
	
	public static void main (String [] args) {
		
	company = "Google"; // no need to specify class
	
	Employee emp = new Employee();	
	emp.name = "Ahmet";
	emp.lastName = "Smith";
	emp.age = 21;
	emp.salary = 90000; 
	emp.ssn= 123456;
	
	emp.displayName();
	emp.displayAge();
	emp.displaySalary();
	emp.displaySSN();
	
	
	
		
		
	}
}

