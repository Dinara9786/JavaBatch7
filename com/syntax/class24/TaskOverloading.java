package com.syntax.class24;

public class TaskOverloading {
	
	public static void form (String name) {
		System.out.println(name);
	}
	public static int form (int num1, int num2) {
		return num1+num2;
	}
	
	public static void form (int num1, String name) {
	System.out.println(num1);
}
	public static void main(String[] args) {
		
		TaskOverloading obj = new TaskOverloading();
		
		int result = obj.form (200,56);
		obj.form("Africa");
		obj.form(15, "Solomon");
		obj.form(12,  15);
	}
}
