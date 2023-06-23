package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Handleframe {
	
	@Test
	public void frametest(){
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Surya\\Desktop\\Myframe.html");
		int total_size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("size of the frames is " +total_size);
		WebElement my_frame = driver.findElement(By.xpath("//iframe[@id = 'Selenium']"));
		driver.switchTo().frame(my_frame);
		driver.findElement(By.xpath(".//*[@id='menu_projects']/a")).click();

		driver.switchTo().frame("guru99");
		driver.findElement(By.xpath("//input[@placeholder='Search your Favorite Course...']")).sendKeys("Selenium");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Click here for Selenium Tutorial')]")).click();

		
		
		
		
	}
}
