package seleniumbasic;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlePopup {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Surya/Downloads/chromedriver.exe");

                // Create object of HashMap Class
		Map<String, Object> prefs = new HashMap<String, Object>();
              
                // Set the notification setting it will override the default setting
		prefs.put("profile.default_content_setting_values.notifications", 2);
		

                // Create object of ChromeOption class
		ChromeOptions options = new ChromeOptions();

                // Set the experimental option
		options.setExperimentalOption("prefs", prefs);

                // pass the options object in Chrome driver

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("9535868286");
		driver.findElement(By.id("pass")).sendKeys("undisputed");
		driver.findElement(By.id("loginbutton")).click();
		
		
	}

}