package homePage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HideValue {
	
	 WebDriver driver;
		
		@BeforeTest()
		public void OpenPortal(){
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromedriver_win32//chromeDriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.navigate().to("http://edufintech.co/school-erp/student_login.php");
		}
		
		@Test(priority=1)
		public void SignIn() {
			
			WebElement Enterusername = driver.findElement(By.id("username"));
			Enterusername.sendKeys("196003000");
			
			WebElement Enterpassword = driver.findElement(By.id("password"));
			Enterpassword.sendKeys("196003000");
			
			WebElement Clicklogin = driver.findElement(By.name("Login"));
			Clicklogin.click();	
		}
		
		@Test(priority=2)	
		public void SideBar() throws IOException{
			
			WebElement Attendance = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[3]/a[1]"));
			Attendance.click();
			
			WebElement Dashboard = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[1]"));
			Dashboard.click();
			
			WebElement Fee = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[6]"));
			Fee.click();
			
			WebElement Fee1 = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[6]"));
			Fee1.click();
			
			WebElement Examination = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[7]"));
			Examination.click();
			
			WebElement Examination1 = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[7]"));
			Examination1.click();
			
			
			JavascriptExecutor scroll = (JavascriptExecutor) driver;
			scroll.executeScript("scrollBy(0, 200)");
			
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File setfile=screenshot.getScreenshotAs(OutputType.FILE);
			File getfile= new File("D://Error.jpe");
			FileHandler.copy(setfile, getfile);
			
		}

}
