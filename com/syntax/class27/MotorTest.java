package com.syntax.class27;

public class MotorTest {
	
	public static void main(String[] args) {
	
		//new Drivable ();CE: cannot instantiate. if incomplete we cannot create object
		
		//new Motorcycle ();CE: cannot instantiate if incomplete we cannot create object
		
		//Bike = is complete, and we can create object
		
		System.out.println("===========Object of Drivable type==================");
		
		Drivable d = new Bike ();
		d.driving();
		d.breaking();
		
		//how we can access DRIVE variable??? we can access by class name Motorcycle
		System.out.println(Motorcycle.DRIVE); // static variable accessible through class name
		
		System.out.println("===========Object of Motorcycle type==================");
		
		Motorcycle m = new Bike (); // 2 parent== > 1 parent and 1 interface
		m.driving();
		m.breaking();
		m.operateVehicle();
		//how we can access DRIVE variable??? we can access by class name Drivable
		System.out.println(Drivable.DRIVE);
		
		Vehicle ve = new Bike ();
		ve.operateVehicle(); // Vechile-- > Motorcycle --> Bike
		//ve.driving // no relationship between Drivable and Vechicle
		
		
	}

}
