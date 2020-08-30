package com.syntax.class19_1;

// to import shortcut is ctl+shif+o
import com.syntax.class19.Employee;

public class AccessingEmployeeMembers {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.name = "Ahmet";//accessible from any package, public variable
		emp.lastName= "Smith";//accessible from any package, public
//		emp.age=21; // protected, not visible, accessible within the same package
//		emp.salary=90000;// not accessible within the same package, default
//		emp.ssn=123456678;// not accessible, private
		
		emp.displayName();
//		emp.displayAge();
//		emp.displaySalary();
//		emp.displaySsn();
		
		emp.displayName();
		emp.displayCompany();
		
	}

}
