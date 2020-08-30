package com.syntax.class30;

public abstract class Country {
	
	public String name;
	
	public Country (String name) {
		this.name=name;
	}
	
	public abstract void election();
	}
	// we need to create an object of abstract class

class USA extends Country {
		
	public USA (String name) {
			super(name);
		}
	
		public void election () {
			System.out.println(name + " holds presendtial elections every 4 years");
		}
}
		
class Kazakhstan extends Country {
	
	public Kazakhstan (String name) {
		super(name);
	}
	public void election () {
		System.out.println(name + " holds election whenever they decide so");

	}
}
	
class Italy extends Country {
	
	public Italy (String name) {
		super(name);
	}
	
	public void election () {
		System.out.println(name + " holds presedential elections every 4 years");

	}
}


