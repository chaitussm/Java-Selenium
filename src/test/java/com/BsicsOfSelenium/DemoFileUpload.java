package com.BsicsOfSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFileUpload {

 public static void main(String[] args) throws Exception {

// This will open Firefox browser
WebDriver driver=new FirefoxDriver();
// This will maximize browser to full screen
driver.manage().window().maximize();
// This will open respective URL
driver.get("your application url");

// This will click on Upload button
driver.findElement(By.xpath("//*[@type='file']")).click();

// This will invoke AutoIT script here give the path of the script 
//and this will throw IO exception so u can use throw or try catch
// In my case I am using throws

Runtime.getRuntime().exec("H:\\Selenium\\AutoIT\\FileUpload.exe");

// Once you will run this program AutoIt script will be invoked and respective f//ile will be attached

 }
 
}



