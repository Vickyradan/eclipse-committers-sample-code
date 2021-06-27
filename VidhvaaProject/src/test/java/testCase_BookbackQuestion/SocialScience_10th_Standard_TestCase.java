package testCase_BookbackQuestion;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_BookbackQuestion.SocialScience_10th_Standard;
public class SocialScience_10th_Standard_TestCase extends CommonFunction{

	public void SocialScience_10th_Standardfunction() {
		
		PageFactory.initElements(driver, SocialScience_10th_Standard.class);
		WebElement element1=SocialScience_10th_Standard.socialscience;
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", element1);
		
		LOG.info("10th Standard SocialScience clicked");
		
		WebElement element=SocialScience_10th_Standard.Clickclosepopup;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

		LOG.info("Subscription Popup Closed");
	}
	

	@Test
	public void  SocialScience_10th_Standard() throws InterruptedException {

		LOG.info("10th Standard SocialScience function running");
		SocialScience_10th_Standardfunction();
		LOG.info("10th Standard SocialScience function finished");
	}
}
