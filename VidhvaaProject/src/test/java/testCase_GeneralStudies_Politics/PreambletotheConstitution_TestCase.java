package testCase_GeneralStudies_Politics;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Politics.PreambletotheConstitution;
public class PreambletotheConstitution_TestCase extends CommonFunction{

	public void PreambletotheConstitutionfunction() {
		
		PageFactory.initElements(driver, PreambletotheConstitution.class);
		PreambletotheConstitution.ClickPreambletotheConstitution.click();
		LOG.info("Preamble to the Constitution clicked");
		
		WebElement element = PreambletotheConstitution.ClickSampleMaterial;
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	
	@Test
	public void PreambletotheConstitution() throws InterruptedException {

		LOG.info("Preamble to the Constitution function running");
		PreambletotheConstitutionfunction();
		LOG.info("Preamble to the Constitution function finished");
		driver.navigate().back();

	}
}
