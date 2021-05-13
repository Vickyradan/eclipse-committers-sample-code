package testLeaf;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://leafground.com/");
		
		
		WebElement Clickdropdown = driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[5]"));
		Clickdropdown.click();
		
	    Select dropdown1 = new Select(driver.findElement(By.id("dropdown1")));
	    dropdown1.selectByIndex(3);
	    
	    Select dropdown2 = new Select(driver.findElement(By.name("dropdown2")));
	    dropdown2.selectByVisibleText("Loadrunner");
	    
	    
	    WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
	    Select selectdropdown3 = new Select(dropdown3);
	    selectdropdown3.selectByValue("2");
	    
	    Select dropdown4 = new Select(driver.findElement(By.id("dropdown3")));
	    List<WebElement> getoption = dropdown4.getOptions();
	    int get = getoption.size();
	    System.out.println(get);
	    
	    WebElement dropdown5 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
	    Select selectdropdown5 = new Select(dropdown5);
	    selectdropdown5.selectByValue("2");
	    selectdropdown5.selectByValue("3");
	    selectdropdown5.selectByValue("4");
	       

	}

}
