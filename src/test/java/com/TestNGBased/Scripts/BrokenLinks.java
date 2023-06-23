package com.TestNGBased.Scripts;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BrokenLinks 
{
	public static void CheckBrokenLink(String linkUrl)
	{
		try {
		      URL url = new URL(linkUrl);
		      
		      HttpURLConnection httpconnect = (HttpURLConnection)url.openConnection();
		      
		      httpconnect.setConnectTimeout(5000);
		      
		      httpconnect.connect();
		      
		      if(httpconnect.getResponseCode() >= 400)
		    	  System.out.println(linkUrl + " ======> " + httpconnect.getResponseMessage() + "is a brokenlink" );
		      else
		    	  System.out.println(linkUrl + " ======> " + httpconnect.getResponseMessage() );
	      }
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
		
		@Test
		public void FetchBrokenLink()
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.makemytrip.com/");
			List<WebElement> tags = driver.findElements(By.tagName("a"));
			
			List<String> urllist = new ArrayList<String>();
			
			for(WebElement ele : tags)
			{
				String url = ele.getAttribute("href");
				
				urllist.add(url);
			}
			
			long stTime = System.currentTimeMillis();
			
			urllist.parallelStream().forEach(ele -> CheckBrokenLink(ele));
			long endTime = System.currentTimeMillis();
			
			System.out.println("Total time taken" + (endTime -stTime));
			
			
			
		}

}
