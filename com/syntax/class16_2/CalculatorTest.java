package com.syntax.class16_2;

public class CalculatorTest {
	public static void main(String[] args) {
		
		// I want to call method add();
		
		Calculator c = new Calculator ();
		c.add(100, 200);
		c.add(10, 20);
		c.add(300, 64);	

		c.sub(100, 200);
		c.sub(10, 20);
		c.sub(300, 64);
	
		c.div (100, 200);
		c.div(10, 20);
		c.div(300, 64);
		
		c.mult(100, 200);
		c.mult(10, 20);
		c.mult(300, 64);
	}

}
