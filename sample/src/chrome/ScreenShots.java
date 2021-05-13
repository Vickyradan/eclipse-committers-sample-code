package chrome;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {


	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromedriver_win32//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("http://leafground.com/");
	    
	    driver.findElement(By.xpath("//h5[contains(text(),'Wait for Alert')]")).click();
	    
	    //Particular page screenshot (Using selenium)
	    TakesScreenshot takescreenshot =(TakesScreenshot) driver;
	    File takescreenshotfile = takescreenshot.getScreenshotAs(OutputType.FILE); 
	    File getscreenshotfile = new File("D://sample.jpg");
//	    FileHandler.copy(takescreenshotfile, getscreenshotfile);  // using FileHandle in selenium
	    FileUtils.copyFile(takescreenshotfile, getscreenshotfile);  // using FileUtils in java
	       
	    driver.findElement(By.xpath("//button[contains(text(),'Click to get Alert')]")).click();
	    
	    Thread.sleep(3000);
	    //Complete  browser with windows page(Using Java)
	    Robot robot = new Robot();
	    Dimension Takescreen=Toolkit.getDefaultToolkit().getScreenSize();
	    Rectangle rectangle = new Rectangle(Takescreen);
	    BufferedImage takescreenfile = robot.createScreenCapture(rectangle);
	    File getscreenfile = new File("D://javasample.jpg");
	    ImageIO.write(takescreenfile,"jpg",getscreenfile);
	    


	}

}
