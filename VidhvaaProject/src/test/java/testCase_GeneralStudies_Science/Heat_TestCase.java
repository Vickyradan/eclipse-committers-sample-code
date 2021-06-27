package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.Heat;
public class Heat_TestCase extends CommonFunction{


	public void HeatFunction() {
		
		PageFactory.initElements(driver, Heat.class);
		Heat.Heat.click();
		LOG.info("Heat clicked");
		
		Heat.Subscribe.click();
		LOG.info("subscribe clicked");
	}
	
	@Test
	public void Heat() {
		
		LOG.info("Heat function running");
		HeatFunction();
		LOG.info("Heat function finished");
		driver.navigate().back();
	}
}
