package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.AdventofEuropeans;
public class AdventofEuropeans_TestCase extends CommonFunction{

	public void AdventofEuropeansFunction() {
		
		PageFactory.initElements(driver, AdventofEuropeans.class);
		AdventofEuropeans.clickAdventofEuropeans.click();
		LOG.info("Advent of Europeans clicked");
		
		AdventofEuropeans.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	
	@Test(priority=18)
	public void AdventofEuropeans(){
		
		LOG.info("Advent of Europeans function running");
		AdventofEuropeansFunction();
		LOG.info("Advent of Europeans function finished");
		
		driver.navigate().back();
	}
}
