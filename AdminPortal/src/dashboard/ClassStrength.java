package dashboard;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassStrength {
	
WebDriver driver;
	
	@BeforeTest()
	public void OpenPortal(){
	
	System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromedriver_win32//chromeDriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.navigate().to("http://edufintech.co/school-erp/");
	}
	
	@Test(priority=1)
	public void SignIn() {
		
		WebElement Enterusername = driver.findElement(By.id("username"));
		Enterusername.sendKeys("admin");
		
		WebElement Enterpassword = driver.findElement(By.id("password"));
		Enterpassword.sendKeys("superadmin ");
		
		WebElement Clicklogin = driver.findElement(By.name("Login"));
		Clicklogin.click();

	}
	
	@Test(priority=2)
	public void DashBoard(){
		
		WebElement IBTsidebar = driver.findElement(By.xpath("//*[@id='sidebarCollapse']/i"));
		IBTsidebar.click();
		
		WebElement Dashboard = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[1]"));
		Dashboard.click();	
		
		//Click Class strength Report
		Select selectclass = new Select(driver.findElement(By.name("class_id")));
		selectclass.selectByVisibleText("LKG-VARAQA");
		
		WebElement Clicksumbit = driver.findElement(By.name("class_submit"));
		Clicksumbit.click();
		
		// Click action view student all details
		
		String Mainwindow = driver.getWindowHandle();
		
		WebElement Clickaction = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/table/tbody/tr[1]/th[5]/a/i"));
		Clickaction.click();
		
		Set<String> handle = driver.getWindowHandles();
		
		for (String Childwindow : handle) {
			driver.switchTo().window(Childwindow);
		}
		driver.close();
		driver.switchTo().window(Mainwindow);
		driver.navigate().back();
	}
	

}
