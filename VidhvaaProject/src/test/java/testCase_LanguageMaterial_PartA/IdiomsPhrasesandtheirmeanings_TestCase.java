package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.IdiomsPhrasesandtheirmeanings;

public class IdiomsPhrasesandtheirmeanings_TestCase extends CommonFunction{

	
	public void IdiomsPhrasesandtheirmeaningsfunction(){
		PageFactory.initElements(driver, IdiomsPhrasesandtheirmeanings.class);
		IdiomsPhrasesandtheirmeanings.ClickIdiomsPhrasesandtheirmeanings.click();
		LOG.info("Idioms, Phrases and their meanings clicked");

		WebElement element = IdiomsPhrasesandtheirmeanings.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");

	}


	@Test
	public void IdiomsPhrasesandtheirmeanings()  {
		
		LOG.info("Idioms, Phrases and their meanings function running");
		IdiomsPhrasesandtheirmeaningsfunction();
		LOG.info("Idioms, Phrases and their meanings function finished");
		driver.navigate().back();
	}
}
