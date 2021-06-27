package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.Antonyms;

public class Antonyms_TestCase extends CommonFunction{

	
	public void Antonymsfunction(){
		PageFactory.initElements(driver, Antonyms.class);
		Antonyms.ClickAntonyms.click();
		LOG.info("Antonyms clicked");

		WebElement element = Antonyms.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");

	}


	@Test
	public void Antonyms()  {
		
		LOG.info("Antonyms function running");
		Antonymsfunction();
		LOG.info("Antonyms function finished");
		driver.navigate().back();
	}
}
