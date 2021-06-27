package testCase_PreviousYearQuestionPapers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import objectDetails_PreviousYearQuestionPapers.Question_1_2016;
public class Question_1_2016_TestCase extends CommonFunction{

	
	public void LoginFunction(){

		PageFactory.initElements(driver, Login.class);

		Login.ClickLogin.click();
		Login.Moblie.sendKeys(property.getProperty("MobileNumber"));
		Login.email.sendKeys(property.getProperty("Email"));
		Login.Submit.click();

	}
	
	public void Question_1_2016Function() {
		
		PageFactory.initElements(driver, Question_1_2016.class);
		Question_1_2016.PreviousYearQuestionPapers.click();
		LOG.info("Previous Year QuestionPapers clicked");
		Question_1_2016.question1.click();
		LOG.info("Question_1_2016 question1 clicked");
		
		WebElement element=Question_1_2016.Clickclosepopup;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
		LOG.info("Subscription Popup Closed");
	}
	
	
	
	@Test
	public void  Question_1_2016() throws InterruptedException {
		
		LoginFunction();
		LOG.info("Question_1_2016 function running");
		Question_1_2016Function();
		LOG.info("Question_1_2016 function finished");
	
	}
}
