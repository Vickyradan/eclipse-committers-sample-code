package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/");

		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[20]/a/h5")).click();

		String ToolTip= driver.findElement(By.id("age")).getAttribute("title");

		System.out.println(ToolTip);
		
	}

}
