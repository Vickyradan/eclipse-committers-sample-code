package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTestcase {
	
	public WebElement username(WebDriver driver){
		return driver.findElement(By.id("username"));
	}
	
	public WebElement password(WebDriver driver) {
		return driver.findElement(By.id("password"));
	}
	
	public WebElement submit(WebDriver driver) {
		return driver.findElement(By.name("Login"));
	}

	

}
