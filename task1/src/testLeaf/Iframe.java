package testLeaf;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://leafground.com/");
		
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[10]")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[@id='Click']")).click();
		
		String value = driver.findElement(By.xpath("//*[@id='Click']")).getText();
		System.out.println(value);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click1")).click();
		
		driver.switchTo().defaultContent();
		
		
		List<WebElement> get =driver.findElements(By.tagName("iframe"));
		int value1 =get.size();
		System.out.println(value1);
		
		

	}

}
