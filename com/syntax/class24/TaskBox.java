package com.syntax.class24;

public class TaskBox {
	
	public int area (int length, int height) {
		
		return length*height;
		 
	}
	
	public int area (int length, int height, int width) {
		return length*height*width;
	}

	public int area (int length) {
		return length*length;
}
	
	public static void main(String[] args) {
		
		TaskBox obj = new TaskBox();
		System.out.println(obj.area(38,67));
		System.out.println(obj.area(8,38,67));
		System.out.println(obj.area(8));
	}
	}


