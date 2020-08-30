package com.syntax.class23;

public class IceCream {
	
	String flavor, brand, color;
	
	public IceCream (String flavor, String brand, String color) {
		
		this.flavor = flavor;
		this.brand=brand;
		this.color = color;	
	}
}

class Gelato extends IceCream  {
	
	Gelato (String flavor, String brand, String color) {
		super(flavor, brand, color);		
	}
}

class Sorbeto extends IceCream {
	
	double price;
	
	Sorbeto (String flavor, String brand, String color, double price) {
		super(flavor, brand, color); //super - call to parent class constructor always MUST be first
		this.price = price;	
}
	
	public Sorbeto (String flavor, String brand, String color) {
		super (flavor, brand, color);
	
		}
	}

class MiniSorbeto extends Sorbeto {
	
	int calories;
	public MiniSorbeto (String flavor, String brand, String color, double price, int calories) {
	super (flavor, brand, color, price);
		this.calories =calories;
	}
}