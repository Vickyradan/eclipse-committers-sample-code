package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.Comprehension;

public class Comprehension_TestCase extends CommonFunction{

	
	
	public void Comprehensionfunction(){
		PageFactory.initElements(driver, Comprehension.class);
		Comprehension.ClickComprehension.click();
		LOG.info("Comprehension clicked");

		WebElement element = Comprehension.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");

	}


	@Test
	public void Comprehension()  {
		
		LOG.info("Comprehension function running");
		Comprehensionfunction();
		LOG.info("Comprehension function finished");
		driver.navigate().back();
	}
}
