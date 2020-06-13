package com.syntax.class06;

public class Recap {
	public static void main(String[] args) {
		// if hour between 1 and 11 --> morning
		// if hour between 12 and 15 --> afternoon
		// if hour between 16 and 20 --> evening
		// if hour between 21 and 24 --> night
		// We will print: Right now is____________
		
		int hour=127;
		String dayTime;
		
		if (hour >=1 && hour<=11) {
			dayTime = "morning";
		} 
		else if (hour >=12 && hour<=15) {
			dayTime = "afternoon";
		} 
		else if (hour >=16 && hour<=20) {
			dayTime = "evening";
		} 
		else if (hour >=21 && hour<=24) {
			dayTime = "night";
		} 
		else {
			dayTime = "unknown";
		}
		// if it is unknown I do not want to print anything
		if (!dayTime.equalsIgnoreCase("uNknown")){
			System.out.println("Right now it is "+ dayTime);
		}
	}

}
