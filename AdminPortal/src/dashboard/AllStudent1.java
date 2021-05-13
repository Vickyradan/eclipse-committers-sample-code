package dashboard;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllStudent1 {
	
//  Go to Student record  // only Click View, Attendance, Fee, Delete and issueTC
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
	public void StudentRecord(){
		
		WebElement ClickAllstudent = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/div[1]/div[1]/a"));
		ClickAllstudent.click();
		
		// go to student record page
		
		Select selectacadamicyear = new Select(driver.findElement(By.name("ac_year")));
		selectacadamicyear.selectByValue("2");
			
		Select Selectgroup = new Select(driver.findElement(By.id("group")));
		Selectgroup.selectByVisibleText("JH SCHOOL 1");
		
		Select SelectClass = new Select(driver.findElement(By.id("sm_class")));
		SelectClass.selectByValue("3");		//Select LKG-VARAQA
		
		WebElement ClickSearch = driver.findElement(By.name("search"));
		ClickSearch.click();
		
	}
	
	@Test(dependsOnMethods="StudentRecord")
	
	public void ClickView() {
		//Student name :
		
		String MainWindow = driver.getWindowHandle();
		
		WebElement  ClickView = driver.findElement(By.xpath("//*[@id='tableToExcel']/tbody/tr[1]/td[5]/a[2]/i"));
		ClickView.click();
		
        Set<String> Handle = driver.getWindowHandles();
		
		for (String ChildWindow : Handle) {
			driver.switchTo().window(ChildWindow);
		}
		
		driver.close();
		driver.switchTo().window(MainWindow);
	}
	
    @Test(dependsOnMethods="ClickView")
  
   public void ClickAttendance() throws InterruptedException{
	  
    	
	   String MainWindow = driver.getWindowHandle();
	  
	   WebElement  ClickAttendance = driver.findElement(By.xpath("//*[@id='tableToExcel']/tbody/tr[1]/td[5]/a[3]/i"));
	   ClickAttendance.click();   
	   
       Set<String> Handle = driver.getWindowHandles();
		
	   for (String ChildWindow : Handle) {
			driver.switchTo().window(ChildWindow);
		}
	   
	    Select SelectClass = new Select(driver.findElement(By.name("classname")));
		SelectClass.selectByValue("14");  // UKG VARAQA
		
		Select Studentname = new Select(driver.findElement(By.name("sm_student")));
		Studentname.selectByValue("52");  // ABSHARA
				
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement Fromdate = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='from']"))));
		Fromdate.click();
		
		WebElement Clickfromdate =driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[4]/a"));
		Clickfromdate.click();
		
		WebElement Todate = driver.findElement(By.name("dc2"));
		Todate.click();
		
		WebElement Clicktodate =driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[5]/a"));
		Clicktodate.click();
		
		WebElement Submit = driver.findElement(By.name("class_student_late_report_submit"));
		Submit.click();
		
		driver.close();
	    driver.switchTo().window(MainWindow);
	 
  }
    
    @Test(dependsOnMethods="ClickAttendance")
    public void Clickfee(){
    	
    	String MainWindow = driver.getWindowHandle();
  	  
 	   WebElement  ClickFee = driver.findElement(By.xpath("//*[@id='tableToExcel']/tbody/tr[1]/td[5]/a[4]/i"));
 	  ClickFee.click();
 		
        Set<String> Handle = driver.getWindowHandles();
 		
 	   for (String ChildWindow : Handle) {
 			driver.switchTo().window(ChildWindow);
 		}
 	   
 	  WebElement  FeeDetails = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/a[1]/button"));
 	  FeeDetails.click();
 	  
 	 WebElement  MiscFine = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/a[2]/button"));
	  MiscFine.click();
	  
	  driver.close();
	  driver.switchTo().window(MainWindow);
 	   	
    }
    
    @Test(dependsOnMethods="Clickfee")
    
    public void ClickDelete(){
    	// Student name: FATHIMA
    	
    	WebElement Clickdelete =driver.findElement(By.xpath("//*[@id='tableToExcel']/tbody/tr[2]/td[5]/a[6]/i"));
    	Clickdelete.click();
    	
    	Alert alert = driver.switchTo().alert();
    	alert.dismiss();
    	
    	WebElement Clickdelete1 =driver.findElement(By.xpath("//*[@id='tableToExcel']/tbody/tr[2]/td[5]/a[6]/i"));
    	Clickdelete1.click();
    	
    	Alert alert1 = driver.switchTo().alert();
    	alert1.accept();
    }
    
    @Test(dependsOnMethods="ClickDelete")
    public void ClickissueTC(){
    	
    	Select selectacadamicyear = new Select(driver.findElement(By.name("ac_year")));
		selectacadamicyear.selectByValue("2");
			
		Select Selectgroup = new Select(driver.findElement(By.id("group")));
		Selectgroup.selectByVisibleText("JH SCHOOL 1");
		
		Select SelectClass = new Select(driver.findElement(By.id("sm_class")));
		SelectClass.selectByValue("3");		//Select LKG-VARAQA
		
		WebElement ClickSearch = driver.findElement(By.name("search"));
		ClickSearch.click();
		
		WebElement ClickissueTC =driver.findElement(By.xpath("//*[@id='tableToExcel']/tbody/tr[1]/td[5]/a[7]/i"));
		ClickissueTC.click();
    	
    	Alert alert = driver.switchTo().alert();
    	alert.dismiss();
    	
    	WebElement ClickissueTC1 =driver.findElement(By.xpath("//*[@id='tableToExcel']/tbody/tr[1]/td[5]/a[7]/i"));
    	ClickissueTC1.click();
    	
    	Alert alert1 = driver.switchTo().alert();
    	alert1.accept();
		
    }
    
    @AfterTest()
    public void CloseBrowser(){
    	
    	driver.quit();   }

}
