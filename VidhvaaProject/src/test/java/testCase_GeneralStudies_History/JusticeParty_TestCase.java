package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.JusticeParty;
public class JusticeParty_TestCase extends CommonFunction{

	public  void JusticePartyFunction() {
		
		PageFactory.initElements(driver, JusticeParty.class);
		JusticeParty.clickJusticeParty.click();
		LOG.info("Justice Party clicked");
		
		JusticeParty.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	
	@Test(priority=33)
	public void  JusticeParty(){
		
		LOG.info("Justice Party function running");
		JusticePartyFunction();
		LOG.info("Justice Party function finished");
		
		driver.navigate().back();
	}
}
