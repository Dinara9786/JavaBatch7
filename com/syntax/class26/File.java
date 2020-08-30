package com.syntax.class26;

public abstract class File {
		
	public void edit () {
		System.out.println("to open doc file we need microsoft word tob e installed");
	}
	
	public void close () {
		System.out.println("to close doc file we need microsoft word tob e installed");
	}
		
	public abstract void open () ;

	}
	
class JavaFile extends File {
	
	public void open () {
		
		System.out.println("To open a JavaFile document we need to create the document first");
	}
}

class WordFile extends File {
	
	public void open () {
		
		System.out.println("To open a WordFile document we need to create the document first");
}
}
class PdfFile extends File {
	
	public void open () {
		
		System.out.println("To open a PdfFile document we need to create the document first");
}
}




