package usingPagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginTestcase {
	
	@FindBy(id="username")
	public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(how=How.NAME,using="Login")
	public static WebElement submit;

}
