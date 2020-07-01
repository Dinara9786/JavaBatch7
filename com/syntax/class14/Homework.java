package com.syntax.class14;

import java.util.Scanner;

public class Homework {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("please enter mother's name");
	String name = scan.nextLine();
	System.out.println("please enter father's name");
	String name1 = scan.nextLine();
	
	System.out.println("is it a boy or a girl???");
	String baby = scan.nextLine();
	
	if(baby.equals("boy")) {
		System.out.println(name1.substring(0, 3) + name.substring(2));
	}else if(baby.equals("girl")) {
		System.out.println(name.substring(0, 2) + name1.substring(3));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
