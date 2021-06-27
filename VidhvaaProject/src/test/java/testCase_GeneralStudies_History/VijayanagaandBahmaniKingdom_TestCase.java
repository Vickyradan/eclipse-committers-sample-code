package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.VijayanagarandBahmaniKingdom;

public class VijayanagaandBahmaniKingdom_TestCase extends CommonFunction{

	public void VijayanagaandBahmaniKingdomFunction() {
		PageFactory.initElements(driver, VijayanagarandBahmaniKingdom.class);
		VijayanagarandBahmaniKingdom.clickVijayanagarandBahmaniKingdom.click();
		LOG.info("Vijayanagar and Bahmani Kingdom clicked");
		
		VijayanagarandBahmaniKingdom.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
	}
	
	@Test(priority=15)
	public void VijayanagaandBahmaniKingdom(){
		
		LOG.info("Vijayanagar and Bahmani Kingdom function running");
		VijayanagaandBahmaniKingdomFunction();
		LOG.info("Vijayanagar and Bahmani Kingdom function finished");
		
		driver.navigate().back();
	}
}
