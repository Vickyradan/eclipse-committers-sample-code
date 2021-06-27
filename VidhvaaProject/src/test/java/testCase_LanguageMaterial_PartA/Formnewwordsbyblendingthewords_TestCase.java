package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.Formnewwordsbyblendingthewords;

public class Formnewwordsbyblendingthewords_TestCase extends CommonFunction{

	
	public void Formnewwordsbyblendingthewordsfunction(){
		PageFactory.initElements(driver, Formnewwordsbyblendingthewords.class);
		Formnewwordsbyblendingthewords.ClickFormnewwordsbyblendingthewords.click();
		LOG.info("Form new words by blending the words clicked");

		WebElement element = Formnewwordsbyblendingthewords.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");

	}


	@Test
	public void Formnewwordsbyblendingthewords()  {
		
		LOG.info("Form new words by blending the words function running");
		Formnewwordsbyblendingthewordsfunction();
		LOG.info("Form new words by blending the words function finished");
		driver.navigate().back();
	}
}
