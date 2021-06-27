package testCase_GeneralStudies_Geography;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Geography.Soils;
public class Soils_TestCase extends CommonFunction{

	public void Soilsfunction() {
		
		PageFactory.initElements(driver, Soils.class);
		Soils.ClickSoils.click();
		LOG.info("Soils clicked");
		
		WebElement element = Soils.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	
	@Test
	public void Soils() {
		
		LOG.info("Soils function running");
		Soilsfunction();
		LOG.info("Soils function finished");
		
		driver.navigate().back();

	}
}
