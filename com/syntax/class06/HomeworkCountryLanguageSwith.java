package com.syntax.class06;

import java.util.Scanner;

public class HomeworkCountryLanguageSwith {
	public static void main(String[] args) {      
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please state your country");
		String country = scan.nextLine();
		String language;
		
		switch (country) {
		case "France":
		case "Canada":
		case "Belgium":
		case "Algeria":
		case "Cote D'Ivore":
			language = "French";
			break;
		case "USA":
		case "Great Britain":
		case "Australi":
		case "New Zealand":
			language = "English";
			break;
		case "United Arab Emirates":
		case "Kuwait":
		case "Saudi Arabia":
		case "Egypt":
		case "Oman":
		case "Jordan":
			language = "Arabic";
			break;
		default:
			language ="Unknown";
		}
		
		System.out.println("You live in " + country + " and your language is " +language);
		
	}

}
