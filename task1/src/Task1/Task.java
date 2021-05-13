package Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task {
	WebDriver driver;
	@BeforeTest
	
	public void OpenBrowser(){
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
	@Test(priority=1)
	public void SignIn()
	{
		driver.navigate().refresh();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
	
	
	}
	@Test(dependsOnMethods="SignIn")
	
	public void AdminAddUser()
	{
		
		driver.navigate().forward();
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("systemUser_userType")).click();
		driver.findElement(By.xpath("//*[@id='systemUser_userType']/option[1]")).click();
		driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys("Alice Duval");
		driver.findElement(By.id("systemUser_userName")).sendKeys("tharma");
		driver.findElement(By.name("systemUser[status]")).click();
		driver.findElement(By.xpath("//*[@id='systemUser_status']/option[2]")).click();
		driver.findElement(By.name("systemUser[password]")).sendKeys("Admin@1234");
		driver.findElement(By.name("systemUser[confirmPassword]")).sendKeys("Admin@1234");	
		
	}
	@Test(priority=2)
	
	public void AdminSearchUser()
	{
		driver.navigate().forward();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Aaliyah.Haq");
		driver.findElement(By.id("searchSystemUser_userType")).click();
		driver.findElement(By.xpath("//*[@id='searchSystemUser_userType']/option[3]")).click();
		driver.findElement(By.name("searchSystemUser[employeeName][empName]")).sendKeys("Aaliyah Haq");
		driver.findElement(By.id("searchSystemUser_status")).click();
		driver.findElement(By.xpath("//*[@id='searchSystemUser_status']/option[2]")).click();
		driver.findElement(By.id("searchBtn")).click();
		
	}
	@AfterTest

	public void CloseBrowser(){
		
		driver.quit();
	}
	
	

}
