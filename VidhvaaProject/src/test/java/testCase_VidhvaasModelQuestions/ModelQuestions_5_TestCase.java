package testCase_VidhvaasModelQuestions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_VidhvaasModelQuestions.ModelQuestions_5;
public class ModelQuestions_5_TestCase extends CommonFunction{

	
	public void ModelQuestions_5Function() {
		PageFactory.initElements(driver, ModelQuestions_5.class);
		
		WebElement element1=ModelQuestions_5.question5;
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", element1);
		LOG.info("Questions_5 clicked");
		
		WebElement element=ModelQuestions_5.Clickclosepopup;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
		LOG.info("Subscription Popup Closed");
	}
	
	
	@Test
	public void  ModelQuestions_5() throws InterruptedException {
		
		LOG.info("Questions_5 function running");
		ModelQuestions_5Function();
		LOG.info("Questions_5 function finished");
	}
}
