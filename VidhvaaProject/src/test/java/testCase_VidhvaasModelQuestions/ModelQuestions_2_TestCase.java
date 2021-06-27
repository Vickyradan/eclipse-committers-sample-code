package testCase_VidhvaasModelQuestions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_VidhvaasModelQuestions.ModelQuestions_2;
public class ModelQuestions_2_TestCase extends CommonFunction{

	public void ModelQuestions_2Function() {
		
		PageFactory.initElements(driver, ModelQuestions_2.class);
	
		WebElement element1=ModelQuestions_2.question2;
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", element1);
		LOG.info("Questions_2 clicked");
		
		WebElement element=ModelQuestions_2.Clickclosepopup;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
		LOG.info("Subscription Popup Closed");
	}
	
	
	@Test
	public void  ModelQuestions_2() throws InterruptedException {
		
		LOG.info("Questions_2 function running");
		ModelQuestions_2Function();
	
		LOG.info("Questions_2 function finished");
	}
}
