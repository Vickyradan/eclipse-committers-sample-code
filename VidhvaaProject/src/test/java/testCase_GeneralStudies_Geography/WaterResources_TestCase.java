package testCase_GeneralStudies_Geography;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Geography.WaterResources;
public class WaterResources_TestCase extends CommonFunction{

	
	public void WaterResourcesfunction() {
		
		PageFactory.initElements(driver, WaterResources.class);
		WaterResources.ClickWaterResources.click();
		LOG.info("Water Resources clicked");
		
		WebElement element = WaterResources.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	@Test
	public void WaterResources() {
		
		LOG.info("Water Resources function running");
		WaterResourcesfunction();
		LOG.info("Water Resources function finished");
		
		driver.navigate().back();

	}
}
