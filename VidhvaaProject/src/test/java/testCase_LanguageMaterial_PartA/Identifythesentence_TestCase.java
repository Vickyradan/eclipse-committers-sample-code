package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.Identifythesentence;

public class Identifythesentence_TestCase extends CommonFunction{

	public void Identifythesentencefunction(){
		PageFactory.initElements(driver, Identifythesentence.class);
		Identifythesentence.ClickIdentifythesentence.click();
		LOG.info("Identify the sentence clicked");

		WebElement element = Identifythesentence.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");

	}


	@Test
	public void Identifythesentence()  {
		
		LOG.info("Identify the sentence function running");
		Identifythesentencefunction();
		LOG.info("Identify the sentence function finished");
		driver.navigate().back();
	}
}
