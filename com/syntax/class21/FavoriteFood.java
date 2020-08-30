package com.syntax.class21;

public class FavoriteFood {
	
	public String fruit;
	public String kebab;
	public String fish;
	
	public FavoriteFood (String fruit, String kebab, String fish) {
		this.fruit = fruit;
		this.kebab=kebab;
		this.fish=kebab;
	}
			
		public static void main (String [] args ) {
			FavoriteFood ff = new FavoriteFood ("Mango", "Chapli", "Salmon");
			
			ff = new FavoriteFood ("Apple", "Chicken", "Sea Bass");
		}
	}

	//this keyword -- > refers to the current object
	// this keword: can be used with : 
	// variables:
	
	
	