package dashboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TotalClass {
	
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
		
		WebElement ClickTotalClass = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/div[4]/div[1]/a/h5"));
		ClickTotalClass.click();

	}
	
	@Test (enabled=false)//(dependsOnMethods="SignIn")
	public void SaveGroup(){
		
		// Create Group 
		
		WebElement EnterCreateGroup = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/form/div/table[1]/tbody/tr[8]/td[2]/input"));
		EnterCreateGroup.sendKeys("qwerty");
		
		WebElement DeleteEnterGroupname = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/form/div/table[1]/tbody/tr[8]/td[3]/a[2]/i"));
		DeleteEnterGroupname.click();
		
		WebElement EnterCreateGroup1 = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/form/div/table[1]/tbody/tr[8]/td[2]/input"));
		EnterCreateGroup1.sendKeys("qwerty");
		
		WebElement AddRow = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/form/div/table[1]/tbody/tr[8]/td[3]/a[1]/i"));
		AddRow.click();
		
		// Enter Dept name
		
		WebElement EnterDeptName = driver.findElement(By.xpath("//*[@id='undefined']/table/tbody/tr/td[2]/input"));
		EnterDeptName.sendKeys("uiopas");
		
		WebElement Save = driver.findElement(By.name("savegroups"));
		Save.click();
		
		
	}
	
	@Test (enabled=false)//(dependsOnMethods="SignIn")
	public void ResetGroup(){
		
		WebElement EnterCreateGroup = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/form/div/table[1]/tbody/tr[8]/td[2]/input"));
		EnterCreateGroup.sendKeys("qwerty");
		
		WebElement DeleteEnterGroupname = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/form/div/table[1]/tbody/tr[8]/td[3]/a[2]/i"));
		DeleteEnterGroupname.click();
		
		WebElement EnterCreateGroup1 = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/form/div/table[1]/tbody/tr[8]/td[2]/input"));
		EnterCreateGroup1.sendKeys("qwerty");
		
		WebElement AddRow = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/form/div/table[1]/tbody/tr[8]/td[3]/a[1]/i"));
		AddRow.click();
		
		// Enter Dept name
		
		WebElement EnterDeptName = driver.findElement(By.xpath("//*[@id='undefined']/table/tbody/tr/td[2]/input"));
		EnterDeptName.sendKeys("uiopas");
		
		WebElement Reset = driver.findElement(By.name("reset"));
		Reset.click();
		
	}
	
	@Test(enabled=false)  //(dependsOnMethods="SaveGroup")
	public void EditSavedGroup(){
		
		WebElement Edit = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/form/div/table[1]/tbody/tr[9]/td[3]/a[3]/i"));
		Edit.click();
		
		WebElement EditGroup = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/form/div/table[1]/tbody/tr[9]/td[2]/input"));
		EditGroup.sendKeys("uiopasdfg");
		
		WebElement Editsave = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/form/div/table[1]/tbody/tr[9]/td[3]/input"));
		Editsave.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	@Test(enabled=false)   //(dependsOnMethods="EditSavedGroup")
	public void DeleteSavedGroup(){
		
		WebElement Delete = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/form/div/table[1]/tbody/tr[9]/td[3]/a[2]/i"));
		Delete.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	@Test(enabled=false)//(dependsOnMethods="SignIn")
	public void SaveClass(){
		
		WebElement EnterClass =driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[2]/form/div/table[1]/tbody/tr[20]/td[3]/input"));
		EnterClass.sendKeys("mnbvcx");
		
		Select selectgroup = new Select(driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[2]/form/div/table[1]/tbody/tr[20]/td[4]/select")));
		selectgroup.selectByVisibleText("Qwertyqwerty");
		
		// Delete Class
		
		WebElement DeleteClass = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[2]/form/div/table[1]/tbody/tr[20]/td[5]/a[2]/i"));
		DeleteClass.click();
		
		// Add row
		
		WebElement AddRow = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[2]/form/div/table[1]/tbody/tr[20]/td[5]/a[1]/i"));
		AddRow.click();
		
		WebElement EnterClass1 =driver.findElement(By.xpath("//*[@id='undefined']/table/tbody/tr/td[2]/input"));
		EnterClass1.sendKeys("asdfgh");
		
		Select selectgroup1 = new Select(driver.findElement(By.xpath("//*[@id='undefined']/table/tbody/tr/td[3]/select")));
		selectgroup1.selectByVisibleText("Qwertyqwerty");
		
		WebElement Save = driver.findElement(By.name("save"));
		Save.click();
				
	}
	
	@Test(enabled=false) //(dependsOnMethods="SignIn")
	public void ResetClass(){
		
		WebElement EnterClass =driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[2]/form/div/table[1]/tbody/tr[20]/td[3]/input"));
		EnterClass.sendKeys("mnbvcx");
		
		Select selectgroup = new Select(driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[2]/form/div/table[1]/tbody/tr[20]/td[4]/select")));
		selectgroup.selectByVisibleText("Qwertyqwerty");
		
		// Delete Class
		
		WebElement DeleteClass = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[2]/form/div/table[1]/tbody/tr[20]/td[5]/a[2]/i"));
		DeleteClass.click();
		
		// Add row
		
		WebElement AddRow = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[2]/form/div/table[1]/tbody/tr[20]/td[5]/a[1]/i"));
		AddRow.click();
		
		WebElement EnterClass1 =driver.findElement(By.xpath("//*[@id='undefined']/table/tbody/tr/td[2]/input"));
		EnterClass1.sendKeys("asdfgh");
		
		Select selectgroup1 = new Select(driver.findElement(By.xpath("//*[@id='undefined']/table/tbody/tr/td[3]/select")));
		selectgroup1.selectByVisibleText("Qwertyqwerty");
		
		WebElement Reset = driver.findElement(By.name("reset2"));
		Reset.click();
	}
	
	@Test(enabled=false)  //(dependsOnMethods="SaveClass")
	public void EditsavedClass(){
		
		WebElement Edit = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[2]/form/div/table[1]/tbody/tr[6]/td[5]/a[3]/i"));
		Edit.click();
		
		WebElement EditClass = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[2]/form/div/table[1]/tbody/tr[6]/td[3]/input"));
		EditClass.sendKeys("asd");
		
		Select selectgroup1 = new Select(driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[2]/form/div/table[1]/tbody/tr[6]/td[4]/select")));
		selectgroup1.selectByVisibleText("Qwertyqwerty");
		
		WebElement Editsave = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[2]/form/div/table[1]/tbody/tr[6]/td[5]/input"));
		Editsave.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	@Test (enabled=false)  //(dependsOnMethods="EditsavedClass")
	public void DeleteSavedClass(){
		
		WebElement Delete = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[2]/form/div/table[1]/tbody/tr[2]/td[5]/a[2]/i"));
		Delete.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
	// Create Subject
	
	@Test(dependsOnMethods="SignIn")
	public void SaveSubject(){
		
		Select selectgroup1 = new Select(driver.findElement(By.xpath("//*[@id='group']")));
		selectgroup1.selectByVisibleText("Qwertyqwerty");
		
		Select selectClass = new Select(driver.findElement(By.xpath("//*[@id='sub_class']")));
		selectClass.selectByVisibleText("MNBVCXasd");
		
		// Add Subject
		
		WebElement EnterSubjectcode = driver.findElement(By.xpath("//*[@id='subClassResult']/blockquote/form/div/div/table[1]/tbody/tr[1]/td[2]/input"));
		EnterSubjectcode.sendKeys("SB3256");
		
		WebElement EnterSubjectname = driver.findElement(By.xpath("//*[@id='subClassResult']/blockquote/form/div/div/table[1]/tbody/tr[1]/td[3]/input"));
		EnterSubjectname.sendKeys("lkjhgfdsa");
		
		//Add Row
		
		WebElement AddRow = driver.findElement(By.xpath("//*[@id='subClassResult']/blockquote/form/div/div/table[1]/tbody/tr[1]/td[4]/a[1]/i"));
		AddRow.click();
		
		WebElement DeleteRow = driver.findElement(By.xpath("//*[@id='undefined']/table/tbody/tr/td[4]/a[2]/i"));
		DeleteRow.click();
		
		
		WebElement Save = driver.findElement(By.xpath("//*[@id='subClassResult']/blockquote/form/div/div/div/button[1]"));
		Save.click();
	}
	
	@Test(dependsOnMethods="SignIn")
	public void ResetSubject() throws InterruptedException{
		
		Select selectgroup1 = new Select(driver.findElement(By.xpath("//*[@id='group']")));
		selectgroup1.selectByVisibleText("Qwertyqwerty");
		
		Thread.sleep(3000);
		Select selectClass = new Select(driver.findElement(By.xpath("//*[@id='sub_class']")));
		selectClass.selectByVisibleText("MNBVCXasd");
		
		// Add Subject
		
		WebElement EnterSubjectcode = driver.findElement(By.xpath("//*[@id='subClassResult']/blockquote/form/div/div/table[1]/tbody/tr[1]/td[2]/input"));
		EnterSubjectcode.sendKeys("SB3256");
		
		WebElement EnterSubjectname = driver.findElement(By.xpath("//*[@id='subClassResult']/blockquote/form/div/div/table[1]/tbody/tr[1]/td[3]/input"));
		EnterSubjectname.sendKeys("lkjhgfdsa");
		
		//Add Row
		
		WebElement AddRow = driver.findElement(By.xpath("//*[@id='subClassResult']/blockquote/form/div/div/table[1]/tbody/tr[1]/td[4]/a[1]/i"));
		AddRow.click();
		
		WebElement DeleteRow = driver.findElement(By.xpath("//*[@id='undefined']/table/tbody/tr/td[4]/a[2]/i"));
		DeleteRow.click();
		
		WebElement Reset = driver.findElement(By.xpath("//*[@id='subClassResult']/blockquote/form/div/div/div/button[2]"));
		Reset.click();
		
	}
	@Test(dependsOnMethods="SaveSubject")
	public void EditSubject(){

		WebElement Edit = driver.findElement(By.xpath("//*[@id='subClassResult']/blockquote/form/div/div/table[1]/tbody/tr[1]/td[4]/a[4]/i"));
		Edit.click();
		
		WebElement EditSubjectcode = driver.findElement(By.xpath("//*[@id='subClassResult']/blockquote/form/div/div/table[1]/tbody/tr[1]/td[2]/input"));
		EditSubjectcode.sendKeys("SB32561");
		
		WebElement EditSubjectname = driver.findElement(By.xpath("//*[@id='subClassResult']/blockquote/form/div/div/table[1]/tbody/tr[1]/td[3]/input"));
		EditSubjectname.sendKeys("lkjhgfdsaqwe");
		
		WebElement Editsave = driver.findElement(By.xpath("//*[@id='subClassResult']/blockquote/form/div/div/div/button[1]"));
		Editsave.click();
		
	}
	
	@Test(dependsOnMethods="EditSubject")
	public void DeleteSubject(){
		
		WebElement Delete = driver.findElement(By.xpath("//*[@id='subClassResult']/blockquote/form/div/div/table[1]/tbody/tr[1]/td[4]/a[2]/i"));
		Delete.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	

}
