package testCase_PreviousYearQuestionPapers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_PreviousYearQuestionPapers.Question_11_2016;
public class Question_11_2016_TestCase extends CommonFunction {

	public void Question_11_2016Function() {

		PageFactory.initElements(driver, Question_11_2016.class);
	
		WebElement element1=Question_11_2016.question11;
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", element1);
		LOG.info("Question_11_2016 question11 clicked");
		
		WebElement element=Question_11_2016.Clickclosepopup;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
		LOG.info("Subscription Popup Closed");
	}


	@Test
	public void  Question_11_2016() throws InterruptedException {

		LOG.info("Question_11_2016 function running");
		Question_11_2016Function();
		LOG.info("Question_11_2016 function finished");
	}


}
