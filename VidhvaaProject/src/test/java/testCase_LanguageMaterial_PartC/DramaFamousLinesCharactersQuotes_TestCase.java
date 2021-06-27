package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.DramaFamousLinesCharactersQuotes;

public class DramaFamousLinesCharactersQuotes_TestCase extends CommonFunction{

	
	public void DramaFamousLinesCharactersQuotesfunction(){
		PageFactory.initElements(driver, DramaFamousLinesCharactersQuotes.class);
		DramaFamousLinesCharactersQuotes.ClickDramaFamousLinesCharactersQuotes.click();
		LOG.info("Drama Famous Lines, Characters, Quotes clicked");
		
		WebElement element = DramaFamousLinesCharactersQuotes.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void DramaFamousLinesCharactersQuotes()  {

		LOG.info("Drama Famous Lines, Characters, Quotes function running");
		DramaFamousLinesCharactersQuotesfunction();
		LOG.info("Drama Famous Lines, Characters, Quotes function finished");
		
		driver.navigate().back();

	}
}
