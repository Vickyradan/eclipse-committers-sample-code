package gmail;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromedriver_win32//chromeDriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.navigate().to("https://accounts.google.com/AddSession/identifier?hl=en&flowName=GlifWebSignIn&flowEntry=AddSession");
	    
	    WebElement Email = driver.findElement(By.id("identifierId"));
	    Email.sendKeys("qy80898@gmail.com");
	    
	    WebElement EmailNext = driver.findElement(By.id("identifierNext"));
	    EmailNext.click();
	    
	    WebElement Password = driver.findElement(By.name("password"));
	    Password.sendKeys("zaq1234@");
	    
	    WebElement Checkbox = driver.findElement(By.xpath("//input[@class='VfPpkd-muHVFf-bMcfAe'][@type='checkbox']"));
	    Checkbox.click();
	    
	    WebElement PassNext = driver.findElement(By.id("passwordNext"));
	    PassNext.click();
	    
	    driver.findElement(By.xpath("//*[@id='gbwa']/div/a")).click();
	    driver.findElement(By.xpath("//*[@id='gbwa']/div/a")).click();
	    driver.switchTo().frame(1);
	    
	    @SuppressWarnings("unused")
		String MainWindow = driver.getWindowHandle();
	    
	    WebElement Gmailhome = driver.findElement(By.xpath("//*[@dir='ltr']/body/div/c-wiz/div/div/c-wiz/div/div/ul[1]/li[7]/a/div[5]/span"));
	    Gmailhome.click();
	    
        Set<String> NewWindows = driver.getWindowHandles();
	    
	    for(String ChildWindow : NewWindows)
	    {
	    	driver.switchTo().window(ChildWindow);
	    }
	     
        driver.findElement(By.xpath("//*[@id=':4u']/div/div[2]")).click();
	}

}
