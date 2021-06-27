package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.FormCompoundWords;

public class FormCompoundWords_TestCase extends CommonFunction{

	
	public void FormCompoundWordsfunction(){
		PageFactory.initElements(driver, FormCompoundWords.class);
		FormCompoundWords.ClickFormCompoundWords.click();
		LOG.info("Form Compound Words clicked");

		WebElement element = FormCompoundWords.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");

	}


	@Test
	public void FormCompoundWords()  {
		
		LOG.info("Form Compound Words function running");
		FormCompoundWordsfunction();
		LOG.info("Form Compound Words function finished");
		driver.navigate().back();
	}
}
