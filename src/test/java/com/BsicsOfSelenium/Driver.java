package com.BsicsOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BrowserCapabilities.Scripts.ChromeCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver
{
	public static WebDriver driver;
    public static WebDriverManager manager;
	public static void main(String[] args) {
		 
		manager.chromedriver().setup();		
	    driver = new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=DFSFWqG5HYjD4AKPkpr4BA");
		driver.manage().window().maximize();
		

		
	
	}
	
}
