package chrome;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scroll {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		

		//Scroll down the webpage by 2500 pixels
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("scrollBy(0, 3000)", ""); // Page down
//		js.executeScript("scrollBy(0, -3000)", ""); // page Up
		
		
		
//		WebElement ClickBtton = driver.findElement(By.linkText("About Us"));
//		js.executeScript("arguments[0].scrollIntoView(true);", ClickBtton);

//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("About Us")))).click();
	   
//		Thread.sleep(2000);
//		try{
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)", ""); // Page go to bottom
//		Thread.sleep(2000);
//		js.executeScript("window.scrollTo(0,0)", "");
//		System.out.println("success");
//		}
//		catch(Exception e)
//		{
//			System.out.println("fail");
//		}
		
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		
		
		
		
		

	}

}
