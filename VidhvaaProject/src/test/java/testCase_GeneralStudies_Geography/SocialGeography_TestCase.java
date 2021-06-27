package testCase_GeneralStudies_Geography;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import  objectDetails_GeneralStudies_Geography.SocialGeography;
public class SocialGeography_TestCase extends CommonFunction{

	public void SocialGeographyfunction() {
		
		PageFactory.initElements(driver, SocialGeography.class);
		
		SocialGeography.ClickSocialGeography.click();
		LOG.info("Social Geography clicked");
		
		WebElement element = SocialGeography.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	@Test
	public void SocialGeography() {
		
		LOG.info("Social Geography function running");
		SocialGeographyfunction();
		LOG.info("Social Geography function finished");
		
		driver.navigate().back();

	}
}
