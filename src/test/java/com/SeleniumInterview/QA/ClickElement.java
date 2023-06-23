package com.SeleniumInterview.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickElement extends BaseClassTest
{
	
	@Test
	public void LaunchApp()
	{
		driver.get("https://www.makemytrip.com/");
		
		WebElement clickbtn = driver.findElement(By.xpath(ClickLoginBtn));
		
		String element = driver.findElement(By.xpath(ClickLoginBtn)).getText();
		
		if(clickbtn.isEnabled())
		clickbtn.click();
		else 
		{
			js = (JavascriptExecutor)driver;
			js.executeAsyncScript("arguments[0].click();" , clickbtn);
		}
		System.out.println(element);
	}

}
