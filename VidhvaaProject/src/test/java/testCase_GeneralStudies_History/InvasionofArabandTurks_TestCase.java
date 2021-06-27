package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.InvasionofArabandTurks;
public class InvasionofArabandTurks_TestCase extends CommonFunction{

	public void InvasionofArabandTurksFunction() {
		
		PageFactory.initElements(driver, InvasionofArabandTurks.class);
		InvasionofArabandTurks.clickInvasionofArabandTurks.click();
		LOG.info("Invasion of Arab and Turks clicked");
		
		InvasionofArabandTurks.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}

	@Test(priority=12)
	public void InvasionofArabandTurks(){
		
		LOG.info("Invasion of Arab and Turks function running");
		InvasionofArabandTurksFunction();
		LOG.info("Invasion of Arab and Turks function finished");
		
		driver.navigate().back();
	}
}
