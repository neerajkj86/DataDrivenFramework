package com.w2a.rough;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test12 
{
	
	
	@Test
	@Parameters({"browser","myName"})
	public void ExecuteTest(String browser,String myName)
	{
		System.out.println("launching browser "+browser+"_"+myName);
	}

}
