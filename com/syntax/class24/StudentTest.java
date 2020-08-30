package com.syntax.class24;

public class StudentTest {
	
	public static void main (String [] args) {
	
	Student student = new SyntaxStudent();
	
	student.grading();
	student.exam();
	student.study();
	
	SchoolStudent sc = new SchoolStudent ();
	
	sc.grading();
	sc.exam();
	sc.study();
	sc.takeRest();
	
	
	}
}
