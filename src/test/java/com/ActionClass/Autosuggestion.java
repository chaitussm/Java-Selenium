package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestion {

public static void main(String[] args) throws InterruptedException {

WebDriver driver=new FirefoxDriver();

driver.manage().window().maximize();

driver.get("http://www.naukri.com");

// Type something on Skill textbox
driver.findElement(By.id("qp")).sendKeys("test");

// Create object on Actions class
Actions builder=new Actions(driver);

// find the element which we want to Select from auto suggestion
WebElement ele=driver.findElement(By.xpath(".//*[@id='autosuggest']/ul/li[2]/a"));

// use Mouse hover action for that element
builder.moveToElement(ele).build().perform();

// Give wait for 2 seconds 
Thread.sleep(2000);

// finally click on that element
builder.click(ele).build().perform();
}


}
