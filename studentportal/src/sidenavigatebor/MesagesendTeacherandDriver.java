package sidenavigatebor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MesagesendTeacherandDriver {
	
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
	
	public void MessagesendTeacher(){
		
		WebElement Messagesentteacher = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[15]"));
		Messagesentteacher.click();
		
		WebElement Messagecontent = driver.findElement(By.name("message"));
		Messagecontent.sendKeys("Check Message");
		
		WebElement ClickSend = driver.findElement(By.name("student_message"));
		ClickSend.click();
			
	}
	
	@Test(enabled=false)
	public void MessagesentDriver(){
		
		WebElement Messagesentdriver = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[16]"));
		Messagesentdriver.click();
		
		
		
		WebElement EnterDriverid1 = driver.findElement(By.name("//*[@id='content']/div[1]/form/div[1]/div[2]/input[2]"));
		EnterDriverid1.click();
		
		WebElement Messagecontent = driver.findElement(By.name("message"));
		Messagecontent.sendKeys("Check Message");
		
		WebElement ClickSend = driver.findElement(By.name("msg_to_driver"));
		ClickSend.click();
		
		
	}
	
	@AfterTest()
	public void Closebrowser(){
		driver.quit();
	}

}
