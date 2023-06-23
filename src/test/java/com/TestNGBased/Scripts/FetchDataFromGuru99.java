package com.TestNGBased.Scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchDataFromGuru99 

{
	
	

	
	 static WebDriver driver;
	 
	@BeforeMethod
	public void Openbrowser() {
		
	
WebDriverManager.chromedriver().setup();		       
			    driver = new ChromeDriver();
		        driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=DFSFWqG5HYjD4AKPkpr4BA");
				driver.manage().window().maximize();
		
	}
	
	@Test(priority = 1)
	public void LoginToApp() {
		
        driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		String AppUrl = driver.getCurrentUrl();
		System.out.println("Application URL is " + AppUrl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> data = driver.findElements(By.xpath("//div[@class = 'row featured-boxes']//descendant::div[@class ='col-md-3'][1]"));
		
		for(WebElement ele : data) {
			
			String element = ele.getText();
			
			System.out.println("Elements are : " + element);
			
			
		}
	}
	
	@Test(priority = 2)
	public void LoginToMMT() {
		
        driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		String AppUrl = driver.getCurrentUrl();
		System.out.println("Application URL is " + AppUrl);
		
		
	}
	
	
	@AfterMethod
	public void CloseBrowser() {
		
       driver.quit();
		
	}
}
