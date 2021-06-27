package testCase_BookbackQuestion;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import  objectDetails_BookbackQuestion.Science_9th_Standard;
public class Science_9th_Standard_TestCase  extends CommonFunction{

	public void Science_9th_Standardfunction() {
		
		PageFactory.initElements(driver, Science_9th_Standard.class);
	
		WebElement element1=Science_9th_Standard.science;
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", element1);
		
		LOG.info("9th_Standard science clicked");

		WebElement element=Science_9th_Standard.Clickclosepopup;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

		LOG.info("Subscription Popup Closed");
	}
	
	
	@Test
	public void  Science_9th_Standard() throws InterruptedException {

		LOG.info("9th Standard Science function running");
		Science_9th_Standardfunction();
		LOG.info("9th Standard Science function finished");
	}
}
