package com.syntac.group01;

public class CarTest {
	public static void main(String[] args) {
		
		Car truck = new Truck (500000, "red", 10);
		System.out.println(truck.calculatePrice());
		
		Car sedan = new Sedan (65000, "red", 10);
		System.out.println(sedan.calculatePrice());
	}

}
