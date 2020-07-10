package com.syntax.class19;

public class Employee {
	
	public static String company;//any class from any package in the project
	public String name, lastName;//any class from any package in the project
	protected int age; //if your class within same package
	double salary;//default. if class within same package it can access all default members
	private long ssn; // private no one can access, only it is own or the same class can have an access
	
	public static void displayCompany (){
		System.out.println("Employee works at " + company);
	}
	public void displayName () {
		System.out.println("Employee name and last name is " + name + lastName);
	}
	
	protected void displayAge () {
		System.out.println("Employee is " + age + " years old");
	}
	
	void displaySalary() {
		System.out.println("Employee salary is" + salary);
	}
	
	private void displaySsn() {
		System.out.println("Employee's ssn is " + ssn);
	}
	
	public static void main(String[] args) {
		
		company = "Google";
		Employee emp = new Employee();
		emp.name = "Ahmet";
		emp.lastName= "Smith";
		emp.age=21;
		emp.salary=90000;
		emp.ssn=123456678;
		
		emp.displayName();
		emp.displayAge();
		emp.displaySalary();
		emp.displaySsn();
	}
}
