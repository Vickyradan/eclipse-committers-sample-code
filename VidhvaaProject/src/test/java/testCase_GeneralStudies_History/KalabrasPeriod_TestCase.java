package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.KalabrasPeriod;
public class KalabrasPeriod_TestCase extends CommonFunction{

	public void KalabrasPeriodFunction() {
		
		PageFactory.initElements(driver, KalabrasPeriod.class);
		KalabrasPeriod.clickKalabrasPeriod.click();
		LOG.info("Kalabras Period clicked");
		
		KalabrasPeriod.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	@Test(priority=29)
	public void  KalabrasPeriod(){
		
		LOG.info("Kalabras Period function running");
		KalabrasPeriodFunction();
		LOG.info("Kalabras Period function finished");
		
		driver.navigate().back();
	}
}
