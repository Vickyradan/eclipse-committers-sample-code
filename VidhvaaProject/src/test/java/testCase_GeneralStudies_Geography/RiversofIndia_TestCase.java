package testCase_GeneralStudies_Geography;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Geography.RiversofIndia;
public class RiversofIndia_TestCase extends CommonFunction{

	public void RiversofIndiafunction() {
		
		PageFactory.initElements(driver, RiversofIndia.class);
		RiversofIndia.ClickRiversofIndia.click();
		LOG.info("Rivers of India clicked");
		
		WebElement element = RiversofIndia.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	@Test
	public void RiversofIndia() {
		
		LOG.info("Rivers of India function running");
		RiversofIndiafunction();
		LOG.info("Rivers of India function finished");
		
		driver.navigate().back();

	}
}
