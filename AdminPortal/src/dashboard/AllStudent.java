package dashboard;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllStudent {
	//  Go to Student record  // only Click Edit 
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
	
	@Test(dependsOnMethods="SignIn")
	public void Exportfile(){
		
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
		// Export file
		
		WebElement Exportfile = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/button"));
		Exportfile.click();
		
		File filelocation= new File("D:\\");
		File[] totalfile = filelocation.listFiles();
		
		for (File file : totalfile) {
			
			if(file.getName().equals(".xls"));
			System.out.println("file download");
			break;
		}
	}	
	
	// Click student detailed action ( view, Edit, Attendance, Fee, Delete, TC issue)
	
	@Test(dependsOnMethods="Exportfile") 
	 
	public void ClickEditnoChanges(){
		
		//student name  (ABSHARA)
		
		WebElement ClickEdit = driver.findElement(By.xpath("//*[@id='tableToExcel']/tbody/tr[1]/td[5]/a[1]/i"));
		ClickEdit.click();
		
		// Student Admission / Registration - Edit Details page
		//we do click the direct update button. but didn't any changes in edit details page	
		
		WebElement Clickupdate = driver.findElement(By.name("update"));
		Clickupdate.click();
		
		
	}
	
		// we do change student detail 
		
	@Test(dependsOnMethods="ClickEditnoChanges")
	
	public void Clickeditwithchanges() {
		
		Select selectacadamicyear = new Select(driver.findElement(By.name("ac_year")));
		selectacadamicyear.selectByValue("2");
		
		Select Selectgroup = new Select(driver.findElement(By.id("group")));
		Selectgroup.selectByVisibleText("JH SCHOOL 1");
		
		Select SelectClass = new Select(driver.findElement(By.id("sm_class")));
		SelectClass.selectByValue("3");		//Select LKG-VARAQA
		
		WebElement ClickSearch = driver.findElement(By.name("search"));
		ClickSearch.click();
		
		WebElement ClickEdit = driver.findElement(By.xpath("//*[@id='tableToExcel']/tbody/tr[1]/td[5]/a[1]/i"));
		ClickEdit.click();
		
		WebElement ClearFirstName = driver.findElement(By.id("pre_name"));  
		ClearFirstName.clear();
		
		// All mandatory not work please check
		
		WebElement EnterFirstName = driver.findElement(By.id("pre_name"));  // //Default First name name : ABSHARA
		EnterFirstName.sendKeys("ABSHARA");
		
		WebElement ClearAdmissionNo = driver.findElement(By.id("admission_id"));
		ClearAdmissionNo.clear();
		
		WebElement EnterAdmissionNo = driver.findElement(By.id("admission_id"));// Default admission No :596
		EnterAdmissionNo.sendKeys("596");
		
		WebElement ClearEMISNo = driver.findElement(By.id("inputEmail4"));  
		ClearEMISNo.clear();
		
		WebElement EMISNo = driver.findElement(By.id("inputEmail4"));  //Default EMIS no :EMI331813077011920811
		EMISNo.sendKeys("EMI331813077011920811");
		
		Select ClickselectTittle =new Select(driver.findElement(By.id("pre_serialno"))); // to change tittle
		ClickselectTittle.selectByVisibleText("Select Tittle");
		
		Select NameTittle =new Select(driver.findElement(By.id("pre_serialno"))); //Default Tittle name : Miss
		NameTittle.selectByValue("Miss");
		
		WebElement EnterMiddlename = driver.findElement(By.name("middle_name"));  //Default Middle name : Empty
		EnterMiddlename.sendKeys("dethjtdrs45");
		
		WebElement ClearMiddlename = driver.findElement(By.name("middle_name"));  
		ClearMiddlename.clear();
		
		WebElement EnterLastname = driver.findElement(By.name("pre_lastname"));  //Default last name : Empty
		EnterLastname.sendKeys("rstuydy7585");
		
		WebElement ClearLastname = driver.findElement(By.name("pre_lastname"));  
		ClearLastname.clear();
		
		Select ChangeGender =new Select(driver.findElement(By.id("pre_gender")));// change gender: select gender
		ChangeGender.selectByVisibleText("Select Gender");
		
		Select Gender =new Select(driver.findElement(By.id("pre_gender")));// Default gender: female
		Gender.selectByValue("female");
		
		WebElement ClearDOB = driver.findElement(By.id("pre_dateofbirth"));
		ClearDOB.clear();
		
		WebElement CurrentAge = driver.findElement(By.name("pre_age"));  // now Click Current age automatically changed 
		CurrentAge.click();
		
		WebElement EnterDOB = driver.findElement(By.id("pre_dateofbirth"));//Default DOB: 17/08/2015
		EnterDOB.sendKeys("17/05/2014"+Keys.ENTER);
		
		
		WebElement CurrentAge1 = driver.findElement(By.name("pre_age"));  // now Click Current age automatically changed 
		CurrentAge1.click();
		
		
		WebElement EnterBirthPlace = driver.findElement(By.name("pre_placeofbirth"));  //Default Place of birth  : Empty
		EnterBirthPlace.sendKeys("ukyutyjut1242");
		
		WebElement ClearBirthPlace = driver.findElement(By.name("pre_placeofbirth")); 
		ClearBirthPlace.clear();
		
		WebElement ClearNationality = driver.findElement(By.name("test1"));  
		ClearNationality.clear();
		
		WebElement EnterNAtionality = driver.findElement(By.name("test1"));  //Default Place of birth  : INDIAN
		EnterNAtionality.sendKeys("INDIAN");
		
		// Select Religion
		// Default Religion: select
		
		Select selectReligion =new Select(driver.findElement(By.id("editdrop")));   //Visible Text :  Hindu
		selectReligion.selectByValue("Hindu");
		
		Select selectReligion1 =new Select(driver.findElement(By.id("editdrop")));    //Visible Text : Muslim
		selectReligion1.selectByValue("Islam");
		
		Select selectReligion11 =new Select(driver.findElement(By.id("editdrop")));     //Visible Text : Christian
		selectReligion11.selectByValue("Christian");
		
		Select selectReligion111 =new Select(driver.findElement(By.id("editdrop")));     //Visible Text :Sikhism
		selectReligion111.selectByValue("Sikhism");
		
		Select selectReligion1111 =new Select(driver.findElement(By.id("editdrop")));     //Visible Text :  Buddhism
		selectReligion1111.selectByValue("Buddhism");
		
		Select selectReligion11111 =new Select(driver.findElement(By.id("editdrop")));    //Visible Text :  Others
		selectReligion11111.selectByValue("Others");
		
		// Select Blood Group   // Default Blood group: select
		  
		Select selectbloodgroup =new Select(driver.findElement(By.name("pre_blood_group")));   //Visible Text :  O Positive
		selectbloodgroup.selectByValue("O Positive");
		
		Select selectbloodgroup1 =new Select(driver.findElement(By.name("pre_blood_group")));  //Visible Text :  A Positive
		selectbloodgroup1.selectByValue("A Positive");
		
		Select selectbloodgroup11 =new Select(driver.findElement(By.name("pre_blood_group")));   //Visible Text :  B Positive
		selectbloodgroup11.selectByValue("B Positive");
		
		Select selectbloodgroup111 =new Select(driver.findElement(By.name("pre_blood_group")));   //Visible Text :  AB Positive
		selectbloodgroup111.selectByValue("AB Positive");
		
		Select selectbloodgroup1111 =new Select(driver.findElement(By.name("pre_blood_group")));   //Visible Text :   A1 Positive
		selectbloodgroup1111.selectByValue("A1 Positive");
		
		Select selectbloodgroup11111 =new Select(driver.findElement(By.name("pre_blood_group")));    //Visible Text :  A1B Positive
		selectbloodgroup11111.selectByValue("A1B Positive");
		
		// select community  // Default community : BCM
		
		Select selectcommunity =new Select(driver.findElement(By.name("caste_id")));     //Visible Text :     MBC
		selectcommunity.selectByValue("1");
		
		Select selectcommunity1 =new Select(driver.findElement(By.name("caste_id")));   //Visible Text :  SC
		selectcommunity1.selectByValue("9");
		
		Select selectcommunity11 =new Select(driver.findElement(By.name("caste_id")));   //Visible Text :   BC
		selectcommunity11.selectByValue("8");
		 
		Select selectcommunity111 =new Select(driver.findElement(By.name("caste_id")));   //Visible Text :  BC - CHETTY
		selectcommunity111.selectByValue("10");
		
		Select selectcommunity1111 =new Select(driver.findElement(By.name("caste_id")));  //Visible Text : BC - SENGUNTHA MUTHALIYAR
		selectcommunity1111.selectByValue("11");
		
		//  Enter Sub-Caste
		
		WebElement ClearSubcaste = driver.findElement(By.name("test3"));  
		ClearSubcaste.clear();
		
		WebElement EnterSubcaste = driver.findElement(By.name("test3"));  //Default Sub-Caste  : LEBBAI
		EnterSubcaste.sendKeys("LEBBAI");
		
		// Select mother Tongue  // Select Default mother tongue : Tamil
		
		Select selectmothertongue =new Select(driver.findElement(By.name("pre_alerge")));   //Visible Text : Telugu
		selectmothertongue.selectByValue("Telugu");
		
		Select selectmothertongue1 =new Select(driver.findElement(By.name("pre_alerge")));    //Visible Text : Kannada
		selectmothertongue1.selectByValue("Kannada");
		 
		Select selectmothertongue11 =new Select(driver.findElement(By.name("pre_alerge")));  //Visible Text :  Tamil
		selectmothertongue11.selectByValue("Tamil");
		
		// Enter Aadhaar No  

		WebElement Clearaadhaarno = driver.findElement(By.name("aadharno"));  
		Clearaadhaarno.clear();
		
		WebElement Enteraadhaarno = driver.findElement(By.name("aadharno"));  //Default Aadhaar No   : 6408 9899 5037
		Enteraadhaarno.sendKeys("6408 9899 5037");
		
		// Enter PAN number

		WebElement EnterPANno = driver.findElement(By.name("edugap"));  //Default PAN No   : Empty
		EnterPANno.sendKeys("ASDFD1236R");
		
		WebElement ClearPANno = driver.findElement(By.name("edugap"));  
		ClearPANno.clear();
		
		// Select Admission class   // Default Admission Class : UKG VARAQA

		Select selectadmissionclass =new Select(driver.findElement(By.name("pre_class")));  //Visible Text :  LKG-ZAHRA
		selectadmissionclass.selectByValue("1");
		
		Select selectadmissionclass1 =new Select(driver.findElement(By.name("pre_class")));  //Visible Text :  UKG VARAQA
		selectadmissionclass1.selectByValue("14");
		
		//  Enter username     

		WebElement Clearusername = driver.findElement(By.name("pre_student_username"));  
		Clearusername.clear();
		
		WebElement Enterusername = driver.findElement(By.name("pre_student_username"));  //Default username   : 196001
		Enterusername.sendKeys("196001");
		
		WebElement Clearpassword = driver.findElement(By.name("pre_student_password"));  
		Clearpassword.clear();
		
		WebElement Enterpassword = driver.findElement(By.name("pre_student_password"));  //Default password   : 196001
		Enterpassword.sendKeys("196001");
		
		WebElement EnterIdentificationMarkA  = driver.findElement(By.name("pre_weight"));  //Default Identification Mark (a)    : Empty
		EnterIdentificationMarkA .sendKeys("rudyjngt4556");
		
		WebElement ClearIdentificationMarkA  = driver.findElement(By.name("pre_weight"));  
		ClearIdentificationMarkA .clear();
		
		WebElement EnterIdentificationMarkB  = driver.findElement(By.name("es_home"));  //Default Identification Mark (b)    : Empty
		EnterIdentificationMarkB .sendKeys("qwertyui");
		
		WebElement ClearIdentificationMarkB  = driver.findElement(By.name("es_home"));  
		ClearIdentificationMarkB .clear();
		
		WebElement Enterpreviousinstitution  = driver.findElement(By.name("board"));  //Default previous institution    : Empty
		Enterpreviousinstitution .sendKeys("qwertyui");
		
		WebElement Clearpreviousinstitution  = driver.findElement(By.name("board"));  
		Clearpreviousinstitution .clear();
		
		WebElement ClearAdmissiondate = driver.findElement(By.id("admission_date"));
		ClearAdmissiondate.clear();
			
		WebElement EnterAdmissiondate = driver.findElement(By.id("admission_date"));//Default Admission date: 16/04/2019
		EnterAdmissiondate.sendKeys("16/04/2019"+Keys.ENTER);
		
		// Select Admission type
		
		Select selectadmissiontype =new Select(driver.findElement(By.name("es_econbackward4")));  //Visible Text :  General
		selectadmissiontype.selectByValue("General");
		
		Select selectadmissiontype1 =new Select(driver.findElement(By.name("es_econbackward4")));  //Visible Text :  Management Quota
		selectadmissiontype1.selectByValue("Management Quota");
		
		Select selectadmissiontype11 =new Select(driver.findElement(By.name("es_econbackward4")));  //Visible Text :  Government Quota
		selectadmissiontype11.selectByValue("Government Quota");
		
		Select selectadmissiontype111 =new Select(driver.findElement(By.name("es_econbackward4")));  //Visible Text :  RTE
		selectadmissiontype111.selectByValue("RTE");
		
		// Select Student type
		
		Select selectStudenttype =new Select(driver.findElement(By.name("student_type")));  //Visible Text :  day scholar
		selectStudenttype.selectByValue("day scholar");
		
		Select selectStudenttype1 =new Select(driver.findElement(By.name("student_type")));  //Visible Text :  van
		selectStudenttype1.selectByValue("van");
		
		Select selectStudenttype11 =new Select(driver.findElement(By.name("student_type")));  //Visible Text :  Hostel
		selectStudenttype11.selectByValue("hostel");
		
		// Select Student Group Name
		
		Select StudentGroupName =new Select(driver.findElement(By.name("stu_group_id")));  //Visible Text :  honey
		StudentGroupName.selectByValue("3");
		
	}
	
	@Test(dependsOnMethods="Clickeditwithchanges")
	
	public void ParentsDetails(){
		//  Student Parents Details
		// Father name and Age
		
		
		WebElement ClearFathername  = driver.findElement(By.name("pre_fathername"));  
		ClearFathername .clear();
		
		WebElement Enterfathername  = driver.findElement(By.name("pre_fathername"));  //Default Father name    : ABUSUHUTHU
		Enterfathername .sendKeys("ABUSUHUTHU");
		
		WebElement EnterfatherAge  = driver.findElement(By.name("pre_prev_acadamicname"));  //Default Father Age    : Empty
		EnterfatherAge .sendKeys("35");
		
		WebElement ClearfatherAge  = driver.findElement(By.name("pre_prev_acadamicname"));  
		ClearfatherAge .clear();
		
		// Enter Mother name and Age
		
		WebElement ClearMothername  = driver.findElement(By.name("pre_mothername"));  
		ClearMothername .clear();
		
		WebElement EnterMothername  = driver.findElement(By.name("pre_mothername"));  //Default Mother name    : MUHATHARUNISA
		EnterMothername .sendKeys("MUHATHARUNISA");
		
		WebElement EntermotherAge  = driver.findElement(By.name("pre_prev_tcno"));  //Default Mother Age    : Empty
		EntermotherAge .sendKeys("30");
		
		WebElement ClearmotherAge  = driver.findElement(By.name("pre_prev_tcno"));  
		ClearmotherAge .clear();
		
		//Enter Qualification  graduate
		
		WebElement Enterqualification  = driver.findElement(By.name("pre_contactname1"));  //Default qualification    : Empty
		Enterqualification .sendKeys("Post graduate");
		
		WebElement Clearqualification  = driver.findElement(By.name("pre_contactname1"));  
		Clearqualification .clear();
		
		// Enter Occupation
		
		WebElement Enteroccupation  = driver.findElement(By.name("pre_fathersoccupation"));  //Default occupation    : Empty
		Enteroccupation .sendKeys("Employ");
		
		WebElement Clearocupation  = driver.findElement(By.name("pre_fathersoccupation"));  
		Clearocupation .clear();
		
	}
	
	@Test(dependsOnMethods="ParentsDetails")
	
	public void GuardianDetails(){
		// GUARDIAN DETAILS
		// GUARDIAN name
		
		WebElement Enterguardianname  = driver.findElement(By.name("pre_current_class2"));  //Default guardian  : Empty
		Enterguardianname .sendKeys("rtsuryuyj454");
		
		WebElement Clearguardianname  = driver.findElement(By.name("pre_current_class2"));  
		Clearguardianname .clear();
		
		// Phone 
		
		WebElement EnterPhone  = driver.findElement(By.name("pre_resno"));  //Default Phone  : Empty
		EnterPhone .sendKeys("7589461362");
		
		WebElement ClearPhone  = driver.findElement(By.name("pre_resno"));  
		ClearPhone .clear();
		
		// Enter Address
		
		WebElement EnterAddress  = driver.findElement(By.name("pre_current_percentage2"));  //Default Address  : Empty
		EnterAddress .sendKeys("502 RAHMANIYA STREET, V. KULAKKUDI, LALPET");
		
		WebElement ClearAddress  = driver.findElement(By.name("pre_current_percentage2"));  
		ClearAddress .clear();
		
	}
	
	@Test(dependsOnMethods="GuardianDetails")
	
	public void PresentAddress(){
		// Present Address Details
		// Address Line
		
		WebElement ClearAddressline  = driver.findElement(By.name("pre_address1"));  
		ClearAddressline .clear();
		
		WebElement EnterAddressline  = driver.findElement(By.name("pre_address1"));  //Default Address  : (502 RAHMANIYA STREET, V. KULAKKUDI, LALPET)
		EnterAddressline .sendKeys("502 RAHMANIYA STREET, V. KULAKKUDI, LALPET");
		
		// City
		
		WebElement EnterCity  = driver.findElement(By.name("pre_city1"));  //Default Address  : Empty
		EnterCity .sendKeys("Chennai");
		
		WebElement ClearCity  = driver.findElement(By.name("pre_city1"));  
		ClearCity .clear();
		
		// Taluk
		
		WebElement Entertaluk  = driver.findElement(By.name("pre_country1"));  //Default Address  : Empty
		Entertaluk .sendKeys("Poonthamalee");
		
		WebElement Cleartaluk  = driver.findElement(By.name("pre_country1"));  
		Cleartaluk .clear();
		
		// Enter Pincode
		
		WebElement Clearpincode  = driver.findElement(By.name("pre_pincode1"));  
		Clearpincode .clear();
		
		WebElement EnterPincode  = driver.findElement(By.name("pre_pincode1"));  //Default Address  : 608 303
		EnterPincode .sendKeys("608 303");
		
		// Enter District  // Error District change to state
		
		WebElement ClearDistrict  = driver.findElement(By.name("pre_state1"));  
		ClearDistrict .clear();
		
		WebElement EnterDistrict  = driver.findElement(By.name("pre_state1"));  //Default Address  : TAMIL NADU
		EnterDistrict .sendKeys("TAMIL NADU");
		
		// Enter  SMS Mobile No.
		
		WebElement ClearMobileno  = driver.findElement(By.name("pre_mobile1"));  
		ClearMobileno .clear();
		
		WebElement EnterMobileno  = driver.findElement(By.name("pre_mobile1"));  //Default phone  : 9626278292
		EnterMobileno .sendKeys("9626278292");
		
		// Enter Fathers Phone
		
		WebElement Clearfatherphone  = driver.findElement(By.name("pre_contactno1"));  
		Clearfatherphone .clear();
		
		WebElement Enterfatherphone  = driver.findElement(By.name("pre_contactno1"));  //Default phone  : 9626278292
		Enterfatherphone .sendKeys("9626278292");
		
		// Enter Mothers Phone
		
		WebElement Clearmotherphone  = driver.findElement(By.name("pre_contactno2"));  
		Clearmotherphone .clear();
		
		WebElement Entermotherphone  = driver.findElement(By.name("pre_contactno2"));  //Default phone  : 9626278292
		Entermotherphone .sendKeys("9626278292");
		
		// enter Home Landline
		
		WebElement Enterhomelandline  = driver.findElement(By.name("pre_phno1"));  //Default home landline  : Empty
		Enterhomelandline .sendKeys("0444-326545");
		
		WebElement Clearhomelandline  = driver.findElement(By.name("pre_phno1"));  
		Clearhomelandline .clear();
		
		// Enter E-mail
		
		WebElement EnterEmail  = driver.findElement(By.name("pre_resno1"));  //Default e mail  : Empty
		EnterEmail .sendKeys("asdkjkh@gmail.com");
		
		WebElement ClearEmail  = driver.findElement(By.name("pre_resno1"));  
		ClearEmail .clear();
		
	}
	
	@Test(dependsOnMethods="PresentAddress")
	
	public void  PermanentAddress(){
		// Permanent Address Details  // Default checkbox unclicked
		
		// Same as Present Address Detail Click Checkbox
		
		WebElement ClickCheckbox  = driver.findElement(By.name("sameaddress"));  
		ClickCheckbox.click();
		
		// Different  Permanent Address
		
		WebElement UnclickCheckbox  = driver.findElement(By.name("sameaddress"));  
		UnclickCheckbox.click();
		
		WebElement EnterAddressline  = driver.findElement(By.name("pre_address"));  //Default Address  : Empty
		EnterAddressline .sendKeys("502 RAHMANIYA STREET, V. KULAKKUDI, LALPET");
		
		WebElement ClearAddressline  = driver.findElement(By.name("pre_address"));  
		ClearAddressline .clear();
		
		// City
		
		WebElement EnterCity  = driver.findElement(By.name("pre_city"));  //Default Address  : Empty
		EnterCity .sendKeys("Chennai");
		
		WebElement ClearCity  = driver.findElement(By.name("pre_city"));  
		ClearCity .clear();
		
		// Taluk
		
		WebElement Entertaluk  = driver.findElement(By.name("pre_country"));  //Default Address  : Empty
		Entertaluk .sendKeys("Poonthamalee");
		
		WebElement Cleartaluk  = driver.findElement(By.name("pre_country"));  
		Cleartaluk .clear();
		
		// Enter Pincode
		
		WebElement EnterPincode  = driver.findElement(By.name("pre_pincode"));  //Default Address  : Empty
		EnterPincode .sendKeys("608 303");
		
		WebElement Clearpincode  = driver.findElement(By.name("pre_pincode"));  
		Clearpincode .clear();
		
		// Enter District // Error District change to state
		
		WebElement EnterDistrict  = driver.findElement(By.name("pre_state"));  //Default Address  : Empty
		EnterDistrict .sendKeys("TAMIL NADU");
		
		WebElement ClearDistrict  = driver.findElement(By.name("pre_state"));  
		ClearDistrict .clear();
		
		// Enter  SMS Mobile No.
				
		WebElement EnterMobileno  = driver.findElement(By.name("pre_mobile"));  //Default phone  : empty
		EnterMobileno .sendKeys("9626278292");
		
		WebElement ClearMobileno  = driver.findElement(By.name("pre_mobile"));  
		ClearMobileno .clear();
		
		// Enter Fathers Phone
		
		WebElement Clearfatherphone  = driver.findElement(By.name("pre_contactno"));  
		Clearfatherphone .clear();
		
		WebElement Enterfatherphone  = driver.findElement(By.name("pre_contactno"));  //Default phone  : 9626278292
		Enterfatherphone .sendKeys("9626278292");
		
		// Enter Mothers Phone
		
		WebElement Clearmotherphone  = driver.findElement(By.name("pre_contactno3"));  
		Clearmotherphone .clear();
		
		WebElement Entermotherphone  = driver.findElement(By.name("pre_contactno3"));  //Default phone  : 9626278292
		Entermotherphone .sendKeys("9626278292");
		
		// enter Home Landline
		
		WebElement Enterhomelandline  = driver.findElement(By.name("pre_phno"));  //Default home landline  : Empty
		Enterhomelandline .sendKeys("0444-326545");
		
		WebElement Clearhomelandline  = driver.findElement(By.name("pre_phno"));  
		Clearhomelandline .clear();
		
		// Enter E-mail
		
		WebElement EnterEmail  = driver.findElement(By.name("pre_resno2"));  //Default e mail  : Empty
		EnterEmail .sendKeys("asdkjkh@gmail.com");
		
		WebElement ClearEmail  = driver.findElement(By.name("pre_resno2")); 
		ClearEmail .clear();
		
	}
	
	@Test(dependsOnMethods="PermanentAddress")
	
	public void OtherDetails(){
		
		// Enter Higher Personality
		
		WebElement EnterHigherPersonality  = driver.findElement(By.name("pre_current_result2"));  //Default e mail  : Empty
		EnterHigherPersonality .sendKeys("iuryistujhfd");
		
		WebElement ClearHigherPersonality  = driver.findElement(By.name("pre_current_result2")); 
		ClearHigherPersonality .clear();
		
		// Enter Health Problem If Any
		
		WebElement EnterHealthProblemIfAny  = driver.findElement(By.name("pre_current_class3"));  //Default e mail  : Empty
		EnterHealthProblemIfAny .sendKeys("no");
		
		WebElement ClearHealthProblemIfAny  = driver.findElement(By.name("pre_current_class3")); 
		ClearHealthProblemIfAny .clear();
		
		// Enter Extra Curricular
		
		WebElement EnterExtraCurricular  = driver.findElement(By.name("pre_current_percentage3"));  //Default e mail  : Empty
		EnterExtraCurricular .sendKeys("no");
		
		WebElement ClearExtraCurricular  = driver.findElement(By.name("pre_current_percentage3")); 
		ClearExtraCurricular .clear();
		
		// Select Physical Handicapped
		
		Select SelectPhysicalHandicapped =new Select(driver.findElement(By.name("es_econbackward5")));  
		SelectPhysicalHandicapped.selectByVisibleText("Yes");
		
		Select SelectPhysicalHandicapped1 =new Select(driver.findElement(By.name("es_econbackward5")));  
		SelectPhysicalHandicapped1.selectByVisibleText("No");
		
	}
	
	@Test(dependsOnMethods="OtherDetails")
	
	public void TransportDetails(){
		// Transport Details     // Bus Transport Click Checkbox
		
		WebElement ClickCheckbox  = driver.findElement(By.name("transport"));  
		ClickCheckbox.click();
		
		// Select Route / Board
		
		Select SelectRouteBoard =new Select(driver.findElement(By.name("boardid")));  
		SelectRouteBoard.selectByVisibleText("Select Route/Board");
		
		// select Other Transport    // Error Click bus transport checkbox disable other transport options
		
		Select selectotherTransport =new Select(driver.findElement(By.name("pre_physical_details")));  
		selectotherTransport.selectByVisibleText("Cycle");
		
		Select selectotherTransport1 =new Select(driver.findElement(By.name("pre_physical_details")));  
		selectotherTransport1.selectByVisibleText("Bike");
		
		Select selectotherTransport11 =new Select(driver.findElement(By.name("pre_physical_details")));  
		selectotherTransport11.selectByVisibleText("Other");
	}
	
	@Test(dependsOnMethods="TransportDetails")
	
	public void DocumentAttachments(){
		
		// select Transfer Certificate
		
		Select selectTransferCertificate =new Select(driver.findElement(By.name("es_econbackward")));  
		selectTransferCertificate.selectByVisibleText("Yes");
		
		Select selectTransferCertificate1 =new Select(driver.findElement(By.name("es_econbackward")));  
		selectTransferCertificate1.selectByVisibleText("No");
		
		// Select DOB Certificate
		
		Select SelectDOBCertificate =new Select(driver.findElement(By.name("es_econbackward1")));  
		SelectDOBCertificate.selectByVisibleText("Yes");
		
		Select SelectDOBCertificate1 =new Select(driver.findElement(By.name("es_econbackward1")));  
		SelectDOBCertificate1.selectByVisibleText("No");
		
		// Select Community certificate
		
		Select SelectCommunitycertificate =new Select(driver.findElement(By.name("es_econbackward2")));  
		SelectCommunitycertificate.selectByVisibleText("Yes");
		
		Select SelectCommunitycertificate1 =new Select(driver.findElement(By.name("es_econbackward2")));  
		SelectCommunitycertificate1.selectByVisibleText("No");
		
		// Select Aadhar Card
		
		Select SelectAadharCard =new Select(driver.findElement(By.name("es_econbackward3")));  
		SelectAadharCard.selectByVisibleText("Yes");
		
		Select SelectAadharCard1 =new Select(driver.findElement(By.name("es_econbackward3")));  
		SelectAadharCard1.selectByVisibleText("No");
	}
	
	@Test(dependsOnMethods="DocumentAttachments")
	
	public void StudentPhotoandStatus(){
		// Upload Photo
		
		WebElement choosephoto = driver.findElement(By.name("pre_image"));
		choosephoto.sendKeys("C:\\Users\\KAVINESH\\Downloads\\img-01.png");
		
		// Status
		
		Select SelectStatus =new Select(driver.findElement(By.name("pre_status")));  
		SelectStatus.selectByVisibleText("Inactive");
		
		Select SelectStatus1 =new Select(driver.findElement(By.name("pre_status")));  
		SelectStatus1.selectByVisibleText("Active");
		
		String MainWindow = driver.getWindowHandle();
		
		WebElement Print = driver.findElement(By.name("Submit"));
		Print.click();
		
		Set<String> Handle = driver.getWindowHandles();
		
		for (String ChildWindow : Handle) {
			driver.switchTo().window(ChildWindow);
		}
		driver.close();
		driver.switchTo().window(MainWindow);
		
		WebElement Update = driver.findElement(By.name("update"));
		Update.click();
		
	}
		
	
}
