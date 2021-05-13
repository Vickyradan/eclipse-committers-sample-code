package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetExecuteTime {
	
	
	@Test()
	
	public void OpenGoogle()
	{
		long StartTime =System.currentTimeMillis();
		
		System.setProperty("webdriver.chrome.driver","E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
		
		long EndTime =System.currentTimeMillis();
		long TotalTime = EndTime-StartTime;
		System.out.println(TotalTime);
	}
	
	@Test()
	
	public void OpenBing()
	{
		long StartTime =System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.close();
		
		long EndTime =System.currentTimeMillis();
		long TotalTime = EndTime-StartTime;
		System.out.println(TotalTime);
	}
	
	@Test()
	
	public void OpenYahoo()
	{
		long StartTime =System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Yahoo.com/");
		driver.close();
		
		long EndTime =System.currentTimeMillis();
		long TotalTime = EndTime-StartTime;
		System.out.println(TotalTime);
	}

}
