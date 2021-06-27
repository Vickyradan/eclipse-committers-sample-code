package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.PrefixandSuffix;

public class PrefixandSuffix_TestCase extends CommonFunction{

	
	public void PrefixandSuffixfunction(){
		PageFactory.initElements(driver, PrefixandSuffix.class);
		PrefixandSuffix.ClickPrefixandSuffix.click();
		LOG.info("Prefix and Suffix clicked");

		WebElement element = PrefixandSuffix.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");

	}


	@Test
	public void PrefixandSuffix()  {
		
		LOG.info("Prefix and Suffix function running");
		PrefixandSuffixfunction();
		LOG.info("Prefix and Suffix function finished");
		driver.navigate().back();
	}
}
