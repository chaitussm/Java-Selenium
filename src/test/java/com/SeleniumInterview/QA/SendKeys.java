package com.SeleniumInterview.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeys 
{
	
	static WebDriver driver;
	
	static JavascriptExecutor js;
	
	@BeforeMethod
	public void LaunchBrowser()
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void EnterText()
	{
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='login__tab gotrible']")).click();
		
		WebElement loginform = driver.findElement(By.xpath("//div[@class = 'loginCont__inputwrap   ']//descendant::input[@class = 'loginCont__input']"));
		
		if(loginform.isEnabled())
		{
			//js.executeAsyncScript("document.getElmentByName('//div[@class = 'loginCont']//descendant::form').value = '12345';");
			//js.executeScript("document.getElmentByXpath('//div[@class = 'loginCont__inputwrap   ']//descendant::input[@class = 'loginCont__input']').value = '12345';");
			
			loginform.sendKeys("12345");

			
		}
	}
	

}
