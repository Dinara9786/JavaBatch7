package com.syntax.class25;

public class StoreTest {
	public static void main(String[] args) {
		
		// we should create 3 different objects
		Store macys =new Macys ("Macys", "Tysons, Virginia");
		Store starbucks=new Starbucks ("Starbucks", "New York");
		Store nike=new Nike ("Nike", "Los Angeles", "boots");
		
		String [] array = {"Hello", "Hi"};
		Store [] myStores = {macys, starbucks, nike};
			
				// we create array of Store object
		
		
		Store [] stores ={new Macys ("Macys", "florida"), new Starbucks ("Starbucks", "Texas"), 
				new Nike ("Nike", "Illinois", "boots")};
		int size = stores.length;
		System.out.println(size);
		
		for (Store s:stores) {
			s.openHours(); // method
			s.sell();
			
			System.out.println("=================================");
		}
		
		System.out.println("========LOOPING MY STORES ARRAY================");
		
		for (int i = 0; i<myStores.length; i++) {
			myStores[i].openHours();
			System.out.println("======================");
		}
		
		
		
		
		
		
		
	}
}

	

