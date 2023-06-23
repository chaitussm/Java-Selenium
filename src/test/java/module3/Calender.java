package module3;



	
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

	public class Calender {

		@Test
		public void ViewCaendar() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers For Selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		Thread.sleep(3000);
		List<WebElement>datelist = driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table//td"));
		int datesize = datelist.size();
		System.out.println("size of the list is " + datesize);
		for(WebElement ele:datelist)
		{
			
			String date = ele.getText();
			if(date.equalsIgnoreCase("28")){
				ele.click();
				break;
			}
		}		
		
		
}
		
}