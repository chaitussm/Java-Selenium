package module3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.internal.Utils;



public class TakeScreenShot {
	
	@Test
	
	public void screenshot() throws IOException{
		
     System.setProperty("webdriver.chrome.driver", "D:\\Drivers For Selenium\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://learn-automation.com/");
	 driver.manage().window().maximize();
	 
	 //Type cast Takescreenshot interface
	 
	 TakesScreenshot src = (TakesScreenshot)driver;
	 
	 File Srcfile = src.getScreenshotAs(OutputType.FILE);
	
	 //Set the file path
	 File DestFile = new File("C:\\Screeshots\\test.png");
	 
	 FileUtils.copyFile(Srcfile, DestFile);
		
	}

}
