package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class WriteIntoExcel {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//getting data from existing file and writing into new 
		
		String xlFilePath = System.getProperty("user.dir") + "/testdata/TestSample1.xlsx";
		
		FileInputStream fis = new FileInputStream(xlFilePath);
		
		Workbook book = new XSSFWorkbook(fis);
		
		
		
		
		
	}

}
