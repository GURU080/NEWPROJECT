package com.activetime.baseclass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excellibray {
	
	public String getExcelData(String sheetname, int rownum, int cellnum) throws Throwable, IOException {
		String retval=null;
		FileInputStream fis=new FileInputStream("C:\\Users\\hari\\Desktop\\data for selnium.xlsx");
		 Workbook wb=WorkbookFactory.create(fis);
		 Sheet s= wb.getSheet("Login");
		 Sheet s1= wb.getSheet("customer");
		 
		      Row r=s.getRow(1);
		      Cell c=r.getCell(0);
		      return retval=c.getStringCellValue();
		      
}
}