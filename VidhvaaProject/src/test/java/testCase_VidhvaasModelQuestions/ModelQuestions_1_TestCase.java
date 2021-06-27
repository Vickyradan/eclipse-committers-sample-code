package testCase_VidhvaasModelQuestions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import objectDetails_VidhvaasModelQuestions.ModelQuestions_1;

public class ModelQuestions_1_TestCase extends CommonFunction{
	
	
	public void LoginFunction(){

		PageFactory.initElements(driver, Login.class);

		Login.ClickLogin.click();
		Login.Moblie.sendKeys(property.getProperty("MobileNumber"));
		Login.email.sendKeys(property.getProperty("Email"));
		Login.Submit.click();

	}
		
	public void  ModelQuestions_1Function() {
		
		PageFactory.initElements(driver, ModelQuestions_1.class);
		ModelQuestions_1.VidhvaaModelQuestion.click();
		LOG.info("VidhvaaModel Question clicked");
		ModelQuestions_1.question1.click();
		LOG.info("Questions_1 clicked");
		
		WebElement element=ModelQuestions_1.Clickclosepopup;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
		LOG.info("Subscription Popup Closed");
		
	}
	
	@Test
	public void  ModelQuestions_1() throws InterruptedException {
		
		LoginFunction();
		LOG.info("Questions_1 function running");
		ModelQuestions_1Function();
		LOG.info("Questions_1 function finished");
	
	}
	

}
