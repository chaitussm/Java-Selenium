package com.BsicsOfSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrap {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();		
   WebDriver driver = new ChromeDriver();
   driver.get("http://learn-automation.com/");
   driver.manage().window().maximize();
   List<WebElement>ele_list = driver.findElements(By.xpath("//ul[@class ='sub-menu toggle-submenu']//li//a"));
   for(int i=0;i<ele_list.size();i++){
	   WebElement element = ele_list.get(i);
	  String innerhtml =  element.getAttribute("innerHTML");
  	  System.out.println("elements in the innerhtml are "  + innerhtml);
   }
driver.quit();   
		
	}

}
