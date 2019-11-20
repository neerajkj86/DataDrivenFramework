package com.w2a.rough;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.utilities.ExcelReader;

public class Hashtabel {

	
		
		
		@Test(dataProvider = "FetchData")
		public void ExcelData(Hashtable<String , String> data)
		{
			
			System.out.println(data.get("firstname"));
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		@DataProvider
		public Object[][] FetchData()
		{
			
			ExcelReader excel = new ExcelReader("C:\\Selenium\\testdata.xlsx");
			
			String sheetName = "AddCustomerTest";
		
			int rows = excel.getRowCount(sheetName);
			
			int cols = excel.getColumnCount(sheetName);
			
			Object [][] data  = new Object[rows-1][1]; 
			
			Hashtable<String, String> table = null;
			
			for (int i =2;i<=rows;i++)
			{
				
				table = new Hashtable<String, String>(); //Creating the hashtable for everyrows
				
				
				for (int j=0;j<cols;j++)
				{
					//data[i-2][j]=excel.getCellData(sheetName, j, i);
					
				table.put(excel.getCellData(sheetName, j, 1), excel.getCellData(sheetName, j, i));	
					
				data[i-2][0] = table;
					
					
					
					
					
					
					
					
					
					
				}
			}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			return data;
			
		}
		
		
		

	
}
