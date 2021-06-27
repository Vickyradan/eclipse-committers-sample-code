package testCase_GeneralStudies_Geography;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Geography.AdditionalInformation;
public class AdditionalInformation_TestCase extends CommonFunction{

	public void AdditionalInformationfunction() {
		
		PageFactory.initElements(driver, AdditionalInformation.class);
		
		AdditionalInformation.ClickAdditionalInformation.click();
		LOG.info("Additional Information clicked");
		
		WebElement element =AdditionalInformation.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	@Test
	public void AdditionalInformation() {
		
		LOG.info("Additional Information function running");
		AdditionalInformationfunction();
		LOG.info("Additional Information function finished");
		
		driver.navigate().back();

	}
}
