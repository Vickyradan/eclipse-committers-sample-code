package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PayfeeTestcase {
	
	public static WebElement Clickpayfee(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[2]"));
	}
	
	public static WebElement AdmissionNO(WebDriver driver) {
		
		return driver.findElement(By.id("admission_id"));
		
	
	}

}
