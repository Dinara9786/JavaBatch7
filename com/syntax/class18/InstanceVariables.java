package com.syntax.class18;

public class InstanceVariables {
	
	String name = "Yuri"; // instance variable	
	
	public static void main(String[] args) {
		
		String name = "Kristina";//local variable
		System.out.println(name);//Kristina
		
		// when we create an Object or we create an instance the class -- >  InstanceVariables
		InstanceVariables obj = new InstanceVariables();
		obj.name = "Jane";
		System.out.println(obj.name); // Jane
		
		// we would like to change value from Kristina to Castro -- > 
		name="Castro";
		System.out.println(name);
		
		// would like to change Jane to Ed --> changing value of the instance variable 
		
		obj.name = "Ted";
		System.out.println("New value of instance variable " +obj.name);
		
		System.out.println("Printing value of name using 2 instance");
		
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj1.name);
		
		
	}
}
	
	
	


