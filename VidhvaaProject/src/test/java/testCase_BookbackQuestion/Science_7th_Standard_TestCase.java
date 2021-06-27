package testCase_BookbackQuestion;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_BookbackQuestion.Science_7th_Standard;
public class Science_7th_Standard_TestCase extends CommonFunction{

	
	
	public void Science_7th_Standardfunction() {
		
		PageFactory.initElements(driver, Science_7th_Standard.class);

		WebElement element1=Science_7th_Standard.science;
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", element1);
		
		LOG.info("7th_Standard science clicked");
		WebElement element=Science_7th_Standard.Clickclosepopup;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
		LOG.info("Subscription Popup Closed");
		
	}
	
	@Test
	public void  Science_7th_Standard() throws InterruptedException {

		LOG.info("7th Standard Science function running");
		Science_7th_Standardfunction();
		LOG.info("7th Standard Science function Finished");
	}
}
