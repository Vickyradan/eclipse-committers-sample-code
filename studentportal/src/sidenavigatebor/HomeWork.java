package sidenavigatebor;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeWork {
	
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
	public void Homework(){
		
		WebElement HomeWork = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[4]"));
		HomeWork.click();
		
        @SuppressWarnings("unused")
		String Mainwindows = driver.getWindowHandle();
		
		WebElement Recordprint = driver.findElement(By.name("Submit"));
		Recordprint.click();
		
		Set<String> handle = driver.getWindowHandles();
		
		for (String Childwindow : handle) {
			
			driver.switchTo().window(Childwindow);
		}
		
		WebElement ColsePrintpage = driver.findElement(By.id("closebutton"));
		ColsePrintpage.click();
		
		
	}
	
	
	
	@AfterTest()
	public void Closebrowser(){
		driver.quit();
	}

}
