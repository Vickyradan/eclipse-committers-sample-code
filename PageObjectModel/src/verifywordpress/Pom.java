package verifywordpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pom {
	
WebDriver driver;
	
	By Username = By.name("txtUsername");
	By Password = By.name("txtPassword");
	By LogIn = By.name("Submit");
public Pom(WebDriver driver)
{
	this.driver=driver;
}
public void lognIn(String userid,String password )
{
	
	driver.findElement(Username).sendKeys(userid);
	driver.findElement(Password).sendKeys(password);
	driver.findElement(LogIn).click();
}

}
