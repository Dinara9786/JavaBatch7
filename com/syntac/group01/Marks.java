package com.syntac.group01;

//	We have to calculate the average of marks obtained in three subjects by student A and by student B.
//	Create class 'Marks' with an abstract method 'getPercentage' 
//	that will be returning the average percentage of marks. 
//	Provide implementation of abstract method in classes 'A' and 'B'. 
//	The constructor of student A takes the marks in three subjects as its parameters and 
//	the marks in four subjects as its parameters for student B. Test your code

	public abstract class Marks {
	
	public abstract double getPercentage();
	
}
class A extends Marks {
	
	double gradeMath, gradeScience, gradeArt;
	
	A (double gradeMath, double gradeScience, double gradeArt) {
		this.gradeMath = gradeMath;
		this.gradeScience = gradeScience;
		this.gradeArt = gradeArt;
	}
	
	public double getPercentage () {
		double average=(this.gradeArt+this.gradeMath+this.gradeScience)/3;
		return average;
	}
}

class B extends Marks{
	
double gradeMath, gradeScience, gradeArt, gradeHistory;

B (double gradeMath, double gradeScience, double gradeArt, double gradeHistory) {
	this.gradeMath = gradeMath;
	this.gradeScience = gradeScience;
	this.gradeArt = gradeArt;
}

public double getPercentage () {
	double average=(this.gradeArt+this.gradeMath+this.gradeScience)/3;
	return average;
}
}


