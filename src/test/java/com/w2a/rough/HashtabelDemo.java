package com.w2a.rough;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.utilities.ExcelReader;

public class HashtabelDemo 
{
	
	
	@Test(dataProvider ="fetchExcelData" )
	public void testing(Hashtable<String, String > data)
	{
		
	}
	
	
	
	
	@DataProvider
	public Object [][] fetchExcelData()
	{
		
		ExcelReader excel = new ExcelReader("\"C:\\\\Selenium\\\\testdata.xlsx");
		
		String sheetName = "Login";
		int rows=excel.getRowCount(sheetName);
		
		int cols =excel.getColumnCount(sheetName);
		
		
		Object [][] data = new Object[rows][1];
		
		Hashtable<String, String> table = null; //declaring the hashtable
		
		
		for (int i=2;i<rows;i++)
		{
			table  = new Hashtable<String, String>();
			
			
			
			for (int j=0;j<=cols;j++)
			{
				
				table.put(excel.getCellData(sheetName, 1, 1), excel.getCellData(sheetName, j,i ));
				
				data[i-2][0]=table;
				
			}
				
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return null;
		
	}

}
