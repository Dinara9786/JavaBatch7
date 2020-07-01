package com.syntax.class13;

public class HomeworkPhoneFactory {
	public static void main (String [] args) {

	System.out.println("=============iPhone=============");
		
		
	Phone phone1 = new Phone ();
	
	phone1.model = "iPhone"; 
	phone1.color = "white";
	phone1.year = 2019;
	phone1.camera = 2;
	phone1.memory = 256;
	
	phone1.dial();
	phone1.makePicturesVideos();
	phone1.touchScreen();
	
	System.out.println("============Android=============");
	
	
	Phone phone2 = new Phone ();
	
	phone2.model = "Samsung"; 
	phone2.color = "red";
	phone2.year = 2021;
	phone2.camera = 1;
	phone2.memory = 264;
	
	phone2.dial();
	phone2.makePicturesVideos();
	phone2.touchScreen();
	
	System.out.println("=============Nokia=============");
	
	
	Phone phone3 = new Phone ();
	
	phone3.model = "Nokia"; 
	phone3.color = "blue";
	phone3.year = 2020;
	phone3.camera = 4;
	phone3.memory = 128;
	
	phone3.dial();
	phone3.makePicturesVideos();
	phone3.touchScreen();
	
		
	}

}
