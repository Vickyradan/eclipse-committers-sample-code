package testCase_GeneralStudies_Politics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Politics.FundamentalRights;
public class FundamentalRights_TestCase extends CommonFunction{

	public void FundamentalRightsfunction() {
		
		PageFactory.initElements(driver, FundamentalRights.class);
		
		WebElement element1= FundamentalRights.ClickFundamentalRights;
		
		JavascriptExecutor js1= (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", element1);
		LOG.info("Fundamental Rights clicked");
		
		
		WebElement element = FundamentalRights.ClickSampleMaterial;
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	
	@Test
	public void FundamentalRights() throws InterruptedException {

		LOG.info("Fundamental Rights function running");
		FundamentalRightsfunction();
		LOG.info("Fundamental Rights function finished");
		
		driver.navigate().back();

	}
}
