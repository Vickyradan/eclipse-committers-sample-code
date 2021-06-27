package commonFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	@FindBy(xpath="//*[@id='navbarSupportedContent']/ul/li[5]")
	public static WebElement ClickLogin;
	
	@FindBy(id="mobile")
	public static WebElement Moblie;
	
	@FindBy(id="email")
	public static WebElement email;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/form/input")
	public static WebElement Submit;
	

}
