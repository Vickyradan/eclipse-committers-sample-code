package testCase_PreviousYearQuestionPapers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import  objectDetails_PreviousYearQuestionPapers.Question_1_2018;
public class Question_1_2018_TestCase extends CommonFunction{

	public void Question_1_2018Function() {
		
		PageFactory.initElements(driver, Question_1_2018.class);
	
		WebElement element1=Question_1_2018.question1;
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", element1);
		LOG.info("Question_1_2018 question1 clicked");
		
		WebElement element=Question_1_2018.Clickclosepopup;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
		LOG.info("Subscription Popup Closed");
	}
	
	@Test
	public void  Question_1_2018() throws InterruptedException {

		LOG.info("Question_1_2018 function running");
		Question_1_2018Function();
		LOG.info("Question_1_2018 function finished");
	}
}
