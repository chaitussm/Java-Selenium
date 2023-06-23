package seleniumbasic;

import org.openqa.selenium.chrome.ChromeDriver;

import com.BsicsOfSelenium.Driver;

public class Execute extends Driver{

	public static void main(String[] args) {
		
		manager.chromedriver().setup();
		driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
         
	}

}
