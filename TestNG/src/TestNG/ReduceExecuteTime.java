package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReduceExecuteTime {
	WebDriver driver;
	long StartTime;
	long EndTime;
	
	
	@BeforeTest
	public void OpenBrowser(){
		
		StartTime =System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","E://chrome Driver//chromeDriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void CloseBrowser(){
		driver.close();
		EndTime= System.currentTimeMillis();
		long TotalTime = EndTime-StartTime;
		System.out.println(TotalTime);
	}


	@Test
	public void OpenGoogle()
	{
		driver.get("https://www.google.com/");
	}

	@Test
	public void OpenBing()
	{
		driver.get("https://www.bing.com/");
	}

	@Test
	public void OpenYahoo()
	{
		driver.get("https://www.Yahoo.com/");
	}

}
