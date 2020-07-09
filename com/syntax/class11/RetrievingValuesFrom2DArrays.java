package com.syntax.class11;

public class RetrievingValuesFrom2DArrays {
	public static void main(String[] args) {
		
	
	
	// put the months for each in one row
	
	String [][] months = {
			{"December", "January", "February"},// first dimensional array
			{"March", "April", "May"},// second dimensional array
			{"June", "July", "August"},// third dimensional array
			{"September", "October", "November"}// fourth dimensional array
	};
	
	int season = months.length;//how many arrays are inside or how many rows
	System.out.println(season);
	
	int winterLength = months[0].length;// how many elements or columns are in row index [0]
	System.out.println(winterLength);
	
	int springLength = months[1].length;// how many elements or columns are in row index [1]
	System.out.println(springLength);
	
	int lastRowsize=months[season-1].length;
	System.out.println(lastRowsize);
	
	for (int i=0; i<months.length; i++) {//iterating over rows
		
		for (int j=0; j<months[i].length; j++) {//iterating over columns
			
			System.out.print(months[i][j] + " ");
		}
		System.out.println();
		
		
	}
	
	
	
	
	// nested loops are best fit to 2D Arrays
	
	
	
	
	
	}
	

}
