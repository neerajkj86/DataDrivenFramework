package com.w2a.rough;

import org.testng.annotations.DataProvider;

public class Dp 
{
	
	
	
	
	
	@DataProvider(name = "dp")
	public Object [][] get()
	{
		
		Object[][] data = new Object [2][2]; 
		
		
		data[0][0] = "Neeraj";
		data[0][1] = "123";
		
		data[1][0] = "Rahul";
		data[1][1] = "12345";
		
		
		
		return data;
		
	}

}
