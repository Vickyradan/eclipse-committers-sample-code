package testCase_VidhvaasModelQuestions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_VidhvaasModelQuestions.ModelQuestions_4;
public class ModelQuestions_4_TestCasee extends CommonFunction{

	
	public void ModelQuestions_4Function() {
		
		PageFactory.initElements(driver, ModelQuestions_4.class);
		
		WebElement element1=ModelQuestions_4.question4;
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", element1);
		LOG.info("Questions_4 clicked");
		
		WebElement element=ModelQuestions_4.Clickclosepopup;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
		LOG.info("Subscription Popup Closed");
	}

	@Test
	public void  ModelQuestions_4() throws InterruptedException {
		
		LOG.info("Questions_4 function running");
		ModelQuestions_4Function();
	
		LOG.info("Questions_4 function finished");
	}
}
