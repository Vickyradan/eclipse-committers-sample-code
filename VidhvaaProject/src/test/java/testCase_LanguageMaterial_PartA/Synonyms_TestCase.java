package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.Synonyms;

public class Synonyms_TestCase extends CommonFunction{

	
	public void Synonymsfunction(){
		PageFactory.initElements(driver, Synonyms.class);
		Synonyms.ClickSynonyms.click();
		LOG.info("Synonyms clicked");

		WebElement element = Synonyms.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");

	}


	@Test
	public void Synonyms()  {
		
		LOG.info("Synonyms function running");
		Synonymsfunction();
		LOG.info("Synonyms function running");
		driver.navigate().back();
	}
}
