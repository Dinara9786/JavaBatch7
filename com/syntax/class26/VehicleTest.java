package com.syntax.class26;

public class VehicleTest {
	
	public static void main(String[] args) {
	
		System.out.println("================creating first Object =VEHICLE BY CREATING CHILD OBJECT TYPE ======================");

	//Vehicle vehicle = new Vehicle (); I cannot create Vehicle object coz Vehicle is abstract class, and uncompleted, canno instanciate
	// but we can create through Child class
		
	Vehicle vehicle = new Lamborgini("oiuoi123213");
	vehicle.drive();
	vehicle.stop();
		
	System.out.println("================creating first Object = LAMBORGINI ======================");
		
	Vehicle lambo = new Lamborgini("iuy1234oiu"); // Lamgorgini because it is 100 % implementation
	lambo.start();
	lambo.stop();
	lambo.openTrunk();
	lambo.drive();
	int total = lambo.getTotal(); // store variable . declaring and assigning the value
	System.out.println(total);
	
	System.out.println("================creating second Object = CAR ======================");
	
	Car car = new Lamborgini ("iuy1234oi123u");
	car.start();
	car.stop();
	car.openTrunk();
	total = car.getTotal(); // re-assigning the value
	System.out.println(total);
	
	}
}
