package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.PracticeQuestion;

public class PracticeQustion_TestCase extends CommonFunction{

	
	
	public void  PracticeQustionFunction() {
		PageFactory.initElements(driver, PracticeQuestion.class);
		PracticeQuestion.ClickGeneralStudies.click();
		LOG.info("GeneralStudies clicked");
		
		PracticeQuestion.practicequestions.click();
		LOG.info("PracticeQuestion clicked");
		
		PracticeQuestion.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	@Test(priority=36)
	public void PracticeQustion() {
		
		LOG.info("PracticeQuestion function running");
		PracticeQustionFunction();
		LOG.info("PracticeQuestion function finished");
	}
}
