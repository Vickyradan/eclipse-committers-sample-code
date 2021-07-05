package suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchEngine {
	
	WebDriver driver;
		@BeforeTest
		
		public void Chrome()
		{
			System.setProperty("webdriver.chrome.driver","E://chrome Driver//chromeDriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		@Test(enabled=false, priority=1)
		
		public void OpenGoogle()
		{
			driver.get("https://www.google.com/");
		}
		
		@Test(enabled=true)
		
		public void OpenBing()
		{
			driver.get("https://www.bing.com/");
		}
		
		@Test(dependsOnMethods="OpenBing")
		
		public void OpenYahoo()
		{
			driver.get("https://www.Yahoo.com/");
		}
	@AfterTest
	
	public void CloseBrowser()
	{
		driver.quit();
	}
		

}
