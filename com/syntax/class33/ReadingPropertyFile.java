package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertyFile {
	
	public static void main(String[] args) throws IOException {
		
		//C:\Users\drysa\eclipse-workspace\JavaBatch7\configs\Example.properties
		
		//1.  we identified to the file i would like to read
		String filePath = "configs/Example.properties";
		
		// 2. create an object of FileInputStream class
		
		FileInputStream fis = new FileInputStream (filePath); // fis is a variable
		
		// 3. to work with property file in Java we use Properties class in Java
		// if we have a class we have methods and variables
		
		Properties prop = new Properties(); // prop is a variable
		prop.load(fis);  // we are loading our input stream // all data is stored in prop. variable
		
		String value1 = prop.getProperty("username"); // we get the property of key of username which is string value
		System.out.println(value1);
		
		// when we work with property it is always of String type
		
		String value2 = prop.getProperty("city");
		System.out.println(value2);
		
		String password = prop.getProperty("password");
		System.out.println(password);
		
		String value3 = prop.getProperty("street");
		System.out.println(value3);
		
		String organization = prop.getProperty("organization");
		System.out.println(organization);
		
	}

}
