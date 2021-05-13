package sidenavigatebor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KnowledgeBase {
	
	WebDriver driver;
	@BeforeTest()
	public void OpenPortal(){
	
	System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromedriver_win32//chromeDriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.navigate().to("http://edufintech.co/school-erp/student_login.php");
	}
	
	@Test(priority=1)
	public void SignIn() {
		
		WebElement Enterusername = driver.findElement(By.id("username"));
		Enterusername.sendKeys("196003000");
		
		WebElement Enterpassword = driver.findElement(By.id("password"));
		Enterpassword.sendKeys("196003000");
		
		WebElement Clicklogin = driver.findElement(By.name("Login"));
		Clicklogin.click();	
	}
	
	@Test(priority=2)
	public void ClickArticles(){
		
				
		WebElement Knowledgebase = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[18]"));
		Knowledgebase.click();
		
		WebElement Searcharticles = driver.findElement(By.xpath("//*[@id='pageSubmenu6']/li[1]"));
		Searcharticles.click();
		
		WebElement Searchkeyword = driver.findElement(By.id("searchkey"));
		Searchkeyword.sendKeys("comic");
		
		WebElement Selectcategory = driver.findElement(By.id("searchkey"));
		Selectcategory.click();
		
		WebElement Selectoptions = driver.findElement(By.xpath("//*[@id='content']/div[1]/form/div[1]/div[2]/select/option"));
		Selectoptions.click();
		
		WebElement Submit = driver.findElement(By.name("categorySearch"));
		Submit.click();
		
		
		
		
	}

}
