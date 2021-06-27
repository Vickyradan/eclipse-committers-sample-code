package testCase_GeneralStudies_Economics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Economics.IndustrialGrowth;
public class IndustrialGrowth_TestCase extends CommonFunction{

	public void IndustrialGrowthfunction() {
		
		PageFactory.initElements(driver, IndustrialGrowth.class);
		IndustrialGrowth.ClickIndustrialGrowth.click();
		LOG.info("Industrial Growth clicked");
		
		WebElement element = IndustrialGrowth.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	

	@Test
	public void IndustrialGrowth() throws InterruptedException {

		LOG.info("Industrial Growth function running");
		IndustrialGrowthfunction();
		LOG.info("Industrial Growth function finished");
		
		driver.navigate().back();
	}
}
