package suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class New {
	
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver","E://chrome Driver//chromeDriver.exe");
		 driver = new ChromeDriver();
	}

	@Test
	public void Google() {
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void Bing() {
		driver.get("https://www.bing.com/");
	}
	
	@Test
	public void Yahoo() {
		driver.get("https://www.Yahoo.com/");
	}
	
	@AfterTest
	public void Closebrowser() {
		
		driver.close();
	}
}
