package com.syntax.class23;

public class TestSumMethods {
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		double result = obj.sum(10.99, 23.89);
		System.out.println(result);
		System.out.println(obj.sum(10,  20, 30));
		System.out.println();
	}
	}
	

