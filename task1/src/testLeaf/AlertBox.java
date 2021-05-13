package testLeaf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://leafground.com/");
		
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[9]")).click();
		
		WebElement alert1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		alert1.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button")).click();
		
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		
		driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button")).click();
		
		Alert alert3 =driver.switchTo().alert();
		alert3.sendKeys("Vicky");
		alert3.accept();
		

	}

}
