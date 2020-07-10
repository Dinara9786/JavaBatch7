package com.syntax.class16_2;

public class PalindromeTest {
	
	public static void main(String[] args) {
		
		System.out.println("=======larger==========");
		
		Palidrome obj = new Palidrome();
		obj.isLarger (300, 209);
		
		System.out.println("=======isEven===========");
		
		obj.isEven(989);
		
		System.out.println("=======Palindrome===========");
		
		obj.isPalindrome ("madam");
		
		obj.sayHello("USA");
		obj.sayHello("Egypt");
		obj.sayHello("Kyrgyzstan");
		
	}

}
