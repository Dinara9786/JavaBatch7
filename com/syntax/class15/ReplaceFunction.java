package com.syntax.class15;

public class ReplaceFunction {
public static void main(String[] args) {
	
	
	String me = "I am a good tester I am a great person";
	String str = "Hello";
	
	str=str.replace('e', 'E');
	System.out.println(str);
	
	me=me.replace("good", "great");
	System.out.println(me);
	
	me=me.replace("we", "us"); //if it finds nothing -----> does nothing
	System.out.println(me);
	
	String my = "phone number is 1234567890";
	my=my.replaceAll("[a-z]", "");
	System.out.println(my.trim());
	
	String another="Hola12345";
	another=another.replaceAll("[a-z]", "").replaceAll("[A-Z]", "");
	System.out.println(another);
	
	String anotherway="SDFsryhfjG523647586798HJklskfgnhogbvcklthnv3";
	anotherway=anotherway.replaceAll("[A-Za-z]", "");
	System.out.println(anotherway);
	
	String anotherwayssss="SDFsryhfjG523647586798HJklskfgnhogbvcklthnv3";
	anotherwayssss=anotherwayssss.replaceAll("[0-9]", "");
	System.out.println(anotherwayssss);
	
	String mix="HeLlO12345fRiEnDs";
	mix=mix.replaceAll("[a-z]", "").replaceAll("[0-9]", "");
	System.out.println(mix);
	
	String mixesss="sdhfbudfiu345vnisn98765432vs#$%^&*()&^%$#$%^&";
	mixesss=mixesss.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(mixesss);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

