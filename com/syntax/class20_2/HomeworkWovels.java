package com.syntax.class20_2;

public class HomeworkWovels {
	
	public static void main(String[] args) {
		
	System.out.println(rev("Hello"));
	System.out.println(reverse("Hello"));
	System.out.println(displayVowels("Hello"));
		
	}
	
	public static String rev (String str) {
		String a = "";
		for (int i = str.length()-1; i>=0; i--) {
			a=a+str.charAt(i);
		}
	return a;
	}
	
	public static StringBuffer reverse(String a) {
		StringBuffer strb = new StringBuffer(a);
		return strb.reverse();
	}
	
	private static String displayVowels(String value) {
		return value.replaceAll("[^aeiouAEIOU]", "");
	}
	
	

}