package com.syntax.class14;

public class StringMethodsMore2 {
	
	public static void main(String[] args) {
		
		System.out.println("=============.charAt() method==============");
		
		String season = "Summer";
		char character=season.charAt(4);// which character with index 4
		System.out.println(character);
		
		System.out.println("=============.indexOf() method==============");
		
		int index =season.indexOf('u');// which index of character'u'
		System.out.println(index);
		
		String hello = "Hello Ksenia";
		
		int indexOfKsenia=hello.indexOf("Ksenia"); // Ksenia starts from index 6
		System.out.println(indexOfKsenia);
		
		System.out.println("=============.substring() method==============");
		
		String message = "You guys are awesome";
		String newMessage = message;
		System.out.println(newMessage);
		
		String substring = message.substring(4);//take string from index 4
		System.out.println(substring);
		
		String middleWord = message.substring(4,8);//we take a word starting with index 4 and ending at index 8 including space after word
		System.out.println(middleWord);
		
		System.out.println("=============.substring() method==============");
		
		
		
		
	}

}
