package sidenavigatebor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Attendance {
	
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
		public void AttendanceDetails(){
			
			WebElement Attendance = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[3]/a[1]"));
			Attendance.click();
			
			WebElement Fromdate = driver.findElement(By.id("dc1"));
			Fromdate.sendKeys("01/03/2021"+Keys.ENTER);
			
			WebElement Todate = driver.findElement(By.id("dc2"));
			Todate.sendKeys("18/03/2021"+Keys.ENTER);
			
			WebElement Submit = driver.findElement(By.name("class_student_report_submit"));
			Submit.click();
		}
	
	

		
		@AfterTest()
		public void Closebrowser(){
			driver.close();
		}
}
