package com.syntax.class24;

public class Student {
	
	public void exam () {
		System.out.println("Students should pass exams");
	}
	
	public void grading () {
		System.out.println("The students will get grading for performance");
	}
	
	public void study () {
		System.out.println("The students will study hard");
	}
}

class SyntaxStudent extends Student{
	public void exam () {
		System.out.println("Syntax students should pass exams");
	}
	
	public void grading () {
		System.out.println("The Syntax students will get grading for performance");
	}
	
	public void attendClasses () {
		System.out.println("The Syntax students should attend all classes");
	}
}

class SchoolStudent extends Student {
	public void exam () {
		System.out.println("the School Students should pass exams");
	}
	
	public void grading () {
		System.out.println("The school students will get grading for performance");
	}
	
	public void takeRest () {
		System.out.println("The school students will take rest after exams");
	}
}


