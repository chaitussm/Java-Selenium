package module3;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	public class Handlingframe {
		
		@Test
		public void frametesting(){
			
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("C:\\Users\\Surya\\Desktop\\Myframe.html");
			int total_size = driver.findElements(By.tagName("iframe")).size();
			System.out.println("size of the frames is " +total_size);
			WebElement my_frame = driver.findElement(By.xpath("//iframe[@id = 'Selenium']"));
			driver.switchTo().frame(my_frame);
			driver.findElement(By.xpath(".//*[@id='menu_projects']/a")).click();

			

}
}