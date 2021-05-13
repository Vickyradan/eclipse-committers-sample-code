package keyworddriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeyword {
	static WebDriver driver;
	
	public static void openbrowser() {
		
		System.setProperty("webdriver.chrome.driver","E://chrome Driver//chromeDriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	public static void navigate()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	public static void enterusername()
	{
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		
	}
	public static void enterpassword()
	{
		
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	}
	public static void clicklogin()
	{
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}
	

	public static void closebrowser() {
		
		driver.close();
	}


}
