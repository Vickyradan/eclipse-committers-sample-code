package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/");
		
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[14]/a/h5")).click();
		
		WebElement From = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement To = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(From);
		action.moveToElement(To);
		action.release(To);
		action.build().perform();
		
		System.out.println("success");

	}

}
