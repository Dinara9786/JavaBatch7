package com.syntax.class13Duplicate;

public class PhoneFactory {
	public static void main(String[] args) {
	
		Phone phone1 = new Phone ();
		
		phone1.make="Nokia";
		phone1.model="34RR";
		phone1.color ="red";
		phone1.size = 128;
		System.out.println(phone1.make);
		
		phone1.dial();
		phone1.touchscreen();
		phone1.makePhoto();
		
		Phone phone2 = new Phone ();
		
		phone2.make="Android";
		phone2.model="Dream";
		phone2.color ="yellow";
		phone2.size = 256;
		System.out.println(phone2.make);
		
		phone2.dial();
		phone2.touchscreen();
		phone2.makePhoto();
		
		Phone phone3 = new Phone ();
		
		phone3.make="iPHone";
		phone3.model="XR11";
		phone3.color ="silver";
		phone3.size = 64;
		System.out.println(phone3.make);
		
		phone3.dial();
		phone3.touchscreen();
		phone3.makePhoto();
		
	}

}
