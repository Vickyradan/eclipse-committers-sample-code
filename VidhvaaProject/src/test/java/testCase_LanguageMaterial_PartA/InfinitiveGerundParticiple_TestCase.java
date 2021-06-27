package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.InfinitiveGerundParticiple;

public class InfinitiveGerundParticiple_TestCase extends CommonFunction{

	public void InfinitiveGerundParticiplefunction(){
		PageFactory.initElements(driver, InfinitiveGerundParticiple.class);
		InfinitiveGerundParticiple.ClickInfinitiveGerundParticiple.click();
		LOG.info("Infinitive, Gerund, Participle clicked");

		WebElement element = InfinitiveGerundParticiple.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");

	}


	@Test
	public void InfinitiveGerundParticiple()  {
		
		LOG.info("Infinitive, Gerund, Participle function running");
		InfinitiveGerundParticiplefunction();
		LOG.info("Infinitive, Gerund, Participle function finished");
		driver.navigate().back();
	}
}
