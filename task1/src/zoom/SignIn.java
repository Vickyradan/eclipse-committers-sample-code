package zoom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromedriver_win32//chromeDriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://zoom.us/");
	    
	    WebElement Signin = driver.findElement(By.xpath("//a[contains(text(),'SIGN IN')]"));
	    Signin.click();
	    
	    WebElement Username = driver.findElement(By.id("email"));
	    Username.sendKeys("tvignesh289@gmail.com");
	    
	    WebElement Password = driver.findElement(By.id("password"));
	    Password.sendKeys("Kishna@06");
	    
	    WebElement Submit = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
	    Submit.click();
	    
	    System.out.println("successful");
	}

}
