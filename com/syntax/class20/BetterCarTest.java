package com.syntax.class20;

public class BetterCarTest {
	
	public static void main(String[] args) {
		
	BetterCar car = new BetterCar ("M5", "Red", 2020, 80000); 
			car.displayInfo();
	
	BetterCar car1 = new BetterCar ("Model S", "Silver", 2021, 89000); 
			car1.displayInfo();
			
			// new BetterCar(carModel, carColor) CE: because we do not have a constructor with 2 parameters inside BetterCar class
			// new BetterCar (); CDE: because we do not have a non argument constructor in BetterCar class

}
}
