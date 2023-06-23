package com.TestNGBased.Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupsInTestNg {

  static  WebDriver driver;
    
	@BeforeMethod
	public static void BaseLogin() {
		
		    WebDriverManager.chromedriver().setup();
		    driver = new EdgeDriver();
	        driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=DFSFWqG5HYjD4AKPkpr4BA");
			driver.manage().window().maximize();
	}
	
	@Test(priority = 1, groups = "Login Page")
	public void LoginToApp() {
		
        driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String AppUrl = driver.getCurrentUrl();
		System.out.println("Application URL is " + AppUrl);
		
		
	}
	
	@Test(priority = 2,  groups = "Login Page")
	public void LoginToMMT() {
		
        driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		String AppUrl = driver.getCurrentUrl();
		System.out.println("Application URL is " + AppUrl);
		
		
	}
	@Test(priority = -2,  groups = "Login Page")
	public void LoginToGoibibo() {
		
        driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		String AppUrl = driver.getCurrentUrl();
		System.out.println("Application URL is " + AppUrl);
		
		
	}
	
	@Test(priority = 0,  groups = "Login Page")
	public void LoginToYaatra() {
		
        driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		String AppUrl = driver.getCurrentUrl();
		System.out.println("Application URL is " + AppUrl);
		
		
	}
	
	@AfterMethod
	public void CloseBrowser() {
		
	       driver.quit();
}
	
}
