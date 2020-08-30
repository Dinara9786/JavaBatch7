package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Recap {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String xlFilePath = System.getProperty("user.dir")+ "/testdata/TestSample1.xlsx";
		
		FileInputStream fis = new FileInputStream (xlFilePath);
		
		// create an object OWrkbook
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet ("TestSheet");
		
		// Get number of rows and cols
		int row = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		
		List<Map<String, String>> xlList = new ArrayList<>();
		
		//using nested for loop
		for (int r=1; r<row; r++ ) {
			Map<String, String> lmap = new LinkedHashMap<>();
		}
		
		for (int c=0; c<cols; c++) {
			lmap.put(sheet.getRow().getCell(c).toString;
			Sheet.getRow(r).getCell(c).toString());
				 
		}
		
		xlList.add(lmqp);
	}

}
