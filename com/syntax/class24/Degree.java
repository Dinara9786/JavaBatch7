package com.syntax.class24;

public class Degree {
	
	 static String str; 
	
	public Degree (String str) {
		this.str=str;
	}
	
	public void getPrerequisite () {
		System.out.println("To get a degree of " + str + " you need high school diploma");
	}
}

class Bachelors extends Degree {
	public Bachelors (String str) {
		super(str);
	}
	
}
class Masters extends Degree {
	
	public Masters (String str) {
		super (str);
	}
	@Override
	public void getPrerequisite() {
		System.out.println("To get a degree you need Bachelors degree");
	}
}


	

