package com.syntax.class29;

public class WrapperDemo {
	public static void main(String[] args) {
		
		int num=10; // primitive type storing in ...
		
		//class
		Integer num1=100; // num1 represents Object of Integer type. The process of Atuboxing when converting  value of primitive type and representive of Object type
		//num1.toString ().length(); // converting to String (we can concat etc)
		String str = num1.toString().concat("hello");
		System.out.println(str);
		
		int stringLength=num1.toString().length();
		System.out.println(stringLength);
		
		Byte b=10;
		System.out.println(b.MAX_VALUE);
		
//		int c = 144;
//		System.out.println(c.MAX_VALUE);
		
		Boolean bool =true;
		
		Character ch = 'a';
		
		Double d = 10.9;
	}

}
