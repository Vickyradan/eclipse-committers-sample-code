package testLeaf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://leafground.com/");
		
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[7]")).click();
		
		
		WebElement NotSelected = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[1]/input"));
		boolean  Status1 = NotSelected.isSelected();
		System.out.println(Status1);
		
		if (NotSelected.isSelected()){
			NotSelected.click();
		}
		
		WebElement IAmSelected = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[2]/input"));
		boolean  Status2 = IAmSelected.isSelected();
		System.out.println(Status2);
		
		if (IAmSelected.isSelected()){
			IAmSelected.click();
		}
		
		

	}

}
