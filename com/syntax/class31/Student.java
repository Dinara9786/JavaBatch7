package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Student {

		String name;
		String stuID;
		
		Student(String name, String stuID) {
			this.name=name;
			this.stuID = stuID;
		}	
		
	public void display () {
		System.out.println(name + " with student ID of " +stuID + " should bring identification documents");
	}
	
		
		public static void main(String[] args) {
			
		Set<Student> student = new HashSet<>();
		
		student.add(new Student("Student", "ID1111"));
		student.add(new Student("Akerke", "ID222"));
		student.add(new Student ("Dinara", "ID9786"));
		student.add(new Student ("Doolot", "ID18"));
		
		for (Student stu: student) {
			stu.display();
		}
		
		System.out.println("=====using Iterator=============");
		
		Iterator<Student> stud = student.iterator();
		while (stud.hasNext()) {
			Student it = stud.next();
			//System.out.println(it);
			it.display();
			
		}
		
	}

}
