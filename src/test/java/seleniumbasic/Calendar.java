package seleniumbasic;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class Calendar {

		public static void main(String[] args) throws InterruptedException 
		{
			
			System.setProperty("webdriver.chrome.driver", "C:/Users/Surya/Downloads/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://www.redbus.in/");
			Thread.sleep(3000);
			
			driver.findElement(By.id("onward_cal")).click();
						
			List<WebElement> allDates=driver.findElements(By.xpath("//div[@class='rb-calendar']//td"));
			
			for(WebElement ele:allDates)
			{
				
				String date=ele.getText();
				
				if(date.equalsIgnoreCase("28"))
				{
					ele.click();
					break;
				}
				
			}
			
			
		}

	}