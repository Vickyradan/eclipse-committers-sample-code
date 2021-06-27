package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.DelhiSultanate;
public class DelhiSultanate_TestCase extends CommonFunction{

	public void DelhiSultanateFunction() {
		PageFactory.initElements(driver, DelhiSultanate.class);
		DelhiSultanate.clickDelhiSultanate.click();
		LOG.info("Delhi Sultanate clicked");
		
		DelhiSultanate.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
	}
	

	@Test(priority=13)
	public void DelhiSultanate(){
		
		LOG.info("Delhi Sultanate function running");
		DelhiSultanateFunction();
		LOG.info("Delhi Sultanate function finished");
		
		driver.navigate().back();
	}
}
