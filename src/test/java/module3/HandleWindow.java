package module3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindow {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println("parent window is " + parent);
		driver.findElement(By.xpath(".//*[@id='ch_trip']/span[3]")).click();
		Set<String>allwindows = driver.getWindowHandles();
		int windowsize = allwindows.size();
		System.out.println("Size of the window list is " + windowsize);
		
	}

}
