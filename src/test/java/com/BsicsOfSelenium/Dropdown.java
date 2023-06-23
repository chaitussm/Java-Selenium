package com.BsicsOfSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div/a[contains(text(), 'Create new account')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sundar");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("eshwar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("eshwar@yahoo.in");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("eshwar@yahoo.in");
		driver.findElement(By.id("password_step_input")).sendKeys("123Welcome");
		Select day = new Select(driver.findElement(By.xpath("//Select[@id='day']")));
		day.selectByValue("1");
		List<WebElement>day_list = day.getOptions();
		int day_size = day_list.size();
		System.out.println("size of  the day list is " + day_size);
		for(WebElement ele:day_list){
			String Day_list = ele.getText();
			System.out.println("the days in the list are " + Day_list);
			
		}
		
		
		Select month = new Select(driver.findElement(By.xpath("//Select[@id='month']")));
		month.selectByVisibleText("Mar");
		List<WebElement>month_list = month.getOptions();
		int month_size = month_list.size();
		System.out.println("size of the month list is " + month_size);
		for(WebElement ele: month_list){
			String Month_list = ele.getText();
			System.out.println("name of the month in the list is " + Month_list);
			
		}	
		Select year = new Select(driver.findElement(By.xpath("//Select[@id ='year']")));	
		year.selectByVisibleText("2005");
		List<WebElement>year_list = year.getOptions();
		int year_size = year_list.size();
		System.out.println("size of the year list is " + year_size);
		for(WebElement ele:year_list){
			
			String Year_list = ele.getText();
			System.out.println("year in the list is " + Year_list);
			
		}
			
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		//driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		}
		
		
		
		
		
	}

