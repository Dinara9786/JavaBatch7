package com.syntax.class14;

public class StringMethods {
	
	public static void main(String[] args) {
		
		
		//1 way to create a String: faster and easier and more a popular way
		
		String name = "Olga";//literal
		
		//2 way of creating a String 
		String name1=new String ();
		name1 = "Olga";
		
		System.out.println(name);
		System.out.println(name1);
		
		// method of String class
		
		String school = "Syntax";
		System.out.println("================================.length () method==============================");
		
		//how many characters are in the String
		int size=school.length();
		System.out.println("The length of the String =" +size);
		
		String greetings = "Hello Syntax";
		
		int sizeOfDifferentString = greetings.length();
		System.out.println(sizeOfDifferentString);
		
		System.out.println("================================.toUpperCase () method==============================");
		
		String city = "Washington DC";
		
		String newCity=city.toUpperCase();
		System.out.println(newCity);
		
		System.out.println("================================.toLowerCase () method==============================");
		
		String lowerCaseString= newCity.toLowerCase();
		System.out.println(lowerCaseString);
		
		System.out.println("================================.concat () method==============================");
		
		String country = "USA ";
		String capital = "Washington DC";
		
		// + with Strings serves as concatenation operator
		// + with numbers serves as arithmetic operator
		
		System.out.println(country + " " + capital);
		System.out.println(country.concat(capital));
		
		//.concat () will work only if both values are of String type
		
		int day = 27; 
		String month = " June";
		
		//System.out.println(day.concat(month)); .concat() cannot be used because both values must be String
		
		System.out.println("================================.isEmpty () method==============================");
		
		//if length of the String is 0 then it is Empty. "" --> this string is Empty
		String str = "Hello";
		boolean isEmpty = str.isEmpty();
		System.out.println(isEmpty); // returns false. the string is not empty. 
		
		String str1 = "";
		boolean str2 = str1.isEmpty();
		System.out.println(str2); // returns true . the string is empty
		
		System.out.println("================================.trim () method==============================");
		
		// .trim --> removes the spaces in the beginning and in the end of the String. And never in the middle 
		
		String cat = "My cat's name is Jessy";
		String dog = "   My dog's name is          Charley             ";
		
		System.out.println("----printing before the trimming------------");
		System.out.println(cat);
		System.out.println(dog);
		
		System.out.println("----printing before the trimming------------");
		
		System.out.println(cat.trim());
		System.out.println(dog.trim());
		
		
		
	}

}
