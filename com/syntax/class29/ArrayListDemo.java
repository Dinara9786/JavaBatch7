package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		// let's create an ArrayList that will store numbers
		
		ArrayList<Integer> alist=new ArrayList<>(); // inside my array list I am storing Integer type of Objects
		
		alist.add(100);//index 0
		alist.add(200);//index 1
		alist.add(300);//2
		//alist.add("400"); we cannot store String Objects into ArrayList of Integer Objects
		
		System.out.println("Size of alist is " + alist.size());//to see the size
		System.out.println(alist);// to see the elements
		
		alist.add(1);//4
		alist.add(2);//5
		alist.add(2);// duplicate
		alist.add(2);// duplicate
		alist.add(2);
		alist.add(2);
		
		System.out.println(alist);// to see the elements
		
		alist.remove(2);// we removed index 2 ie 300 (remove by specifiying index)
		System.out.println(alist);
		
		
	}

}
