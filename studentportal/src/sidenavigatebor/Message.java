package sidenavigatebor;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Message {
	
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
	
	public void SentMessage(){
		
		WebElement Message = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[14]"));
		Message.click();
		
		WebElement Sendmessage = driver.findElement(By.xpath("//*[@id='pageSubmenu5']/li[2]"));
		Sendmessage.click();
		
		WebElement FromDate = driver.findElement(By.id("dc1"));
		FromDate.sendKeys("01/03/2021"+Keys.ENTER);
		
		WebElement Todate = driver.findElement(By.id("dc2"));
		Todate.sendKeys("17/03/2021"+Keys.ENTER);
		
		WebElement go = driver.findElement(By.xpath("//button[@value='GO']"));
		go.click();
		
        String Mainwindow = driver.getWindowHandle();
		
		WebElement Print = driver.findElement(By.xpath("//button[@value='Print']"));
		Print.click();
		
		Set<String> handle = driver.getWindowHandles();
		
		for (String childWindow : handle) {
			driver.switchTo().window(childWindow);
		}
		
		WebElement Colsewindow = driver.findElement(By.id("closebutton"));
		Colsewindow.click();
		
		driver.switchTo().window(Mainwindow);
		
		WebElement Deiete = driver.findElement(By.xpath("//i[@title='Delete']"));
		Deiete.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();		
		
	}
	
	@Test(priority=3)
	public void composemessage() throws InterruptedException{
		
		WebElement message = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[14]"));
		message.click();
		
		WebElement Composemessage = driver.findElement(By.xpath("//*[@id='pageSubmenu5']/li[3]"));
		Composemessage.click();
		
		WebElement subject = driver.findElement(By.id("subject"));
		subject.sendKeys("paid my payment but not received payment status");
		
		WebElement messagecontent = driver.findElement(By.id("message"));
		messagecontent.sendKeys(" Amount:10000");
		
		WebElement Attachfile = driver.findElement(By.xpath("//button[@value='Attach File']"));
		Attachfile.click();
		
		WebElement choosefile = driver.findElement(By.name("newimage[]"));
		choosefile.sendKeys("C:\\Users\\KAVINESH\\Downloads\\img-01.png");
		
		WebElement Deletefile = driver.findElement(By.xpath("//button[@value='Delete File']"));
		Deletefile.click();
		
		WebElement ClickSend = driver.findElement(By.xpath("//button[@value='Send']"));
		ClickSend.click();
				
	}
	
	@AfterTest()
	public void Closebrowser(){
		driver.quit();
	}
	

}
