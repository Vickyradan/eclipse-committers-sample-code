package verifywordpress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class VerifyWordpress {
	

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Pom pom = new Pom(driver);
		
		pom.lognIn("Admin","admin123");
		
		System.out.println("success");
	}


}
