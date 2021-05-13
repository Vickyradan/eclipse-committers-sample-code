package usingPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
	
	@Test
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver","E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://edufintech.co/school-erp/index.php");
		
		PageFactory.initElements(driver, LoginTestcase.class);
		
		LoginTestcase.username.sendKeys("admin");
		LoginTestcase.password.sendKeys("superadmin");
		LoginTestcase.submit.click();
		
		
		
	}

}
