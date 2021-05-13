package chrome;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/");
		
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[15]/a/h5")).click();
		
		List<WebElement> select = driver.findElements(By.xpath("//*[@id='selectable']/li"));
		
		// Method 1
		
//		Actions action = new Actions(driver);
//		action.keyDown(Keys.CONTROL);
//		action.click(select.get(0));
//		action.click(select.get(1));
//		action.release();
//		action.build().perform();
		
		// Methord 2
		
		Actions action = new Actions(driver);
		action.clickAndHold(select.get(0));
		action.clickAndHold(select.get(1));
		action.release();
		action.build().perform();
		
		System.out.println("success");
		
		
		

	}

}
