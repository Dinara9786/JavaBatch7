package com.syntax.class20;

public class StudentTest {
	public static void main(String[] args) {
		
	
	Student student1 = new Student("Smith", 70, 80, 83);
	Student student2 = new Student("Adam", 49, 23, 94);
	Student student3 = new Student("Lucy", 98, 53, 45);
	Student student4 = new Student("Mary", 78, 15, 0);
	Student student5 = new Student("Ahmet", 67, 89, 99);
	
	int grade1=student1.calculateAverageGrade();
	
	System.out.println("Average grade of 1 student is " + grade1);
	
	int grade2=student2.calculateAverageGrade();
	
	System.out.println("Average grade of 2 student is "+grade2);
	
	int grade3=student3.calculateAverageGrade();
	
	System.out.println("Average grade of 3 student is "+grade3);
	
	int grade4 = student4.calculateAverageGrade();
	
	System.out.println("Average grade of 4 student is "+grade4);
	
	int grade5 = student5.calculateAverageGrade();
	
	System.out.println("Average grade of 5 student is "+grade5);
	}
}
