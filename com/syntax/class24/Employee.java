package com.syntax.class24;

public class Employee {

		double salary;
		
	void getPaid () {// overriden method
		System.out.println("The Employee get paid salary of " + salary);
	}
}

class Contractor extends Employee {
	double hourlyRate;
	
	void getPaid () { // overriding method and providing different logic
		System.out.println("The Contrator get paid " + hourlyRate);
}
}

class FulltimeEmployee extends Employee  {
}



	
	
