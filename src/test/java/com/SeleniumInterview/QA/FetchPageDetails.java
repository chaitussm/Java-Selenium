package com.SeleniumInterview.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchPageDetails extends BaseClassTest
{
	
	
	@Test
	public void LaunchApp()
	{
		driver.get("https://learn-automation.com/");
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	@Test
	public void LaunchingApp()
	{
		js = (JavascriptExecutor)driver;
		
		
		
		//To fetch the domain name
		String DomainName =  js.executeScript("return document.domain;").toString();
	    System.out.println("Page Domain is : " + DomainName);	
		
	    //To fetch page title
	    String title =  js.executeScript("return document.title;").toString();
        System.out.println("Page Title is : " + title);
        
        //To fetch page URL
        String url =  js.executeScript("return document.URL;").toString();
        System.out.println("Page url  is : " + url);
        
        //scroll functionality by javascript executor 
        js.executeScript("window.scrollBy(0,1000)");
        
        //To Scroll until the element visible 
        WebElement Element =   driver.findElement(By.xpath("//header[@class='entry-header']//a[contains(text() , \"Cypress CLI Commands\")]"));
          
        
        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
     
        js.executeScript("arguments[0].click();", Element);
 		
	}

}
