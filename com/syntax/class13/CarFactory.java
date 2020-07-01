package com.syntax.class13;

public class CarFactory {
public static void main(String[] args) {
	
	Car car1 = new Car();
	car1.make="tesla";
	car1.model="X";
	car1.color="red";
	car1.year=2020;
	car1.speed=200;
	
	car1.drive();	
	car1.reverse();
	car1.transportPeople();
	
	System.out.println("==========another car==========");
	
	Car car2 = new Car();
	car2.make="BMW";
	car2.model="M5";
	car2.color="blue";
	car2.year=2018;
	car2.speed=240;
	

	car2.drive();	
	car2.reverse();
	car2.transportPeople();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
