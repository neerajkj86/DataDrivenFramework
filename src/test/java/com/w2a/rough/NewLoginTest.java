package com.w2a.rough;

import org.testng.annotations.Test;

public class NewLoginTest 
{
	
	@Test(dataProviderClass= Dp.class,dataProvider ="dp")
	public void DoLogin(String username ,String password)
	{
		System.out.println(username+"-------------"+password);
	}


}
