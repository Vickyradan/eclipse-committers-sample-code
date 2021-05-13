package task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebApplication {
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser(){
		
		System.setProperty("webdriver.chrome.driver","E://chrome Driver//chromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}	
	@Test(enabled=false) 
	public void OrangeHRM(){
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(enabled=true)
	public void W3school(){
		driver.get("https://www.w3schools.com/");
	}
	
	@Test(dependsOnMethods="W3school")
	public void GoogleMap(){
		driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_default");
		
	}
	
	@AfterTest
	public void closeBrowser(){
    	driver.quit();
	}
	

}
