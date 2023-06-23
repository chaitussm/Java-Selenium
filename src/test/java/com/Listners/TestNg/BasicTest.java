package com.Listners.TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(com.Listners.TestNg.TestNgListner.class)
public class BasicTest 
{

	
	@Test
	public void LoginToMMT()
	{
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
        String Url = driver.getCurrentUrl();
        System.out.println("Url detail is " + Url);
        driver.quit();
	}
	
	@Test
	public void TitleVerify()
	{
		System.out.println("Dummy");
		Assert.assertTrue(false);
	}
	

}
