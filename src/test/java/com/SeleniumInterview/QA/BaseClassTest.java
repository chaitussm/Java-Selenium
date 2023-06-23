package com.SeleniumInterview.QA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTest 
{
static WebDriver driver;
	
	static JavascriptExecutor js;
	public String ClickLoginBtn = "//ul//descendant::p[@data-cy= 'LoginHeaderText']";
	
	@BeforeMethod
	public void LaunchBrowser()
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	    js = (JavascriptExecutor)driver;
	    driver.manage().window().maximize();
	    driver.get("https://learn-automation.com/");
	    
	}

	
	@AfterMethod
	public void Teardown()
	{
		driver.quit();
	}
}
