package com.BsicsOfSelenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	
	@Test 
	
	public void ChromeLogin() {
		
		
		
		WebDriverManager.chromedriver().setup();		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("langCardClose")).click();
		
	
		
		//driver.findElement(By.xpath("//div[@class = 'hsw_autocomplePopup autoSuggestPlugin ']//descendant::input")).click();
		
		
		

		
	}
	
	
@Test 
	
	public void EdgeLogin() {
		
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Java-Selenium\\Drivers\\msedgedriver.exe");
		
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("langCardClose")).click();
		
		
		
		//driver.findElement(By.xpath("//div[@class = 'hsw_autocomplePopup autoSuggestPlugin ']//descendant::input")).click();
		
		
		driver.quit();

		
	}
	
	

	

	
	
	
	

}
