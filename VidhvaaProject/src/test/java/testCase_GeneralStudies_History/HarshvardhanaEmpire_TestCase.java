package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.HarshvardhanaEmpire;
public class HarshvardhanaEmpire_TestCase extends CommonFunction {

	public void HarshvardhanaEmpireFunction() {
		
		PageFactory.initElements(driver, HarshvardhanaEmpire.class);
		HarshvardhanaEmpire.clickHarshvardhanaEmpire.click();
		LOG.info("Harshvardhana Empire clicked");
		
		HarshvardhanaEmpire.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	@Test(priority=10)
	public void HarshvardhanaEmpire(){
		
		LOG.info("Harshvardhana Empire function running");
		HarshvardhanaEmpireFunction();
		LOG.info("Harshvardhana Empire function finished");
		
		driver.navigate().back();
	}
}
