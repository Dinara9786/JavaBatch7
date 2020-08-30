package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLReadingDemo {
	public static void main(String[] args) throws IOException {
		
	
	//C:\Users\drysa\eclipse-workspace\JavaBatch7\testdata
	
	// Step 1:
	String xlPath = System.getProperty("user.dir") + "/testdata/TestSample3.xlsx";
	
	// Step 2: we need to build connection 
	
	FileInputStream fis = new FileInputStream(xlPath);
	
	// Step 3: we work with my excel file 
	
	//Apache poi is a java based library that is used to work with microsoft files
	// to work with excel Apache provides 2 different classes: 
	//XSSFWorkbook - used for .xlsx  files (from 2007 and up). It is a class
	//HSSFWorkbook - used for .xls file  (below 2007)
	
	XSSFWorkbook workbook =new XSSFWorkbook(fis);
	
	Sheet sheet = workbook.getSheet("Test"); // name of the sheet
	
	Row row1=sheet.getRow(0);
	
	Cell row1Cell3 = row1.getCell(2);
	
	String value = row1Cell3.toString();
	
	System.out.println(value);// last name
	
	Row row2 = sheet.getRow(1);
	
	String valueOfAnotherCell = row2.getCell(0).toString();
	
	System.out.println(valueOfAnotherCell);
	
	Row row3 = sheet.getRow(0);
	String middleName = row3.getCell(1).toString();
	System.out.println(middleName);
	
	Row row4 = sheet.getRow(1);
	String midname = row4.getCell(1).toString();
	System.out.println(midname);
	
			
	}
}
