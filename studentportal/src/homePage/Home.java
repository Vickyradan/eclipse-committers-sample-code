package homePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Home {
	
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
	public void Homepagecontainer(){
		
	    
		WebElement IBTsidebar = driver.findElement(By.xpath("//*[@id='sidebarCollapse']/i"));
		IBTsidebar.click();
		
		WebElement profilenavi = driver.findElement(By.id("navbarDropdown2"));
		profilenavi.click();
		
		WebElement Clickmyprofile = driver.findElement(By.xpath("//*[@id='content']/nav/div/ul/li/div/a[1]"));
		Clickmyprofile.click();	
		
		WebElement profilenavi1 = driver.findElement(By.id("navbarDropdown2"));
		profilenavi1.click();
		
		WebElement Changepass = driver.findElement(By.xpath("//*[@id='content']/nav/div/ul/li/div/a[3]/h4/i"));
		Changepass.click();
		
		WebElement profilenavi2 = driver.findElement(By.id("navbarDropdown2"));
		profilenavi2.click();
		
		WebElement Logout = driver.findElement(By.xpath("//*[@id='content']/nav/div/ul/li/div/a[4]/b/i"));
		Logout.click();
		
		
	}
	
	
	
}
