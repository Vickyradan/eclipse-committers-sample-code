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

public class Fee {
	
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
	public void ViewfeeDtails() throws InterruptedException{
		
		WebElement Fee = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[6]"));
		Fee.click();
		
		WebElement Viewfeedetail = driver.findElement(By.xpath("//*[@id='homeSubmenuf']/li[1]"));
		Viewfeedetail.click();
		
		String Mainwindow = driver.getWindowHandle();
		
		WebElement lookforLoan = driver.findElement(By.xpath("//button[@class='mr-5 btn-sm btn btn-primary']"));
		lookforLoan.click();
		
		Set<String> handle = driver.getWindowHandles();
		
		for (String ChildWindow : handle) {
			
			driver.switchTo().window(ChildWindow);
		}
		
		driver.close();
		
		driver.switchTo().window(Mainwindow);
	}
	
	@Test(priority=3)
	public void Paynow(){
		// Click pay now
		
		WebElement Paynow = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		Paynow.click();
		
		WebElement procced =driver.findElement(By.id("proceed"));
		procced.click();
		
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=4)
	public void Printfee(){
		
		String MainWindow = driver.getWindowHandle();
	
		WebElement Printfee = driver.findElement(By.id("printfeedet_t"));
		Printfee.click();
		
		Set<String> handle1 = driver.getWindowHandles();
		
		for (String childWindow : handle1) {
			driver.switchTo().window(childWindow);
		}
		
		WebElement closewindow = driver.findElement(By.id("closebutton"));
		closewindow.click();
		
		driver.switchTo().window(MainWindow);

		
	}
	
	@Test(priority=5)
	public void Viewmiscfine(){
		
		WebElement Fee = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[6]"));
		Fee.click();
		
		WebElement Viewmiscfine = driver.findElement(By.xpath("//*[@id='homeSubmenuf']/li[2]"));
		Viewmiscfine.click();
		
	}
	
	
	
	@AfterTest()
	public void Closebrowser(){
		driver.quit();
	}

}
