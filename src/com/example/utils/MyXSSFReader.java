package com.example.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyXSSFReader {
   
   public  XSSFWorkbook wb;
   public XSSFSheet sheet;
   
   //"/src/com/example/config/"
	//+ "DataSheet.xlsx"
	public MyXSSFReader(String path, String sheetname){
		
		
		
		try {
			wb = new XSSFWorkbook(new FileInputStream(System.getProperty("user.dir")+path));
			sheet=wb.getSheet(sheetname);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		public Object[][] getData() {
			int firstrow=sheet.getFirstRowNum();
			int lastrow=sheet.getLastRowNum();
			System.out.println(firstrow+"============= "+lastrow);
			
			XSSFRow row=sheet.getRow(0);
		       int firstcell=row.getFirstCellNum();
		       int lastcell=row.getLastCellNum();
		       System.out.println(firstcell+" ============== "+lastcell);
		       
		       
		       Object[][] obj=new Object[lastrow+1][lastcell+1];
		       
		       for(int rownum=firstrow+1;rownum<lastrow;rownum++) {
		    	   for(int cellnum=firstcell;cellnum<lastcell;cellnum++) {
		    		   row=sheet.getRow(rownum);
		    		 XSSFCell cell= row.getCell(cellnum);
		    		 String value= cell.getStringCellValue();
		    		 //System.out.println(value);
		    		 obj[rownum][cellnum]=value;
		    		 
		    	   }
		       }
			return obj;
		       
		}

}
