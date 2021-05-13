package Task1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TaskParallel {
	
	@Test(priority=1)
	
	public void AdminAddUser()
	{
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
			
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("systemUser_userType")).click();
		driver.findElement(By.xpath("//*[@id='systemUser_userType']/option[1]")).click();
		driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys("Alice Duval");
		driver.findElement(By.id("systemUser_userName")).sendKeys("tharma");
		driver.findElement(By.name("systemUser[status]")).click();
		driver.findElement(By.xpath("//*[@id='systemUser_status']/option[2]")).click();
		driver.findElement(By.name("systemUser[password]")).sendKeys("Admin@1234");
		driver.findElement(By.name("systemUser[confirmPassword]")).sendKeys("Admin@1234");
		driver.navigate().back();
		

	}
	@Test(priority=2)
	public void AdminSearchUser()
	{

		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement box =wait.until(ExpectedConditions.elementToBeClickable(By.id("searchSystemUser_userName")));
		box.sendKeys("Aaliyah.Haq");
		
		driver.findElement(By.id("searchSystemUser_userType")).click();
		driver.findElement(By.xpath("//*[@id='searchSystemUser_userType']/option[3]")).click();
		driver.findElement(By.name("searchSystemUser[employeeName][empName]")).sendKeys("Aaliyah Haq");
		driver.findElement(By.id("searchSystemUser_status")).click();
		driver.findElement(By.xpath("//*[@id='searchSystemUser_status']/option[2]")).click();
		driver.findElement(By.id("searchBtn")).click();
		
}
}