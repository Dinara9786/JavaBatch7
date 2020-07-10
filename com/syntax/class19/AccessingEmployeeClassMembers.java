package com.syntax.class19;

public class AccessingEmployeeClassMembers {
	
	public static void main(String[] args) {
		
	
	Employee emp = new Employee();
	
	emp.name = "Gozde";
	emp.lastName= "Doe";
	emp.age=19;//access protected
	emp.salary=89000;//accessing default
	//emp.ssn=123456678; // want's be available because it is private
	
	emp.displayName();
	emp.displayAge();
	emp.displaySalary();
	//emp.displaySsn();// won't be available because it is private

}
}
