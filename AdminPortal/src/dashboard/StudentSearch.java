package dashboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StudentSearch {
	
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
	public void ClickStudentsearch(){
		
		 WebElement ClickadmissionNoorRollno = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/div[2]/div/a"));
		 ClickadmissionNoorRollno.click();
		 
		 // Admission number and Student name any one mandatory
		 
		 WebElement EnterAdmisionNo = driver.findElement(By.id("admission_id"));
		 EnterAdmisionNo.sendKeys("596");
			
		 WebElement EnterStudentName = driver.findElement(By.id("pre_name"));
		 EnterStudentName.sendKeys("ABSHARA");
		 
		 WebElement ClickSreach = driver.findElement(By.name("studentadmnsearch"));
		 ClickSreach.click();
		 
		 WebElement Exportfile = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/button"));
		 Exportfile.click();
		 
	}

}
