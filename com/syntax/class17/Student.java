package com.syntax.class17;

public class Student {
	
	char getGrade (int a) {
		
		char score;
		
		if (a>90) {
			score = 'A';
		} else if ( a<=90 && a>80) {
			score = 'B';
		} else if ( a<=80 && a>70) {
			score = 'C';
		} else if ( a<=70 && a>50) {
			score = 'D';
		} else {
			score = 'F';
		}
		return score;
	}
	
	

}
