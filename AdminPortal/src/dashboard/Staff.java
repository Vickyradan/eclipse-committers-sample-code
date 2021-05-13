package dashboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class  Staff {
	// Only Check Non teaching Staff 
	
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
		
		WebElement ClickStaff = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/div[3]/div[1]/a/h5"));
		ClickStaff.click();
	}
	
	// Go to Staff Report Page
	
	@Test(dependsOnMethods="SignIn")
	public void ListNextandPrevious(){
		//  Click next button
		
		WebElement ClickNext = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/table/tbody/tr/td[3]/a"));
		ClickNext.click();
		
		WebElement ClickPrevious = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/table/tbody/tr/td[2]/a"));
		ClickPrevious.click();
		
		WebElement ClickLast = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/table/tbody/tr/td[4]/a"));
		ClickLast.click();
		
		WebElement ClickFirst = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/table/tbody/tr/td[1]/a"));
		ClickFirst.click();
		
		WebElement ClickNo2 = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/table/tbody/tr/td[2]/a"));
		ClickNo2.click();
		
		WebElement ClickNo1 = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/table/tbody/tr/td[3]/a"));
		ClickNo1.click();
			
	}
	
	@Test(dependsOnMethods="ListNextandPrevious")
	public void SearchNonTeachingStaff(){
		
		Select Group = new Select(driver.findElement(By.xpath("//*[@id='content']/div[1]/form/div[1]/div[1]/select")));
		Group.selectByVisibleText("NON-TEACHING");
		
		// Staff type default select: current staff
		
		Select ExStaff = new Select(driver.findElement(By.xpath("//*[@id='content']/div[1]/form/div[1]/div[2]/select")));
		ExStaff.selectByVisibleText("Ex Staff");
		
		Select currentStaff = new Select(driver.findElement(By.xpath("//*[@id='content']/div[1]/form/div[1]/div[2]/select")));
		currentStaff.selectByVisibleText("Current Staff");
		
		WebElement Search = driver.findElement(By.xpath("//*[@id='content']/div[1]/form/div[3]/button"));
		Search.click();
		
	}
	
	    // Filter  non Teaching Staff List and then Click  any one Staff view, Activities and Delete page
	
	@Test(dependsOnMethods="SearchNonTeachingStaff")
	public void clickStaffviewPage(){
		
		WebElement ClickView = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]/form/table/tbody/tr[1]/td[7]/a[2]/i"));
		ClickView.click();
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
	}
	
	@Test(dependsOnMethods="clickStaffviewPage")
	public void clickStaffActivitiesPage(){
		
		WebElement ClickActivities = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]/form/table/tbody/tr[1]/td[7]/a[3]/i"));
		ClickActivities.click();
		
		// Check All activities filled
		
        driver.navigate().back();
		
		driver.navigate().refresh();
		
	}
	
	// Click Edit options   // go to Edit staff page
	
	@Test(dependsOnMethods="clickStaffActivitiesPage")
	public void ClickEdit() throws InterruptedException{   
		
		WebElement ClickEdit = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]/form/table/tbody/tr[1]/td[7]/a[1]"));
		ClickEdit.click();
		
		Thread.sleep(3000);
		//Staff type
		//Click Radio button Teaching Staff    //Default radio button Click Non-teaching staff
		
		WebElement TeachindStaff = driver.findElement(By.id("feed_dis_1"));
		TeachindStaff.click();
		
		WebElement NonTeachindStaff = driver.findElement(By.id("feed_dis_2"));
		NonTeachindStaff.click();
		
		WebElement EmployeeID = driver.findElement(By.name("ib_empid"));
		EmployeeID.sendKeys("654");
		
		// FirstName      // Default First Name: ANANTHI
		 
		WebElement ClearFirstname = driver.findElement(By.id("st_fname"));
		ClearFirstname.clear();
		
		WebElement EnterFirstname = driver.findElement(By.name("st_fname"));
		EnterFirstname.sendKeys("ANANTHI");
		
		// Select Gender   //Default Gender: Female
		
		Select selectmale = new Select(driver.findElement(By.id("st_gender")));
		selectmale.selectByVisibleText("Male");
				
		Select Selectfemale = new Select(driver.findElement(By.id("st_gender")));
		Selectfemale.selectByVisibleText("Female");
		
		// select Department   // Default Department : NON-teaching
		
		Select selectTeaching = new Select(driver.findElement(By.name("st_department")));
		selectTeaching.selectByVisibleText("TEACHING");
				
		Select selectNonTeaching = new Select(driver.findElement(By.name("st_department")));
		selectNonTeaching.selectByVisibleText("NON-TEACHING");
		
		// Select Designation     // Default Designation : AAYA
		
		Select selectCHAIRMAN = new Select(driver.findElement(By.name("st_posts")));
		selectCHAIRMAN.selectByVisibleText("CHAIRMAN");
		
		Select selectDRIVER = new Select(driver.findElement(By.name("st_posts")));
		selectDRIVER.selectByVisibleText("DRIVER");
		
		Select selectOFFICEADMIN = new Select(driver.findElement(By.name("st_posts")));
		selectOFFICEADMIN.selectByVisibleText("OFFICE ADMIN");
		
		Select selectAAYA = new Select(driver.findElement(By.name("st_posts")));
		selectAAYA.selectByVisibleText("AAYA");
		
		// LOGIN DETAILS
		
		//  Enter Username     // default username :  N19003
		
		WebElement Clearusername = driver.findElement(By.name("st_user"));
		Clearusername.clear();
		
		WebElement Enterusername = driver.findElement(By.name("st_user"));
		Enterusername.sendKeys("N19003");
		
	    //  Enter Password     // default Password :  N19003 (hide entered password)
		
		WebElement ClearPassword = driver.findElement(By.name("st_password"));
		ClearPassword.clear();
		
		WebElement EnterPassword = driver.findElement(By.name("st_password"));
		EnterPassword.sendKeys("N19003");
		
		// Click Date Of Birth    // Default Date Of Birth :01/01/1970
		
		WebElement ClearDOB = driver.findElement(By.name("st_dob"));
		ClearDOB.clear();
		
		WebElement ClickDOB = driver.findElement(By.name("st_dob"));
		ClickDOB.sendKeys("01/01/1970"+Keys.ENTER);
		
		// Present Address
		
		// Enter Address
		
		WebElement ClearAddress = driver.findElement(By.name("st_address"));
		ClearAddress.clear();
		
		WebElement EnterAddress = driver.findElement(By.name("st_address"));
		EnterAddress.sendKeys("EAST STREET, RUTHIRASOLAI, KATTUMANNARKOIL");
		
		//Enter City
		
		WebElement EnterCity = driver.findElement(By.id("st_city"));
		EnterCity.sendKeys("poonthamalee");
		
		WebElement ClearCity = driver.findElement(By.id("st_city"));
		ClearCity.clear();
		
		// ENter District
		
		WebElement EnterDistrict = driver.findElement(By.id("st_country"));
		EnterDistrict.sendKeys("Chennai");
		
		WebElement ClearDistrict = driver.findElement(By.id("st_country"));
		ClearDistrict.clear();
		
		//Enter State
		
		WebElement ClearState = driver.findElement(By.id("st_state"));
		ClearState.clear();
		
		WebElement EnterState = driver.findElement(By.id("st_state"));
		EnterState.sendKeys("TAMIL NADU");
		
		// Enter postcode
		
		WebElement ClearPostcode = driver.findElement(By.id("st_pincode"));
		ClearPostcode.clear();
		
		WebElement EnterPostcode = driver.findElement(By.id("st_pincode"));
		EnterPostcode.sendKeys("608 301");
		
		// Enter Mobile
		
		WebElement ClearMobile = driver.findElement(By.id("st_mobile"));
		ClearMobile.clear();
		
		WebElement EnterMobile = driver.findElement(By.id("st_mobile"));
		EnterMobile.sendKeys("7603922771");
		
		// Permanent Address   
		
		// Same as Present Address Click checkbox button
		
		WebElement ClickCheckbox = driver.findElement(By.id("sameaddress1"));
		ClickCheckbox.click();
		
		// Not Same as Present Address UnClick checkbox button
		
		WebElement UnClickCheckbox = driver.findElement(By.id("sameaddress1"));
		UnClickCheckbox.click();
		
		WebElement ClickCheckbox1 = driver.findElement(By.id("sameaddress1"));
		ClickCheckbox1.click();
		
		WebElement UnClickCheckbox1 = driver.findElement(By.id("sameaddress1"));
		UnClickCheckbox1.click();
			
    	// Enter Salary Details

		WebElement EnterSalary = driver.findElement(By.id("st_basic"));
		EnterSalary.sendKeys("0");
		
		// Date Of Joining
		
		WebElement ClearDateOfJoining = driver.findElement(By.id("st_doj2"));
		ClearDateOfJoining.clear();
		
		WebElement ClickDateOfJoining = driver.findElement(By.id("st_doj2"));
		ClickDateOfJoining.sendKeys("16/08/2019"+Keys.ENTER);
		
		// Enter Remarks
		
		WebElement ClearRemarks = driver.findElement(By.id("st_remarks"));
		ClearRemarks.clear();
		
		WebElement EnterRemarks = driver.findElement(By.id("st_remarks"));
		EnterRemarks.sendKeys("AAYA");
		
		// Upload Photo
		
		WebElement choosephoto = driver.findElement(By.id("picField"));
		choosephoto.sendKeys("C:\\Users\\KAVINESH\\Downloads\\img-01.png");
		
		// Click update
		
		WebElement ClickUpdate = driver.findElement(By.name("updateading"));
		ClickUpdate.clear();
		
		
	}
	
	
	
}

