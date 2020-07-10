package com.syntax.class15;

public class ReplaceFunction2 {
	public static void main(String[] args) {
		
		System.out.println("==============.replaceAll()===========================");
		
		String me = "I am a good tester";
		
		String str = "Hello";
		str = str.replace('e', 'E');
		System.out.println(str);
		
		me= me.replace("good", "great");
		System.out.println(me);
		
		me = me.replace("we","us"); // if it finds it --> replace, if it does not find --> does nother
		System.out.println(me);
		
		//replacing all characters from A-Z
		String fromApplication = "Phone number 1234567890";
		
		//fromApplication=fromApplication.replace("Phone number ", "");
		//System.out.println(fromApplication); --> this way is OK too
		
		fromApplication=fromApplication.replaceAll("[A-Z]", ""); // hone number is 1234567890
		
		System.out.println(fromApplication);
		
		//replacing all characters from a-z
		
		fromApplication=fromApplication.replaceAll("[a-z]", "").trim();
		
		System.out.println(fromApplication);
		String another = "Hello12345";
		
		another = another.replaceAll("[A-Z]", "").replaceAll("[a-z]", "");
		System.out.println(another);
		
		String anotherWay = "Hello123iiiillll4567";
		anotherWay=anotherWay.replaceAll("[A-Za-z]", "");
		System.out.println(anotherWay);
		
		String mix = "Hello 878787 friends01299797";
		
		mix = mix.replaceAll("[0-9]", "");
		System.out.println(mix);
		
		//replacing all special characters
		String mix1 = "hello &^%$#@ yes";
		mix1=mix1.replaceAll("[^A-Za-z0-9]", " ").concat(" Syntax");
		System.out.println(mix1);
		
		
		
		
		
	}
	

}
