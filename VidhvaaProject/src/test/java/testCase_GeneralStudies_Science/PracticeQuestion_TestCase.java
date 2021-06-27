package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.PracticeQuestion;
public class PracticeQuestion_TestCase extends CommonFunction {

	public void PracticeQuestionFunction(){
		
		PageFactory.initElements(driver, PracticeQuestion.class);
		PracticeQuestion.ClickGeneralStudies.click();
		LOG.info("GeneralStudies clicked");
		
		PracticeQuestion.practicequestions.click();
		LOG.info("PracticeQuestion clicked");
		
		PracticeQuestion.ClickSubscribe.click();
		LOG.info("close Popup clicked");
		
	}
	
	@Test
	public void PracticeQuestion() {

		LOG.info("PracticeQuestion function running");
		PracticeQuestionFunction();
		LOG.info("PracticeQuestion function finished");		
	}
}
