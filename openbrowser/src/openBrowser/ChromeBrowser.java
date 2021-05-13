package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.Chrome.driver", "E://chrome Driver//ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		driver.findElement(By.name("q")).sendKeys("samsung mobiles");
		
		driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();

	}

}