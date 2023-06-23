package com.TestNGBased.Scripts;

import org.testng.annotations.Test;

public class InvocationCount_Exceptions {
	
	@Test(invocationCount = 10 , expectedExceptions = ArithmeticException.class)
	public void BaseTest() {
		
		System.out.println("To Handle the exeception");
		int i = 1 / 0;
		
	}

}
