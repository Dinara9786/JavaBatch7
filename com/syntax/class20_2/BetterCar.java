package com.syntax.class20_2;

public class BetterCar {
	
	public static String make = "BMW";
	protected String model, color;
	int year;
	private double price;
	
	
	public void displayInfo() {
		System.out.println("We build " + make + " " + year + " " + color + " " + model + " for price of " + price);
	}
	
	BetterCar (String carModel, String carColor, int carYear, int carPrice) {
		model = carModel;
		color = carColor;
		year=carYear;
		price = carPrice;
	}
	
	public static void main(String[] args) {
		
		BetterCar car = new BetterCar ("Model S", "red", 2020, 89000);
		car.displayInfo();
		
		BetterCar car1 = new BetterCar ("Model g", "silver", 2019, 86700);
		car1.displayInfo();
		
		// new BetterCar (); CE: because we do ot have a non argument constructor inside BetterCar class
		
		//static String driver; local variables cannot be static
		//System.out.println(driver);
		}
	}

