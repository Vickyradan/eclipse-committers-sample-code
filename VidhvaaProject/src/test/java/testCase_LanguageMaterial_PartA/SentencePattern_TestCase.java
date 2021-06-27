package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.SentencePattern;

public class SentencePattern_TestCase extends CommonFunction{

	
	public void SentencePatternfunction(){
		PageFactory.initElements(driver, SentencePattern.class);
		SentencePattern.ClickSentencePattern.click();
		LOG.info("Sentence Pattern clicked");

		WebElement element = SentencePattern.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");

	}


	@Test
	public void SentencePattern()  {
		LOG.info("Sentence Pattern function running");
		SentencePatternfunction();
		LOG.info("Sentence Pattern function finished");
		driver.navigate().back();
	}
}
