package com.w2a.rough;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.utilities.ExcelReader;

public class DataProviderTest {

	
	@Test(dataProvider ="getData")
	public void DoLogin(String username ,String password)
	{
		System.out.println(username+"-------------"+password);
	}

	
	
	
	
	
	
	@DataProvider
	public Object[][] getData()
	
	{
	
		ExcelReader excel = new ExcelReader("C:\\Selenium\\testdata.xlsx");
		
		String sheetName = "Login";
		
		int rows =excel.getRowCount(sheetName);
		
		int col=excel.getColumnCount(sheetName);
		
		System.out.println("total number of rows are" +rows);
		
		System.out.println("total number of columns are" +col);
		
		Object [][] data = new Object [rows-1][col];
		
		
		for (int i =2;i<=rows;i++)
		{
			for (int j= 0;j<col;j++)
			{
				data[i-2][j]=excel.getCellData(sheetName, j, i);
			}
		}
		
		
		return data;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
