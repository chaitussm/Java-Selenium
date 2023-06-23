package com.TestNGBased.Scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo 
{
	  @DataProvider(name = "data-provider")
	    public Object[][] dataProviderMethod() {
	        return new Object[][] { { "System Testing" }, { "Integration testing" }, { "User Acceptance Testing" } };
	    }

	    @Test(dataProvider = "data-provider")
	    public void testMethod(String data) {
	        System.out.println("Data is: " + data);
	    }

}
