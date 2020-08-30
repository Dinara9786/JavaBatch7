package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperty02 {
	
	public static void main(String[] args) throws IOException {
		
		String filepath = "configs/Example02.properties";
		
		FileInputStream fis = new FileInputStream (filepath);
		Properties prop = new Properties();
		prop.load(fis);
		
		String value1 = prop.getProperty("browser");
		System.out.println(value1);
		
		String value2 = prop.getProperty("url");
		System.out.println(value2);
		
		String value3 = prop.getProperty("username");
		System.out.println(value3);
		
		String value4 = prop.getProperty("password");
		System.out.println(value4);
		
		
	}

}
