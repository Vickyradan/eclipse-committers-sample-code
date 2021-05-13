package testLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Edit {
	
	@Test()

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/");
		
		// Click Edit button
		
		WebElement Edit = driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]"));
		Edit.click();
		
		WebElement Enter_mail = driver.findElement(By.id("email"));
		Enter_mail.sendKeys("tvignesh313@gmail.com");
				
		WebElement Entertext =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		Entertext.sendKeys("txt"+Keys.TAB);
		
		String getvalue = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(getvalue);
		
		WebElement cleartext = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
		cleartext.clear();
		
		WebElement disabled = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
		Boolean ture = disabled.isEnabled();
		System.out.println(ture);
		

	}

}
