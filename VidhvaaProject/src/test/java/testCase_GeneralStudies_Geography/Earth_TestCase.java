package testCase_GeneralStudies_Geography;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Geography.Earth;
public class Earth_TestCase extends CommonFunction{

	public void Earthfunction() {
		
		PageFactory.initElements(driver, Earth.class);
		Earth.ClickEarth.click();
		LOG.info("Earth clicked");
		
		WebElement element = Earth.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	
	@Test
	public void Earth() {
		
		LOG.info("Earth function running");
		Earthfunction();
		LOG.info("Earth function finished");
		
		driver.navigate().back();

	}
}
