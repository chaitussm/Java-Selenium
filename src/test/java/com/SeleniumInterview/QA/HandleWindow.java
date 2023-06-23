package com.SeleniumInterview.QA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HandleWindow extends BaseClassTest
{
	@Test
	public void LaunchApp()
	{
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://learn-automation.com/testng-tutorials-for-beginners/");
		
		//Store the ID of the original window
		String originalWindow = driver.getWindowHandle();
		
		//Check we don't have other windows open already
		//assert driver.getWindowHandles().size() == 1;
		
		//Loop through until we find a new window handle
		for (String windowHandle : driver.getWindowHandles()) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		        driver.switchTo().window(windowHandle);
		       
		        System.out.println( driver.getTitle());
		        break;
		    }
		}
		
		
	
	}

}
