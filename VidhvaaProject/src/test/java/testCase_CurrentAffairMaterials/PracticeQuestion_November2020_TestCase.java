package testCase_CurrentAffairMaterials;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_CurrentAffairMaterials.PracticeQuestion_November2020;
public class PracticeQuestion_November2020_TestCase extends CommonFunction{
	
	public void PracticeQuestionFunction() {
		PageFactory.initElements(driver, PracticeQuestion_November2020.class);
		
		
		WebElement element1=PracticeQuestion_November2020.Clickquestion;
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", element1);
		
		LOG.info("November2020 PracticeQuestion clicked");
		
		WebElement element=PracticeQuestion_November2020.Clickclosepopup;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
		LOG.info("Subscription Popup Closed");
		
	}
	

	@Test
	public void PracticeQuestion_November2020() throws InterruptedException {
		
		LOG.info("November2020 PracticeQuestion function running");
		PracticeQuestionFunction();
		LOG.info("November2020 PracticeQuestion function finished");
		
	}

}
