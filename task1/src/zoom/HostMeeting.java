package zoom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HostMeeting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromedriver_win32//chromeDriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    driver.navigate().to("https://zoom.us/");
	    
	    WebElement Signin = driver.findElement(By.xpath("//a[contains(text(),'SIGN IN')]"));
	    Signin.click();
	    
	    WebElement Username = driver.findElement(By.id("email"));
	    Username.sendKeys("tvignesh2896@gmail.com");
	    
	    WebElement Password = driver.findElement(By.id("password"));
	    Password.sendKeys("Krishna@06");
	    
	    WebDriverWait wait = new WebDriverWait(driver, 50);
	    WebElement Submit = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"))));
	    Submit.click();
	    
	    
	    driver.navigate().forward();
	   
	    //WebElement Hostmeeting = driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[4]"));
	   // Hostmeeting.click();
	  	    
	    WebElement Videooff = driver.findElement(By.xpath("//a[contains(text(),'With Video Off')]"));
	    Videooff.click();
	    
	  //*[@id="navbar"]/ul[2]/li[4]
	  

	}

}
