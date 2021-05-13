package pageFactorywithoutfindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	// (username is webelement variable
	// username is not a method name
	public static WebElement username;
	public static WebElement password;
	public static WebElement Login;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://edufintech.co/school-erp/index.php");
		
		PageFactory.initElements(driver, LoginPage.class);
		username.sendKeys("admin");
		password.sendKeys("superadmin");
		Login.click();

	}

}
