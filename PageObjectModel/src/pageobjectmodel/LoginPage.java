package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://edufintech.co/school-erp/index.php");
		
		LoginTestcase loginTestcase = new LoginTestcase();
		loginTestcase.username(driver).sendKeys("admin");
		loginTestcase.password(driver).sendKeys("superadmin");
		loginTestcase.submit(driver).click();

	}

}
