package com.syntax.class19_1;

public class AccessingEmployeeclassMember {

	public static void main(String[] args) {
		
		Employee emp = new Employee();	
		emp.name = "Dinara";
		emp.lastName = "Rysalieva";
		emp.age = 49;
		emp.salary = 100000; 
		//emp.ssn; not available for access because it is private 
		
		emp.displayName();
		emp.displayAge();
		emp.displaySalary();
		//emp.displaySSN();n ot available for access because it is private 
	}
	
}
 