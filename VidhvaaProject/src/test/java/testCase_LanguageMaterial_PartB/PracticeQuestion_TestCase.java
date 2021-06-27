package testCase_LanguageMaterial_PartB;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartB.PracticeQuestion;

public class PracticeQuestion_TestCase extends CommonFunction{

	public void PracticeQuestionfunction() {
		PageFactory.initElements(driver, PracticeQuestion.class);
		PracticeQuestion.ClickLanguageMaterial.click();
		LOG.info("LanguageMaterial clicked");
		PracticeQuestion.clickPracticeQuestion.click();
		LOG.info("PracticeQuestion clicked");
		WebElement element = PracticeQuestion.Clickclosepopup;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
		LOG.info("Popup closed");
		
	}
	
	@Test
	public void PracticeQuestion() throws InterruptedException {

		LOG.info("PracticeQuestion function running");
		PracticeQuestionfunction();
		LOG.info("PracticeQuestion function finished");
		driver.navigate().back();

	}
}
