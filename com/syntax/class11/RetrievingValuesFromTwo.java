package com.syntax.class11;

public class RetrievingValuesFromTwo {
public static void main(String[] args) {
	
	String [][] months = {
			{"December" , "January" , "February"},
			{"March" , "April" , "May"},
			{"June" , "July" , "August"},
			{"September" , "October" , "November"}
	};
	
	int rows = months.length; // how many arrays are inside or how many rows?
	System.out.println(rows + " seasons");
	
	int winterLength = months[0].length; // how many elements or columns are in row with index 0? 
	System.out.println(winterLength + " momth in winter/row 0");
	
	int lastRowSize = months[rows -1].length;
	
	for(int i=0; i<months.length; i++) {
		for (int j=0; j<months[i].length; j++) { //iterating over columns
			System.out.println(months[i][j]
					);
			}
	}
	
	
	
	
			
	
}
}
