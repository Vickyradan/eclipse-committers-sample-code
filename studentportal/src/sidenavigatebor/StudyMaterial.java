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

public class StudyMaterial {
	
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
	public void Tutorial(){
		
		WebElement Studymaterial = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[11]"));
		Studymaterial.click();
		
		WebElement Tutorial = driver.findElement(By.xpath("//*[@id='homeSubmenu2']/li[1]"));
		Tutorial.click();
		
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
	}
	
	
	@Test(dependsOnMethods="Tutorial")	
	public void Booklet(){
		
		WebElement Studymaterial1 = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[11]"));
		Studymaterial1.click();
		
		WebElement ViewBooklet = driver.findElement(By.xpath("//*[@id='homeSubmenu2']/li[2]"));
		ViewBooklet.click();
		
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
	}
	
	@AfterTest()
	public void Closebrowser(){
		driver.quit();
	}


}
