package com.syntax.class26;

public class FileTest {
	
	public static void main(String[] args) {
		
		File [] files = {new JavaFile(), new PdfFile(), new WordFile()};
		
		for (File file:files) {
			file.open();
			file.close();
		}
		
		
		
	}

}
