package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;

public class PracticeQuestion_TestCase extends CommonFunction {

	public void PracticeQuestionFunction() {
		
		PageFactory.initElements(driver, objectDetails_GeneralStudies_Mathematics.PracticeQuestion.class);
		objectDetails_GeneralStudies_Mathematics.PracticeQuestion.ClickGeneralStudies.click();
		LOG.info("GeneralStudies clicked");
		
		objectDetails_GeneralStudies_Mathematics.PracticeQuestion.practicequestions.click();
		LOG.info("PracticeQuestion clicked");
		
		objectDetails_GeneralStudies_Mathematics.PracticeQuestion.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	@Test
	public void PracticeQuestion() {

		LOG.info("PracticeQuestion function running");
		PracticeQuestionFunction();
		LOG.info("PracticeQuestion function finished");
				
	}
}
