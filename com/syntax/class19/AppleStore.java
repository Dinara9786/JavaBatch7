package com.syntax.class19;

public class AppleStore {
	
	public static void main(String[] args) {
		
		
		
		System.out.println("========1 st object==============");
		
		IPhone phone1 = new IPhone ();
		
		phone1.model = "11 Pro";
		phone1.memory= 256;
		phone1.color="Blue";
		phone1.price = 1000;
		
		//phone1.displayInfo(); possible, but not preferrable
		IPhone.displayInfo();// --> calling static method
		phone1.displayDetails();
		
		IPhone.touchScreen=false;//changing value to false. 
								//accessing static variable
		
		System.out.println("========2nd object==============");
		IPhone phone2 = new IPhone ();
		
		phone2.model = "11 Pro +";
		phone2.memory= 128;
		phone2.color="Red";
		phone2.price = 2000;
		
		IPhone.displayInfo();
		phone2.displayDetails();
		
		System.out.println("================Calling info method again======================");
		
		phone1.displayInfo();
	}

}
