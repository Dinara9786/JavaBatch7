package com.syntax.class20;

public class HomeWork {
	public static void main(String[] args) {
		
		
		System.out.println(reverse("Hello"));
		System.out.println(displayVowels("Welcome"));
	}
	
	public static StringBuffer reverse(String a) {
		StringBuffer strb = new StringBuffer(a);
		return strb.reverse();
	}
	private static String displayVowels(String value) {
		return value.replaceAll("[^aeiouAEIOU]",  "");
	

		}

}
