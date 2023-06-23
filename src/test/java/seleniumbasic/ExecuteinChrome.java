package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteinChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Surya/Downloads/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.quit();
	}

}
