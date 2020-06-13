package com.syntax.class04;

import java.util.Scanner;

public class CityTemperatureScanner {
	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		
		System.out.println("Please state your city");
		String city=scanner.nextLine();
		
		System.out.println("Please state temperature in Farenheit in your city.");
		double tempF = scanner.nextDouble();
		double tempC = (tempF-32)*5/9;
		
		System.out.println("The temperature in the city " + city + " is " +tempC);
		
		
		
	}

}
