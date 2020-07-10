package com.syntax.class16_2;

public class Palidrome {
	
	void isLarger (int a, int b) {
		
		if (a>b) {
				
		System.out.println(a);
		
		}else {
			System.out.println(b);
	}
	}
	
	void isEven (int a) {
		if (a%2==0) {
		System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
	
	void isPalindrome (String word) {
		String b="";
		for (int c = word.length()-1; c>=0; c--) {
			b+=word.charAt(c);
		}if (b.equals(word)) {
			System.out.println(word + "  is Palindrome");
		}else { 
			System.out.println(word + " is not Palindrome");
		}
		}	
	
		void sayHello (String country) {
			
			country = country.toLowerCase();
			
			switch (country) {
			
			case "usa":
				System.out.println("Hello");
				break;
				
			case "egypt":
				System.out.println("Merhaba");
				break;
				
			case "kyrgyzstan":
			System.out.println("Salamat");
				break;
				
			default:
				System.out.println("unknown");
			}
			
	}
		

}


