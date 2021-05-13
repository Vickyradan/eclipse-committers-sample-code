package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParveenTravels {
	
	 WebDriver driver;
	 
	 @BeforeTest()
	 
	 public void OpenBrowser(){
		 
		 System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.navigate().to("https://www.parveentravels.com/");
		    driver.findElement(By.xpath("//*[@id='fancybox-container-1']/div[2]/div[2]/button")).click();
		 
	 }
	 
	 @Test()
	 public void From_address(){
		 
		 driver.findElement(By.id("frm_id-selectized")).sendKeys("m");
		 
		 List<WebElement> list = driver.findElements(By.xpath("//*[@id='home-wrapper']/div/div/form/div[1]/div[1]/div[2]/div/div"));
		 
		 System.out.println(list.size());
		 
		 for (WebElement webElement : list) {
			 
			if(webElement.getText().equalsIgnoreCase("madurai")){
			webElement.click();
			break;
		}
		 
		 
	 }

}
	 @Test()
	 public void To_address(){
		 
		 driver.findElement(By.id("to_id-selectized")).sendKeys("k");
		 
		 List<WebElement> list = driver.findElements(By.xpath("//*[@id='home-wrapper']/div/div/form/div[2]/div/div[2]/div/div"));
		 System.out.println(list.size());
		 
		 for (WebElement webElement : list) {
			 
			if(webElement.getText().equalsIgnoreCase("kovilpatti")){
			webElement.click();
			}
		}
		 
	 }
	 
}
