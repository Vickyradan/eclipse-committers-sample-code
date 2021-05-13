package sidenavigatebor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LeaveDetails {
	
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
	
	public void SendleaveRequest(){
		

		WebElement LeaveDetails = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[22]"));
		LeaveDetails.click();
		
		WebElement Requestleave = driver.findElement(By.xpath("//*[@id='pageSubmenu7']/li[1]"));
		Requestleave.click();
		
		WebElement fromdate = driver.findElement(By.id("datefrom"));
		fromdate.sendKeys("01/03/2021"+Keys.ENTER);
		
		WebElement Todate = driver.findElement(By.id("dateto"));
		Todate.sendKeys("03/03/2021"+Keys.ENTER);
		
		WebElement Reason = driver.findElement(By.name("message"));
		Reason.sendKeys("Head ache");
		
		WebElement Submit = driver.findElement(By.name("Submit"));
		Submit.click();
				
	}
	
	@Test(priority=3)
	public void LeaveList(){
		
		WebElement LeaveDetails = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[22]"));
		LeaveDetails.click();
		
		WebElement Leavelist = driver.findElement(By.xpath("//*[@id='pageSubmenu7']/li[2]"));
		Leavelist.click();
		
		
	}

}
