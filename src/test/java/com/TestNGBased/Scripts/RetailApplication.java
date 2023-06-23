package com.TestNGBased.Scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetailApplication {
	
static WebDriver driver; 
	
	@BeforeMethod
	public void LaunchBrowser() {
		
         WebDriverManager.chromedriver().setup();	       
	    driver = new ChromeDriver();
        
	}
	
	@Test
	
	public void LoginToApp() {
	
		driver.get("http://tutorialsninja.com/demo/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
		List<WebElement> prodlist = driver.findElements(By.xpath("//div[@class = 'product-thumb transition']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments.scrollBy", prodlist);
		
		int Itemcount = prodlist.size();
		for(int i = 0; i <= Itemcount ; i++) {
			
			if(Itemcount ==2) {
				
				driver.findElement(By.xpath(("//div[@class = 'button-group']//descendant::span"))).click();
			}
			
		}
		
		WebElement Cart = driver.findElement(By.id("cart"));
		
		if(Cart.isDisplayed()) {
			
			Cart.click();
			
			List<WebElement> CartTable = driver.findElements(By.xpath("//li//table[@class = 'table table-bordered']//tr"));
			
			int CartContents = CartTable.size();
			
			 String TotalItem = "";
			
			for(WebElement content : CartTable) {
				
				String item = content.getText();
				
				if(item.equals("Total")) {
					
					TotalItem = TotalItem + item; 
					
					System.out.println("Required total is "  + TotalItem);
				}
				
			}
			
			
		}
	}
	
	
	
	
	@AfterMethod
	public void TearDownBrowser() {
		
		driver.close();
        
	}
	
	
	

}
