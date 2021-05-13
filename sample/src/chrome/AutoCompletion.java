package chrome;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leafground.com/");
		
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[17]/a/h5")).click();
		
		driver.findElement(By.id("tags")).sendKeys("R");
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		
		/*String Listtext =  ((WebElement) driver.findElements(By.xpath("//*[@id='ui-id-1']/li"))).getText();
		
		System.out.println(Listtext);*/
		
		System.out.println(list.size());
		
		for (WebElement webElement : list) {
			
		if(	webElement.getText().equals("Web Services")){
			webElement.click();	
			break;
		}
			
		}
		
		
		

	}

}
