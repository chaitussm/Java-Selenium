package com.TestNGBased.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BsicsOfSelenium.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SapientInterview  {
	
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
		
        driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String AppUrl = driver.getCurrentUrl();
		System.out.println("Application URL is " + AppUrl);
		
		
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
