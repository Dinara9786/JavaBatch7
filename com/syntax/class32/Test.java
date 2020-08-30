package com.syntax.class32;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test {
	
	public static void main(String[] args) {
		
		Person person = new Person ();
		person.setName("Masha");
		String name = person.getName();
		
		person.setlastName("Ivanova");
		String lastName = person.getlastName();
		
		person.setAge(45);
		int age = person.getAge();
		
		person.setSalary(70000);
		int salary =person.getSalary();
		
		Person person2 = new Person ();
		person2.setName("Dasha");
		String name2 = person2.getName();
		
		person2.setlastName("Petrova");
		String lastName2 = person2.getlastName();
		
		person2.setAge(29);
		int age2 = person2.getAge();
		
		person2.setSalary(370000);
		int salary2 =person2.getSalary();
		
		Map <Integer, Person> pers = new TreeMap<>();
		
		pers.put(1,  person);
		pers.put(2,  person2);
		
		Set<Entry<Integer, Person>> entry = pers.entrySet();
		
		for (Entry<Integer, Person> e:entry) {
			Person p1 = e.getValue();
			System.out.println(p1.getName());
			System.out.println(p1.getlastName());
			System.out.println(p1.getAge());
			System.out.println(p1.getSalary());
			p1.display();
			
		}
		
	}

}
