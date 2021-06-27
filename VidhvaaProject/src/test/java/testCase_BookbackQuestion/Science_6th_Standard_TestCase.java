package testCase_BookbackQuestion;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import objectDetails_BookbackQuestion.Science_6th_Standard;
public class Science_6th_Standard_TestCase extends CommonFunction {

	
	public void LoginFunction(){

		PageFactory.initElements(driver, Login.class);

		Login.ClickLogin.click();
		Login.Moblie.sendKeys(property.getProperty("MobileNumber"));
		Login.email.sendKeys(property.getProperty("Email"));
		Login.Submit.click();

	}
	
	
	public void Science_6th_Standardfunction() {
		
		PageFactory.initElements(driver, Science_6th_Standard.class);
		Science_6th_Standard.BookBack.click();
		LOG.info("BookBack Question Clicked");
		Science_6th_Standard.science.click();
		LOG.info("6th Standard Science Clicked");
		
		WebElement element=Science_6th_Standard.Clickclosepopup;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
		LOG.info("Subscription Popup Closed");
	}
	
	@Test
	public void  Science_6th_Standard() throws InterruptedException {
		
		LoginFunction();
		LOG.info("6th Standard Science function running");
		Science_6th_Standardfunction();
		LOG.info("6th Standard Science function Finished");
		
	}
}
