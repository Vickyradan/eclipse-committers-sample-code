package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task1 {
	@Test
	public void ParveenTraveles(){
	System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.navigate().to("https://www.parveentravels.com/");
    driver.findElement(By.xpath("//*[@id='fancybox-container-1']/div[2]/div[2]/button")).click();
    driver.findElement(By.xpath("//input[@id='frm_id-selectized']/parent::div")).click();
    driver.findElement(By.xpath("//div[@data-value='STF1TI93']")).click();
    driver.findElement(By.xpath("//input[@id='to_id-selectized']")).click();
   // driver.findElement(By.xpath("//div[@data-value='STF17D51']")).click();
    
    driver.findElement(By.xpath("//div[@class='to_div']/div/div[2]/div/div[6]")).click();
    
 //   driver.findElement(By.xpath("//*[@id='home-wrapper']/div/div/form/div[2]/div/div[2]/div/div[6]")).click();
  //*[@id="home-wrapper"]/div/div/form/div[2]/div/div[2]/div/div[6]
    
    
    // date picker click each element
//    driver.findElement(By.xpath("//*[@id='home-wrapper']/div/div/form/div[3]")).click();
//    driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/thead/tr[1]/th[2]")).click();
//    driver.findElement(By.xpath("/html/body/div[8]/div[2]/table/thead/tr/th[2]")).click();
//    driver.findElement(By.xpath("/html/body/div[8]/div[3]/table/tbody/tr/td/span[4]")).click();
//    driver.findElement(By.xpath("/html/body/div[8]/div[2]/table/tbody/tr/td/span[4]")).click();
//    driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/tbody/tr[4]/td[4]")).click();
    
	driver.findElement(By.id("srch_date")).sendKeys("27/04/2021"+Keys.ENTER);
    driver.findElement(By.id("return_date")).sendKeys("28/04/2021"+Keys.ENTER);
    
	}

}


// /html/body/div[8]/div[1]/table/thead/tr[1]/th[3]/i

// /html/body/div[8]/div[1]/table/thead/tr[1]/th[3]/i

///html/body/div[8]/div[1]/table/thead/tr[1]/th[3]/i