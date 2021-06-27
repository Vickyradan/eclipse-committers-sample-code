package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.QuestionTag;

public class QuestionTag_TestCase extends CommonFunction{

	
	public void QuestionTagfunction(){
		PageFactory.initElements(driver, QuestionTag.class);
		QuestionTag.ClickQuestionTag.click();
		LOG.info("Question Tag clicked");

		WebElement element = QuestionTag.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");

	}


	@Test
	public void QuestionTag()  {
		
		LOG.info("Question Tag running");
		QuestionTagfunction();
		LOG.info("Preposition function finished");
		driver.navigate().back();
	}
}
