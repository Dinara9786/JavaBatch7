package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingIntoPropertyFile {
	
		// writing into existing file
		public static void main(String[] args) throws IOException {
			
			String file = "configs/Example.properties";
			
			FileInputStream fis = new FileInputStream(file);
			
			Properties p = new Properties();
			p.load(fis);
			
			// we should load first and then make changes
			
			p.setProperty("street", "River Place, West Wing");// we make changes in JAVA program into the same file or new file
			
			//specifying path for different file
			// first we need to create connection
			
			String newFile = "configs/NewFile.properties";
			
			//if file is not there it will be created 
			FileOutputStream fos = new FileOutputStream(newFile);
			
			// to which we will be pushing our code = to Example
			
			p.store(fos, "Added more additional keys");
			
			// not to loose the existing data, we should not forget to load first the existing data and then make changes
			
			
		}
}
