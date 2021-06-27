package testCase_VidhvaasModelQuestions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import  objectDetails_VidhvaasModelQuestions.ModelQuestions_3;
public class ModelQuestions_3_TestCase extends CommonFunction{

	public void ModelQuestions_3Function() {
		PageFactory.initElements(driver, ModelQuestions_3.class);
	
		WebElement element1=ModelQuestions_3.question3;
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", element1);
		LOG.info("Questions_3 clicked");
		
		WebElement element=ModelQuestions_3.Clickclosepopup;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
		LOG.info("Subscription Popup Closed");
	}
	

	@Test
	public void  ModelQuestions_3() throws InterruptedException {
		
		LOG.info("Questions_3 function running");
		ModelQuestions_3Function();
		LOG.info("Questions_3 function finished");
	}
}
