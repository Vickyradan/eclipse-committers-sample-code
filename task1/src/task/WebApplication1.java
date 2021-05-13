package task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebApplication1 {
	@Test
	 
	public void OrangeHRM(){
		System.setProperty("webdriver.chrome.driver","E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.quit();
	}
	
	@Test
	
	public void W3school(){
		System.setProperty("webdriver.chrome.driver","E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.quit();

	}
	
	@Test
	
	public void GoogleMap(){
		System.setProperty("webdriver.chrome.driver","E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/maps/@13.0429417,80.0896302,15z");
		driver.quit();

		
	}
	

}
