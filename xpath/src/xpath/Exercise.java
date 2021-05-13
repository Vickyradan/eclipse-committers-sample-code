package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exercise {
	
	WebDriver driver;
	@BeforeTest
	
	public void OpenBrowser(){
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("https://www.amazon.in/ref=nav_logo");
	}
	
	@Test
	
	public void SearchWatches(){
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='searchDropdownBox']")).click();
		WebElement watches=driver.findElement(By.xpath("//option[text()='Watches']"));
		watches.click();
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']")).click();
		//click departments watches
		WebElement mens=driver.findElement(By.xpath("//span[starts-with(text(),'Men')]"));
		mens.click();
		WebElement WristWatches=driver.findElement(By.xpath("//span[contains(text(),'Wrist Watches')]"));
		WristWatches.click();
		
		// avg.customer reviews
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']/ancestor::li")).click();
		
		// Select Brand 
		// Fastrack
		driver.findElement(By.xpath("//*[@id='p_89/Fastrack']/span/a/div")).click();		
		String text =driver.findElement(By.xpath("//*[@id='p_89/Fastrack']/span/a/div")).getText();
		System.out.println(text);
		// Select price range
		
		driver.findElement(By.xpath("//span[contains(text(),'Under ₹2,000')]")).click();
		// Pay On Delivery
		
		driver.findElement(By.xpath("//*[@id='p_n_is_cod_eligible/4931671031']")).click();
		// Click second fastrack watch
		driver.findElement(By.xpath("//img[contains(@src,'https://m.media-amazon.com/images/I/81A0lKpFUNL._AC_UL320_.jpg')]")).click();
		
		
	}

}
