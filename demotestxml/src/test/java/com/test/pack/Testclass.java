package com.test.pack;

import org.testng.annotations.Test;

public class Testclass {
	
	@Test
	public void Test()
	{
		
		MainMethod n= new MainMethod();
		n.maintest();
		System.out.println("the time from test class is "+System.currentTimeMillis());
	}

}
