package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.CharacterQuotesandImportantLines;

public class CharacterQuotesandImportantLines_TestCase extends CommonFunction{

	public void CharacterQuotesandImportantLinesfunction(){
		PageFactory.initElements(driver, CharacterQuotesandImportantLines.class);
		CharacterQuotesandImportantLines.ClickCharacterQuotesandImportantLines.click();
		LOG.info("Character, Quotes and Important Lines clicked");
		
		WebElement element = CharacterQuotesandImportantLines.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void CharacterQuotesandImportantLines()  {

		LOG.info("Character, Quotes and Important Lines function running");
		CharacterQuotesandImportantLinesfunction();
		LOG.info("Character, Quotes and Important Lines function finished");
		
		driver.navigate().back();

	}
}
