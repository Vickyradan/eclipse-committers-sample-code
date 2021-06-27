package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.RiseofNationalLeaders;
public class RiseofNationalLeaders_TestCase extends CommonFunction{

	public void RiseofNationalLeadersFunction() {
		
		PageFactory.initElements(driver, RiseofNationalLeaders.class);
		RiseofNationalLeaders.clickRiseofNationalLeaders.click();
		LOG.info("Rise of National Leaders clicked");
		
		RiseofNationalLeaders.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	
	@Test(priority=24)
	public void  RiseofNationalLeaders(){
		
		LOG.info("Rise of National Leaders function running");
		RiseofNationalLeadersFunction();
		LOG.info("Rise of National Leaders function finished");
		
		driver.navigate().back();
	}
}
