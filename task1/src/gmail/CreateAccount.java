package gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromedriver_win32//chromeDriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.navigate().to("https://accounts.google.com/AddSession/identifier?hl=en&flowName=GlifWebSignIn&flowEntry=AddSession");
	    // Login page
	    
	    WebElement CreateAccount = driver.findElement(By.xpath("//span[contains(text(),'Create account')]"));
	    CreateAccount.click();
	    
	    driver.findElement(By.xpath("//*[@id='initialView']/div[2]/div[2]/div/div")).click();
		   
	    WebElement Myself = driver.findElement(By.xpath("//*[@id='initialView']/div[2]/div[2]/div/div/span[1]"));
	    Myself.sendKeys("For myself"+Keys.ARROW_DOWN);    
	   
	    //Create Account Page
	    
	    WebElement FirstName = driver.findElement(By.id("firstName"));
	    FirstName.sendKeys("qwert");
	    
	    WebElement LastName = driver.findElement(By.id("lastName"));
	    LastName.sendKeys("yuiop");
	    
	    WebElement Username = driver.findElement(By.id("username"));
	    Username.sendKeys("qwertyuiop3");
	    
	    WebElement Password = driver.findElement(By.name("Passwd"));
	    Password.sendKeys("zaq1234@");
	    
	    WebElement ConfirmPassword = driver.findElement(By.name("ConfirmPasswd"));
	    ConfirmPassword.sendKeys("zaq1234@");
	    
	    WebElement Checkbox = driver.findElement(By.xpath("//input[@class='VfPpkd-muHVFf-bMcfAe']"));
	    Checkbox.click();
	    
	    driver.findElement(By.xpath("//li[@class='oMzjQd']")).click();
	   
	    WebElement Next = driver.findElement(By.id("accountDetailsNext"));
	    Next.click();
	    
	    driver.findElement(By.id("phoneNumberId")).sendKeys("9458226262");
	    
	    WebElement Back =driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[2]/div/div[2]/div/div/button/div/following::div"));
	    Back.click();
	    
	    

	    



	}

}
