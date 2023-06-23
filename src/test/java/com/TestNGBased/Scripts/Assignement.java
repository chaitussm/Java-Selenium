package com.TestNGBased.Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement {
	
	static WebDriver driver; 
	
	@BeforeMethod
	public void LaunchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
        
	}
	
	@Test
	public void LaunchApp() {
		
		driver.get("https://phptravels.net");
		driver.manage().window().maximize();
		
		String userapplication = driver.getCurrentUrl();
		System.out.println("User application detail is " + userapplication);
		
	}

	@Test
	public void LaunchSuperAdminApp() {
		
		driver.get("https://phptravels.net/admin");
		driver.manage().window().maximize();
		
		String Adminapplication = driver.getCurrentUrl();
		System.out.println("Admin application detail is " + Adminapplication);
		
		
	}
	
	@Test
	public void LoginApp() {
		
		driver.get("https://phptravels.net/login");
		driver.manage().window().maximize();
		
		String Loginapplication = driver.getCurrentUrl();
		System.out.println("Admin application detail is " + Loginapplication);
		
		
	}
	
	@Test
	public void SupplierApp() {
		
		driver.get("https://phptravels.net/login");
		driver.manage().window().maximize();
		
		String Supplierapplication = driver.getCurrentUrl();
		System.out.println("Admin application detail is " + Supplierapplication);
		
		
	}
	
	@AfterMethod
	public void TearDownBrowser() {
		
		driver.quit();
        
	}
}
