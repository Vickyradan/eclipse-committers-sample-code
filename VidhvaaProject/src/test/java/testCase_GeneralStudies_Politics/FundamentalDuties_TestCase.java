package testCase_GeneralStudies_Politics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Politics.FundamentalDuties;
public class FundamentalDuties_TestCase extends CommonFunction{

	
	public void FundamentalDutiesfunction() {
		
		PageFactory.initElements(driver, FundamentalDuties.class);
		FundamentalDuties.ClickFundamentalDuties.click();
		LOG.info("Fundamental Duties clicked");
		WebElement element = FundamentalDuties.ClickSampleMaterial;
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	@Test
	public void FundamentalDuties() throws InterruptedException {

		LOG.info("Fundamental Duties function running");
		FundamentalDutiesfunction();
		LOG.info("Fundamental Duties function finished");
		
		driver.navigate().back();

	}
}
