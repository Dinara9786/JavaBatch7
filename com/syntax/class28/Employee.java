package com.syntax.class28;

public class Employee {
	
	public String fullName, title;
	public long ssn;
	
	// make variable as private
	private double salary;
	private int age, empId;
	
	public Employee (String fullName, String title) {
		this.fullName = fullName;
		this.title = title;
		
	}
	// create public methods (getters and setters) to give access to private variables
	
	// creating getters (trying to get smth)
	
	public double getSalary() {
		return salary;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getEmpId () {
		return empId;
	}
	
	//creating setters
	
	public void setSalary (double salary) {
		this.salary = salary; //(we initialize our instance variable)
	}
	
	public void setAge (int age) { //we request validation
		
		if (age>16) {
			this.age = age;
		}
	}
	
	public void setEmpId(int empId) {
		if (empId>0);
		this.empId=empId;
		
		
	}
	
	// why we need to provide setters? 
}
