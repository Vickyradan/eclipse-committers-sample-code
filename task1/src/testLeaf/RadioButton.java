package testLeaf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://leafground.com/");
		
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[6]")).click();
		
		WebElement checked = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[3]/input"));
		boolean Status1= checked.isSelected();
		System.out.println(Status1);
		
		WebElement unchecked = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[2]/input"));
		boolean Status2 = unchecked.isSelected();
		System.out.println(Status2);
		
		driver.findElement(By.name("age")).click();

	}

}
