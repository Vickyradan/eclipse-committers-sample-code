package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.VedicPeriod_PreVedicandPostVedicPeriod;
public class VedicPeriod_PreVedicandPostVedicPeriod_TestCase extends CommonFunction {

	
	
	public void VedicPeriod_PreVedicandPostVedicPeriodFunction() {
		
		PageFactory.initElements(driver, VedicPeriod_PreVedicandPostVedicPeriod.class);
		VedicPeriod_PreVedicandPostVedicPeriod.clickVedicPeriod_PreVedicandPostVedicPeriod.click();
		LOG.info("Vedic Period - Pre Vedic and Post Vedic Period clicked");
		
		VedicPeriod_PreVedicandPostVedicPeriod.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
	}
	
	@Test(priority=3)
	public void VedicPeriod_PreVedicandPostVedicPeriod(){
		LOG.info("Vedic Period - Pre Vedic and Post Vedic Period function running");
		VedicPeriod_PreVedicandPostVedicPeriodFunction();
		LOG.info("Vedic Period - Pre Vedic and Post Vedic Period function finished");
		
		driver.navigate().back();
	}
}
