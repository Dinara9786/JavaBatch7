package com.syntax.class14;

public class HomeworkSunday {
	
	public static void main(String[] args) {
		
		String word = "Sunday";
		
		for (int i=word.length()-1; i>=0; i--) {
			
			System.out.print(word.charAt(i));
		}
		
		System.out.println();
		
		System.out.println("===========String Odd ==================================");
		
				
		String name = "Yerka";
		
		boolean name1 = name.isEmpty();
		int size = name.length();
		
		if (name1) {
			System.out.println("please input String");
		} else {
			if (size%2!=0 && size>=3) {
				System.out.println(name.charAt(size/2));
				
			}else {
				System.out.println("the string is even");
			}
			
			System.out.println("===========another String Odd ==================================");
			
			String string = "Synta";
			
			int size1 = string.length();
			
			if (!string.isEmpty()) {
				if (size1>=3 && size1%2!=0) {
					System.out.println(string.charAt(size/2));
				
			}else {
				System.out.println("The String is even");
			}
			
				System.out.println("============another reverse===================");
				
				String name3 = "Syntax";
				
				for (int n=name3.length()-1; n>=0; n--) {
					System.out.print(name3.charAt(n));
				}
		}
		
		}
	}
}
		
		
		
		


	
		
		
	


