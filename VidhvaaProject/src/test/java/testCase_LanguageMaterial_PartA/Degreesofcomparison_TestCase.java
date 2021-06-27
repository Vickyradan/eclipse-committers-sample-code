package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.Degreesofcomparison;

public class Degreesofcomparison_TestCase extends CommonFunction{

	
	public void Degreesofcomparisonfunction(){
		PageFactory.initElements(driver, Degreesofcomparison.class);
		Degreesofcomparison.ClickDegreesofcomparison.click();
		LOG.info("Degrees of comparison clicked");

		WebElement element = Degreesofcomparison.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");


	}


	@Test
	public void Degreesofcomparison()  {
		
		LOG.info("Degrees of comparison function running");
		Degreesofcomparisonfunction();
		LOG.info("Degrees of comparison function finished");
		driver.navigate().back();
	}
}
