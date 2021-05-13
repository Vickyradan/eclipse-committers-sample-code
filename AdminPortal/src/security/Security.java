package security;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Security {
	
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
		
		WebElement Security = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[37]"));
		Security.click();
	}
	
	@Test(dependsOnMethods="SignIn")
	public void VisitorsRecord1(){
		
		// Click Reset button Entered All input value cleared
		
		WebElement ClickVistorsRecoed = driver.findElement(By.xpath("//*[@id='pageSubmenu25']/li[1]/a"));
		ClickVistorsRecoed.click();
		
		// Enter Visitor name
		
		WebElement EnterVisitorname = driver.findElement(By.name("sec_name"));
		EnterVisitorname.sendKeys("hjhhj");
		
		// Enter TO Meet
		
		WebElement EnterToMeet = driver.findElement(By.name("sec_contact_person"));
		EnterToMeet.sendKeys("eytyrtu");
		
		//Enter Address
		
		WebElement EnterAddress = driver.findElement(By.name("sec_address"));
		EnterAddress.sendKeys("qwertyuui, 56sfgbfh");
		
		//Enter purpose
		
		WebElement Enterpurpose = driver.findElement(By.name("sec_purpose"));
		Enterpurpose.sendKeys("eytyrtu");
		
		// Click  Date and Time in
		
		WebElement ClickDateandtimeIN = driver.findElement(By.name("sec_time_in"));
		ClickDateandtimeIN.sendKeys("24/03/2021"+Keys.ENTER);
		
		//  Click  Date and Time Out
		
		WebElement ClickDateandtimeOUT = driver.findElement(By.name("sec_time_out"));
		ClickDateandtimeOUT.sendKeys("25/03/2021"+Keys.ENTER);
		
		// Enter Mode appointment
		
		WebElement EnterModeappointment = driver.findElement(By.name("sec_mode_app"));
		EnterModeappointment.sendKeys("tyuiopo");
		
		// Enter remarks
		
		WebElement Enterremarks = driver.findElement(By.name("sec_remarks"));
		Enterremarks.sendKeys("qwerrt");
		
		// Enter Vehicle registration number
		
		WebElement EnterVehicleregistration = driver.findElement(By.name("sec_vehicle_no"));
		EnterVehicleregistration.sendKeys("TN65AL1234");
		
		// Enter Make of vehicle
		
		WebElement EnterMakeofvehicle = driver.findElement(By.name("sec_make_vehicle"));
		EnterMakeofvehicle.sendKeys("BMW");
		
		// Enter Vehicle Color
		
		WebElement EnterVehicleColor = driver.findElement(By.name("sec_colour"));
		EnterVehicleColor.sendKeys("Black");
		
		// Enter Phone Number
		
		WebElement EnterPhoneNumber = driver.findElement(By.name("sec_phone"));
		EnterPhoneNumber.sendKeys("7569852940");
		
		// Click Rest button
		
		WebElement ClickRestbutton = driver.findElement(By.xpath("//*[@id='content']/div[1]/form/div[8]/button[2]"));
		ClickRestbutton.click();
				
		
	}
	
	@Test(dependsOnMethods="VisitorsRecord1")
	public void VisitorsRecord2(){
		
		// Click Submit button
		// Enter Visitor name
		
		WebElement EnterVisitorname = driver.findElement(By.name("sec_name"));
		EnterVisitorname.sendKeys("hjhhj");
		
		// Enter TO Meet
		
		WebElement EnterToMeet = driver.findElement(By.name("sec_contact_person"));
		EnterToMeet.sendKeys("eytyrtu");
		
		//Enter Address
		
		WebElement EnterAddress = driver.findElement(By.name("sec_address"));
		EnterAddress.sendKeys("qwertyuui, 56sfgbfh");
		
		//Enter purpose
		
		WebElement Enterpurpose = driver.findElement(By.name("sec_purpose"));
		Enterpurpose.sendKeys("eytyrtu");
		
		// Click  Date and Time in
		
		WebElement ClickDateandtimeIN = driver.findElement(By.name("sec_time_in"));
		ClickDateandtimeIN.sendKeys("24/03/2021"+Keys.ENTER);
		
		//  Click  Date and Time Out
		
		WebElement ClickDateandtimeOUT = driver.findElement(By.name("sec_time_out"));
		ClickDateandtimeOUT.sendKeys("25/03/2021"+Keys.ENTER);
		
		// Enter Mode appointment
		
		WebElement EnterModeappointment = driver.findElement(By.name("sec_mode_app"));
		EnterModeappointment.sendKeys("tyuiopo");
		
		// Enter remarks
		
		WebElement Enterremarks = driver.findElement(By.name("sec_remarks"));
		Enterremarks.sendKeys("qwerrt");
		
		// Enter Vehicle registration number
		
		WebElement EnterVehicleregistration = driver.findElement(By.name("sec_vehicle_no"));
		EnterVehicleregistration.sendKeys("TN65AL1234");
		
		// Enter Make of vehicle
		
		WebElement EnterMakeofvehicle = driver.findElement(By.name("sec_make_vehicle"));
		EnterMakeofvehicle.sendKeys("BMW");
		
		// Enter Vehicle Color
		
		WebElement EnterVehicleColor = driver.findElement(By.name("sec_colour"));
		EnterVehicleColor.sendKeys("Black");
		
		// Enter Phone Number
		
		WebElement EnterPhoneNumber = driver.findElement(By.name("sec_phone"));
		EnterPhoneNumber.sendKeys("7569852940");
		
		// Click Submit button
		
		WebElement ClickRestbutton = driver.findElement(By.xpath("//*[@id='content']/div[1]/form/div[8]/button[1]"));
		ClickRestbutton.click();
	}
	

}
