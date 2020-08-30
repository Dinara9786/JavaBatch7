package com.syntax.class25;

public class FinalKeyword {
		
	public static String str = "Hello";
	
	public static final String USERNAME = "Admin"; 	// static can be final. final variables MUST be initialized
	
	public final String PASSWORD = "Admin123"; // non static can be final
	
	public static void main(String[] args) {
		System.out.println(str);
		str = "Hi";
		System.out.println(str);
		System.out.println(USERNAME);
		//username = "User123"; our final make our variables make constant and we cannot change it's value
		FinalKeyword fk= new FinalKeyword();
		//fk.PASSWORD="user123";// CE:variable is final
		
		System.out.println(fk.PASSWORD);
	}
	
	public final void hello() {
		System.out.println("last hello of today"); 
	}

}



class FinalBaby extends FinalKeyword{
	
	//FINAL METHODS CANNOT BE OVERRIDDEN
	//public void hello () { CE
	//System.out.println("Sorry it is not last hello");
	//}
}

// final class cannot have children. Final prevent INHERITANCE. FINAL CLASSES CANNOT BE EXTENDED

//class FinalGrandBaby 









