package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com");
		
		
		driver.findElement( By.xpath("//*[@id='w3loginbtn']")).click();
		driver.findElement(By.xpath("//*[@id='loginform']/div[2]/input")).sendKeys("tvignesh313@gmail.com");
		driver.findElement(By.name("p")).sendKeys("Krishna@06");
		driver.findElement( By.xpath("//*[@id='login_submit_button']")).click();
		driver.quit();
		
		System.out.println("successfull");

			
	


	}

}
