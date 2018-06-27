package com.example.code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.utils.MyXSSFReader;

public class ExampleReadApachePOI {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		/*System.setProperty("webdriver.chrome.driver", "/home/nagendra/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://reg.ebay.in/reg/PartialReg?"
				+ "siteid=203&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.in%2F&signInUrl=https%3A%2F%2Fwww.ebay.in%2Fsignin%3Fsgn%3Dreg%26siteid%3D203%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.in%252F");
		*/
	
	
       MyXSSFReader reader=new MyXSSFReader("/src/com/example/config/DataSheet.xlsx", "Data");
       
        Object[][] obj=reader.getData();
        /*for(Object[] obj1:obj) {
        	for(Object obj2:obj1) {
        		System.out.print(obj2+" ");
        	}
        	System.out.println();
        }*/
        
        for(int i=1;i<obj.length-1;i++) {
        	for(int j=0;j<obj[i].length-1;j++) {
        		System.out.print(obj[i][j]+" ");
        	}
        	System.out.println();
        }
	

	}

}
