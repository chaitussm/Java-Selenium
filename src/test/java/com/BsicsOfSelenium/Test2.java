package com.BsicsOfSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("9535868286");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123");
		driver.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys("laxmi");
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("Bhagavan");
		driver.findElement(By.xpath(".//*[@id='u_0_o']")).sendKeys("9676864623");
		driver.findElement(By.xpath(".//*[@id='u_0_v']")).sendKeys("amma143@");
		Select day = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		day.selectByVisibleText("22");
		List<WebElement>day_list = day.getOptions();
		int day_size= day_list.size();
		System.out.println("size of the daylist is " + day_size);
		for(WebElement ele:day_list){
			String days = ele.getText();
			System.out.println("days in the list are " + days);
		}
		Select month = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		month.selectByVisibleText("Aug");
		List<WebElement>month_list = month.getOptions();
		int month_size= day_list.size();
		System.out.println("size of the daylist is " + month_size);
		for(WebElement ele:month_list){
			String months = ele.getText();
			System.out.println("months in the list are " + months);
		}
		
		
		
		Select year = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		year.selectByVisibleText("1975");
		List<WebElement>year_list = year.getOptions();
		int year_size= day_list.size();
		System.out.println("size of the daylist is " + year_size);
		for(WebElement ele:year_list){
			String years = ele.getText();
			System.out.println("years in the list are " + years);
		}
		
		driver.quit();
	}

}
