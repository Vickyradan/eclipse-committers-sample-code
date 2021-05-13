package sidenavigatebor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ListofSidebor {
	
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
	public void SideBor (){
		
		WebElement Dashboard = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[1]"));
		Dashboard.click();	
		
		WebElement MyProfile = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[2]"));
		MyProfile.click();	
		
		WebElement Attendance = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[3]/a[1]"));
		Attendance.click();
		
		WebElement LateAttendance = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[3]/a[2]"));
		LateAttendance.click();
		
		WebElement HomeWork = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[4]"));
		HomeWork.click();
		
		WebElement Vedio = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[5]"));
		Vedio.click();
		
		// Click Fee in side bar
		
		WebElement Fee = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[6]"));
		Fee.click();
		
		WebElement Viewfeedetail = driver.findElement(By.xpath("//*[@id='homeSubmenuf']/li[1]"));
		Viewfeedetail.click();
		
		WebElement Fee1 = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[6]"));
		Fee1.click();
		
		WebElement Viewmiscfine = driver.findElement(By.xpath("//*[@id='homeSubmenuf']/li[2]"));
		Viewmiscfine.click();
		
		//Scroll page
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		scroll.executeScript("scrollBy(0, 2500)");
		
		//Click Examination in side bar
		
		WebElement Examination = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[7]"));
		Examination.click();
		
		WebElement Exportexam = driver.findElement(By.xpath("//*[@id='homeSubmenu1']/li[1]"));
		Exportexam.click();
		
		WebElement Examination1 = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[7]"));
		Examination1.click();
		
		WebElement Viewresult = driver.findElement(By.xpath("//*[@id='homeSubmenu1']/li[2]"));
		Viewresult.click();
		
		// Click Secondary Examination
		
		WebElement SecondaryExamination = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[8]"));
		SecondaryExamination.click();
		
		WebElement Exportexam1 = driver.findElement(By.xpath("//*[@id='homeSubmenu10']/li[1]"));
		Exportexam1.click();
		
		WebElement SecondaryExamination1 = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[8]"));
		SecondaryExamination1.click();
		
		WebElement Viewresult1 = driver.findElement(By.xpath("//*[@id='homeSubmenu10']/li[2]"));
		Viewresult1.click();
		
		//Scroll page
		JavascriptExecutor scroll1 = (JavascriptExecutor)driver;
		scroll1.executeScript("scrollBy(0, 2500)");
		
		WebElement Event = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[9]"));
		Event.click();
		
		driver.navigate().back();
		
		//Scroll page
		JavascriptExecutor scroll2 = (JavascriptExecutor)driver;
		scroll2.executeScript("scrollBy(0, 2500)");
		
		WebElement Timetable = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[10]"));
		Timetable.click();
		
		//Click study material
		
		WebElement Studymaterial = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[11]"));
		Studymaterial.click();
		
		WebElement Tutorial = driver.findElement(By.xpath("//*[@id='homeSubmenu2']/li[1]"));
		Tutorial.click();
		
		WebElement Studymaterial1 = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[11]"));
		Studymaterial1.click();
		
		WebElement ViewBooklet = driver.findElement(By.xpath("//*[@id='homeSubmenu2']/li[2]"));
		ViewBooklet.click();
		
		// Click Transport
		
		WebElement Transport = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[12]"));
		Transport.click();
		
		WebElement Myroute = driver.findElement(By.xpath("//*[@id='pageSubmenu3']/li[1]"));
		Myroute.click();
		
		WebElement Transport1 = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[12]"));
		Transport1.click();
		
		WebElement Viewallroute = driver.findElement(By.xpath("//*[@id='pageSubmenu3']/li[2]"));
		Viewallroute.click();
		
		// Click notice 
		
		WebElement Notice = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[13]"));
		Notice.click();
		
		WebElement ReceivedNotice = driver.findElement(By.xpath("//*[@id='pageSubmenu4']/li[1]"));
		ReceivedNotice.click();
		
		WebElement Notice1 = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[13]"));
		Notice1.click();
		
		WebElement RepliedNotice = driver.findElement(By.xpath("//*[@id='pageSubmenu4']/li[2]"));
		RepliedNotice.click();
		
		// Click message
		
		WebElement Message = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[14]"));
		Message.click();
		
		WebElement Messageinbox = driver.findElement(By.xpath("//*[@id='pageSubmenu5']/li[1]"));
		Messageinbox.click();
		
		WebElement message1 = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[14]"));
		message1.click();
		
		WebElement Sendmessage = driver.findElement(By.xpath("//*[@id='pageSubmenu5']/li[2]"));
		Sendmessage.click();
		
		WebElement message2 = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[14]"));
		message2.click();
		
		WebElement Composemessage = driver.findElement(By.xpath("//*[@id='pageSubmenu5']/li[3]"));
		Composemessage.click();
		
		// Click message send to teacher
		
		WebElement Messagesentteacher = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[15]"));
		Messagesentteacher.click();
		
		//Click message send to Driver
		
		WebElement Messagesentdriver = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[16]"));
		Messagesentdriver.click();
		
		// Click Library
		
		WebElement Library = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[17]"));
		Library.click();
		
		WebElement Mybooks = driver.findElement(By.xpath("//*[@id='pageSubmenulib']/li[1]"));
		Mybooks.click();
		
		WebElement Library1 = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[17]"));
		Library1.click();
		
		WebElement BookAvailability = driver.findElement(By.xpath("//*[@id='pageSubmenulib']/li[2]"));
		BookAvailability.click();
		
		// Click Knowledge base
		
		WebElement Knowledgebase = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[18]"));
		Knowledgebase.click();
		
		WebElement Searcharticles = driver.findElement(By.xpath("//*[@id='pageSubmenu6']/li[1]"));
		Searcharticles.click();
		
		//Click Holidays
		
		WebElement Holiday = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[19]"));
		Holiday.click();
		
		// Click Help Link
		
		WebElement Helplink = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[20]"));
		Helplink.click();
		
		// Click Notice Board
		
		WebElement NoticeBoard = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[21]"));
		NoticeBoard.click();
		
		// Click Leave Details
		
		WebElement LeaveDetails = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[22]"));
		LeaveDetails.click();
		
		WebElement Requestleave = driver.findElement(By.xpath("//*[@id='pageSubmenu7']/li[1]"));
		Requestleave.click();
		
		WebElement LeaveDetails1 = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[22]"));
		LeaveDetails1.click();
		
		WebElement Leavelist = driver.findElement(By.xpath("//*[@id='pageSubmenu7']/li[2]"));
		Leavelist.click();
		
		
	}
	
	@AfterTest()
	public void Closebrowser(){
		driver.close();
	}

}
