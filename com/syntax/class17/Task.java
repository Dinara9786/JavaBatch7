package com.syntax.class17;

public class Task {
	
	
	public static void main(String[] args) {
		
		Task t = new Task();
		
		String email =t.createEmail("Jane", "Smith", "yahoo");
		System.out.println(email);
		
		boolean prime = t.isPrime(6);
		System.out.println(prime);
		
		Student student = new Student ();
		
		char grade = student.getGrade(88);
		char grade1 = student.getGrade(50);
		
		System.out.println(grade);
		System.out.println(grade1);
	}
	
	
	// create email and return email
	String createEmail (String name, String lastName, String emailType) {
		String email = name+lastName+"@"+emailType+".com";
		return email.toLowerCase();
		
		}
	
	// create prime or not
	
	boolean isPrime (int a) {
		boolean prime = true;
		if (a>1) {
			for (int i=2; i<=a/i; i++) {
				if (a%2 == 0) {
					prime = false;
					break;
				}
				
			}
		}else {
			prime = false;
		}
		return prime; 
	}

}
