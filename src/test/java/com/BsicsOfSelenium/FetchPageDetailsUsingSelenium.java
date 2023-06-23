package com.BsicsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchPageDetailsUsingSelenium {

	@Test
	public void GetPageDetails() 
	{
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn-automation.com/");
		driver.manage().window().maximize();
		
		
		String PageTitle = driver.getTitle();
		System.out.println("Page title is : " + PageTitle);
		
	  String currenturl =  driver.getCurrentUrl();
		System.out.println("current  url is : " + currenturl);
		
		String Pagesource = driver.getPageSource();
		System.out.println("Page source is : " + Pagesource);

         JavascriptExecutor js = (JavascriptExecutor)driver;
         String DomainName =  js.executeScript("return document.domain;").toString();
         System.out.println("Page Domain is : " + DomainName);		
         
         String title =  js.executeScript("return document.title;").toString();
         System.out.println("Page Title is : " + title);	
         
         String url =  js.executeScript("return document.URL;").toString();
         System.out.println("Page url  is : " + url);
         
         //scroll functionality by javascript executor 
         
         js.executeScript("window.scrollBy(0,1000)");
         
         //To Scroll until the element visible 
       WebElement Element =   driver.findElement(By.xpath("//header[@class='entry-header']//a[contains(text() , \"Cypress CLI Commands\")]"));
         
       //This will scroll the page till the element is found		
       js.executeScript("arguments[0].scrollIntoView();", Element);
    
       js.executeScript("arguments[0].click();", Element);
		
       
       //To get color, font
       
      String fontsize =  driver.findElement(By.xpath("//p//strong[contains(text() , 'Get Cypress Info')]")).getCssValue("font-size");
	  System.out.println("Font size is : " + fontsize );
		
	 // String color =  driver.findElement(By.xpath("//p//strong[contains(text() , 'Get Cypress Info')]")).getCssValue("font-color");
	// System.out.println("Font color  is : " + color );
         
	  String type =  driver.findElement(By.xpath("//p//strong[contains(text() , 'Get Cypress Info')]")).getCssValue("font-type");
	  System.out.println("Font type  is : " + type );
	  
    //  String background =  driver.findElement(By.xpath("//p//strong[contains(text() , 'Get Cypress Info')]")).getCssValue("background-colour");
     // String backcolor = Color.fromString(background).asHex();
      //System.out.println("background color  is : " + backcolor );
      
      
	  
	  Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
	  String browserName = cap.getBrowserName().toLowerCase();
	  System.out.println(browserName);
	  String os = cap.getPlatformName().toString();
	  System.out.println(os);
	  String v = cap.getBrowserVersion().toString();
	  System.out.println(v);
	  
      // To get browser details
      System.out.println("Browser Name is : "+((RemoteWebDriver) driver).getCapabilities().getBrowserName().toLowerCase());
      System.out.println("Browser Version is : "+((RemoteWebDriver) driver).getCapabilities().getBrowserVersion().toString());
      System.out.println("Platform Name is : "+((RemoteWebDriver) driver).getCapabilities().getPlatformName().toString());
      driver.quit();
      
	}

}
