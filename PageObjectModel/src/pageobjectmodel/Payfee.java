package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Payfee {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://edufintech.co/school-erp/index.php");
		
		LoginTestcase loginTestcase = new LoginTestcase();
		loginTestcase.username(driver).sendKeys("admin");
		loginTestcase.password(driver).sendKeys("superadmin");
		loginTestcase.submit(driver).click();
		
		PayfeeTestcase.Clickpayfee(driver).click();
		Thread.sleep(3000);
		PayfeeTestcase.AdmissionNO(driver).sendKeys("1335555yh");

	}

}
