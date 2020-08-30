package com.syntax.class24;

public class DegreeTest {
	
	public static void main (String [] args) {
		
		Degree d= new Degree("Africa");
		d.getPrerequisite();

		Bachelors b = new Bachelors("Diploma");
		b.getPrerequisite();
		
		Masters m = new Masters("Bachelors");
		m.getPrerequisite();
		
	}

	}


