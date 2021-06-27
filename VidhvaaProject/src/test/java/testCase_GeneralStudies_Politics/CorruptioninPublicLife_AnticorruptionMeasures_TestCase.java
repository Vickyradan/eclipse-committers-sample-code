package testCase_GeneralStudies_Politics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Politics.CorruptioninPublicLife_AnticorruptionMeasures;
public class CorruptioninPublicLife_AnticorruptionMeasures_TestCase extends CommonFunction{

	public void CorruptioninPublicLife_AnticorruptionMeasuresfunction() {
		
		PageFactory.initElements(driver, CorruptioninPublicLife_AnticorruptionMeasures.class);
		CorruptioninPublicLife_AnticorruptionMeasures.ClickCorruptioninPublicLife_AnticorruptionMeasures.click();
		LOG.info("Corruption in Public Life - Anticorruption Measures clicked");
		
		WebElement element = CorruptioninPublicLife_AnticorruptionMeasures.ClickSampleMaterial;
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	@Test
	public void  CorruptioninPublicLife_AnticorruptionMeasures() throws InterruptedException {

		LOG.info("Corruption in Public Life - Anticorruption Measures function running");
		CorruptioninPublicLife_AnticorruptionMeasuresfunction();
		LOG.info("Corruption in Public Life - Anticorruption Measures function finished");
		
		driver.navigate().back();
	}
}
