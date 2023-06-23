package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Errormsg {
	
	@Test
	
	public void Error() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?#identifier");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		Thread.sleep(2000);
		String actaul_error = driver.findElement(By.xpath("//*[@id='errormsg_0_Email']")).getText();
		String expected_error = "Enter an email or phone number.";
		Assert.assertEquals(actaul_error, expected_error);
	}

}
