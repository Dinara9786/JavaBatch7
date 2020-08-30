package com.syntax.class26;

public abstract class Phone {

	void makeCall() {
		System.out.println("PHone makes call");
	}
	
	void sendText() {
		System.out.println("PHone sends text");
	}
	
	public abstract void navigate(); //abstract method
	
	public abstract void playMusic(); // abstract method
	
	//public abstract void takePictures(); // we should implement through inheritance
	
}

class Samsung extends Phone {// follow rule of overriding 
	public void navigate() { // no abstract keyword coz this is implemented
	System.out.println("Samsung can navgate");	
	}
	
	public void playMusic () { // we cannot modifier type, should be same or more
		System.out.println("Samsung plays music from google store");
	}
}

class IPhone extends Phone {
	
	public void navigate() { // no abstract keyword coz this is implemented
		System.out.println("IPhone can navgate");	
	}
		
	public void playMusic () { // we cannot modifier type, should be same or more
			System.out.println("IPhone plays music from google store");
	} //every new child have to provide implementation of abstract method. 
}